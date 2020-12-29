//Made by Pranav Kambhampati
//File Works, but need to connect to AWS DynamoDB (Sending credentials to table)


package LoginSystem;

import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.PutItemOutcome;
import com.amazonaws.services.dynamodbv2.document.Table;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class CredentialStore {
    private static CredentialStore single_instance = null;
    private static HashMap<String, String> userCredentials = null;
    //Stack<String> usernames = new Stack<String>();
    //Queue<String> passwords = new LinkedList<String>();

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
    /*
    public void addstackusername(String arg){
        usernames.add(arg);
        System.out.println(usernames);
    }
     */

    /*
    public void addqueuepassword(String arg){
        passwords.add(arg);
        System.out.println(passwords);
    }
     */


    //These are the setters and getters for the hashamp. Since this file has data, it also has methods to control that data, like adding and removing stuff from hashmap
    public void setUserCredentials(HashMap<String, String> userCredentials) {
        this.userCredentials = userCredentials;
    }

    public void addUserCredentials(String userName, String password) {
        userCredentials.put(userName, password);
        AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard()
                .withEndpointConfiguration(new AwsClientBuilder.EndpointConfiguration("dynamodb.us-east-2.amazonaws.com", "us-east-2"))
                .build();
//"http://localhost:8000", "us-east-2"

        DynamoDB dynamoDB = new DynamoDB(client);

        Table table = dynamoDB.getTable("Credentials");

        try {
            System.out.println("Adding a new item...");
            PutItemOutcome outcome = table
                    .putItem(new Item().withPrimaryKey("userName", userName).with( "password", password));
            //.withMap("UserCredentials", userCredentials));
            System.out.println("PutItem succeeded:\n" + outcome.getPutItemResult());

        }
        catch (Exception e) {
            System.err.println("Unable to add item: " + userName + " " + password);
            System.err.println(e.getMessage());
        }
    }

    public void removeUserCredentials(String userName, String password){
        userCredentials.remove(userName, password);
    }

    public String getUserPassword(String userName) {
        return userCredentials.get(userName);
    }
    
}
