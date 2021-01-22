package Snake;
/*
import LoginSystem.CredentialStore;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.document.*;
import com.amazonaws.services.dynamodbv2.document.spec.DeleteItemSpec;
import com.amazonaws.services.dynamodbv2.document.spec.QuerySpec;
import com.amazonaws.services.dynamodbv2.document.utils.ValueMap;
import java.util.*;
import java.util.HashMap;
import java.util.Iterator;


public class SnakeScoreStore {

    public static class SnakeScoreStoreSend {
        private static Snake.SnakeScoreStore single_instance = null;
        private static HashMap<String, String> snakeScore = null;


        //creates a singleton class to store the Hashmap which is going to be accessible by all the files (if called on)
        private SnakeScoreStoreSend() {
            snakeScore = new HashMap();
        }

        public static Snake.SnakeScoreStore getInstance() { //Setting up the singleton class
            if (single_instance == null) {
                single_instance = new Snake.SnakeScoreStore();
            }
            return single_instance;
        }

        public HashMap<String, String> getUserCredentials() {
            return snakeScore;
        }


        //These are the setters and getters for the hashmap. Since this file has data, it also has methods to control that data, like adding and removing stuff from hashmap
        public void sendScore(HashMap<String, String> userCredentials) {
            this.snakeScore = userCredentials;
        }

        public void addUserCredentials(int score) {
            snakeScore.put(score);
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
                    .withValueMap(new ValueMap().withString(":v_username", String.valueOf(snakeScore)));

            ItemCollection<QueryOutcome> items = table.query(spec);

            //System.out.println("\nfindRepliesForAThread results:");

            Iterator<Item> iterator = items.iterator();

            while (iterator.hasNext()) {
                System.out.println(iterator.next().toJSONPretty());
            }

        }

    }
}
/*