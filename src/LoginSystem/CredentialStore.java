//Made by Pranav Kambhampati



package LoginSystem;

import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.document.*;
import com.amazonaws.services.dynamodbv2.document.spec.DeleteItemSpec;
import com.amazonaws.services.dynamodbv2.document.spec.QuerySpec;
import com.amazonaws.services.dynamodbv2.document.utils.ValueMap;

import java.util.*;

public class CredentialStore {
    private static CredentialStore single_instance = null;
    private static HashMap<String, String> userCredentials = null;


    //creates a singleton class to store the Hashmap which is going to be accessible by all the files (if called on)
    private CredentialStore() {
        userCredentials = new HashMap();
    }
    public static CredentialStore getInstance() { //Setting up the singleton class
        if (single_instance == null) {
            single_instance = new CredentialStore();
        }
        return single_instance;
    }
    public HashMap<String, String> getUserCredentials() {
        return userCredentials;
    }



    //These are the setters and getters for the hashamp. Since this file has data, it also has methods to control that data, like adding and removing stuff from hashmap
    public void setUserCredentials(HashMap<String, String> userCredentials) {
        this.userCredentials = userCredentials;
    }

    public void addUserCredentials(String username, String password) {
        userCredentials.put(username, password);
        //Connecting to DynamoDB using a service endpoint url
        AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard()
                .withEndpointConfiguration(new AwsClientBuilder.EndpointConfiguration("dynamodb.us-east-2.amazonaws.com", "us-east-2"))
                .build();
//"http://localhost:8000", "us-east-2"

        DynamoDB dynamoDB = new DynamoDB(client);
        //Creating an object of the client so that it can be used to get the table
        Table table = dynamoDB.getTable("Credentials");
        //Creating an object of the table so that operations can be performed on it.
        QuerySpec spec = new QuerySpec().withKeyConditionExpression("userName= :v_username")
                .withValueMap(new ValueMap().withString(":v_username", username));

        ItemCollection<QueryOutcome> items = table.query(spec);

        //System.out.println("\nfindRepliesForAThread results:");

        Iterator<Item> iterator = items.iterator();

        while (iterator.hasNext()) {
           System.out.println(iterator.next().toJSONPretty());
        }







        if(items.getAccumulatedItemCount()==0){//How to check if the username equals null? I'm using the get method b/c items is an arraylist right?
            System.out.println("Adding a new item..."); //Indication that new items are being added
            PutItemOutcome outcome = table
                    .putItem(new Item().withPrimaryKey("userName", username).with( "password", password));//adds the items
            //.withMap("UserCredentials", userCredentials));
            System.out.println("PutItem succeeded");
        }else{
            System.out.println("Duplicate Usernames");
        }




    }

    public void removeUserCredentials(String userName, String password){
        userCredentials.remove(userName, password);
        AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard()
                .withEndpointConfiguration(new AwsClientBuilder.EndpointConfiguration("dynamodb.us-east-2.amazonaws.com", "us-east-2"))
                .build();//Connects to DynamoDB using service endpoint url
        DynamoDB dynamoDB = new DynamoDB(client);//Creates client
        Table table = dynamoDB.getTable("Credentials");//Gets the table using the client
        DeleteItemSpec deleteItemSpec = new DeleteItemSpec()
                .withPrimaryKey(new PrimaryKey("userName", userName,"password",password));

        table.deleteItem(deleteItemSpec);//deletes the item based on specified partition and sort key
        System.out.println("Credentials deleted");


    }

    public String getUserPassword(String userName) {
        return userCredentials.get(userName);
    }
}
