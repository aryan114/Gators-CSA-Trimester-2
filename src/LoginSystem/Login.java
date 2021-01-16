//Made by Pranav Kambhampati
//File Works

package LoginSystem;

import MainMenu.MainMenuButtons;

import com.amazonaws.client.builder.AdvancedConfig;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.document.*;
import com.amazonaws.services.dynamodbv2.document.spec.QuerySpec;
import com.amazonaws.services.dynamodbv2.document.utils.ValueMap;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.GetItemRequest;
import com.amazonaws.services.dynamodbv2.model.GetItemResult;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.ItemCollection;
import com.amazonaws.services.dynamodbv2.document.Page;
import com.amazonaws.services.dynamodbv2.document.QueryOutcome;
import com.amazonaws.services.dynamodbv2.document.Table;
import com.amazonaws.services.dynamodbv2.document.spec.QuerySpec;
import com.amazonaws.services.dynamodbv2.document.utils.ValueMap;

import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class Login extends JFrame {
    private JLabel unamelabel = new JLabel();
    private JLabel passlabel = new JLabel();
    private JLabel loginstatus = new JLabel();
    private JTextField unameentry = new JTextField();
    private JPasswordField passentry = new JPasswordField();

    CredentialStore login = CredentialStore.getInstance();

//Instead of using the SwingUI Designer, I'm hardcoding the UI so that it is also going to work for Night at the Museum's Flask Website
    public Login(){
        getContentPane().setBackground(Color.LIGHT_GRAY);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(300,300,1300,550);
        //To make this look better, I'm going to try setting an icon image later
        //setContentPane(new JLabel(new ImageIcon("C:\\Users\\Pranav\\Downloads\\coding4kidspp.png")));
        //setSize(1300,550);

//Creating the Username: and Password: JLabels
        getContentPane().setLayout(null);
        unamelabel.setForeground(Color.WHITE);//Will change colors later, when I'm trying to make it look aesthetically pleasing
        passlabel.setForeground(Color.WHITE);
        unamelabel.setFont(new Font("Lucida Grande", Font.BOLD, 75));//Same with font, will be replaced to something that looks more unique
        passlabel.setFont(new Font("Lucida Grande", Font.BOLD,75));
        unamelabel.setHorizontalAlignment(SwingConstants.CENTER);
        passlabel.setHorizontalAlignment(SwingConstants.CENTER);
        unamelabel.setText("Username: ");
        passlabel.setText("Password: ");
        unamelabel.setBounds(5,10,500,100);
        passlabel.setBounds(5,50,500,250);
        getContentPane().add(unamelabel);
        getContentPane().add(passlabel);
//Creating the loginstatus JLabel to indicate Login Status
        loginstatus.setForeground(Color.WHITE);
        loginstatus.setFont(new Font("Lucida Grande", Font.BOLD, 15));
        loginstatus.setHorizontalAlignment(SwingConstants.LEFT);
        loginstatus.setText(""); //Will be replaced with Login Message
        loginstatus.setBounds(5,250,500,20);
        getContentPane().add(loginstatus);
//To make it look better, I'm going to try making the text-entry boxes have curved corners

//Creating a JTextField for users to enter their credentials
        unameentry.setBounds(520,25,700,75);
        unameentry.setForeground(Color.pink);
        unameentry.setFont(new Font("Lucida Grande", Font.BOLD,40));
        getContentPane().add(unameentry);
//Creating a JPasswordField for users to enter their password when logging in
        passentry.setBounds(520,140,700,75);
        passentry.setForeground(Color.pink);
        passentry.setFont(new Font("Lucida Grande", Font.BOLD,40));
        getContentPane().add(passentry);

        JButton userdeletebutton = new JButton("Delete User");
        userdeletebutton.setBounds(875,385,345,75);
        userdeletebutton.setForeground(Color.BLACK);
        userdeletebutton.setBackground(Color.ORANGE);
        userdeletebutton.setBorder(new MatteBorder(7,7,7,7,Color.WHITE));
        userdeletebutton.setFont(new Font("Lucida Grande", Font.BOLD,40));
        getContentPane().add(userdeletebutton);
        //Event Based Programming: Waiting for a specific event to happen (buttonclick in this case)
        userdeletebutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DeleteUser.main(null);
            }
        });


        JButton loginbutton = new JButton("Login");
        loginbutton.setBounds(520,270,700,75);
        loginbutton.setForeground(Color.BLACK);
        loginbutton.setBackground(Color.ORANGE);
        loginbutton.setBorder(new MatteBorder(7,7,7,7,Color.WHITE));
        loginbutton.setFont(new Font("Lucida Grande", Font.BOLD,40));
        getContentPane().add(loginbutton);

        //Event Based Programming: Waiting for a specific event to happen (buttonclick in this case)
        loginbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = unameentry.getText();
                String password = passentry.getText();


                AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard()
                        .withEndpointConfiguration(new AwsClientBuilder.EndpointConfiguration("dynamodb.us-east-2.amazonaws.com", "us-east-2"))
                        .build();
                DynamoDB dynamoDB = new DynamoDB(client);
                Table table = dynamoDB.getTable("Credentials");

                QuerySpec spec = new QuerySpec().withKeyConditionExpression("userName= :v_username and password= :v_password")
                        .withValueMap(new ValueMap().withString(":v_username", username).withString(":v_password",password));

                ItemCollection<QueryOutcome> items = table.query(spec);

                //System.out.println("\nfindRepliesForAThread results:");

                Iterator<Item> iterator = items.iterator();


                while (iterator.hasNext()) {
                    //System.out.println(iterator.next());
                    System.out.println(iterator.next().toJSONPretty());
                }




                if (username.equals("coderwithswag") && password.equals("Legit")) {
                    loginstatus.setText("You're in!");
                    MainMenuButtons.main(null);
                    //Part of the sequence to opening the panels correctly. More in other areas of the code.
                    setVisible(false);
                } else {
                    loginstatus.setText("Wrong Credentials!");
                }
                if(items.getAccumulatedItemCount()>0){
                    loginstatus.setText("You're in!");
                    MainMenuButtons.main(null);
                    setVisible(false);
                }//login.getUserPassword(username)
                else if (username.equals("coderwithswag") && password.equals("Legit")){
                    loginstatus.setText("You're in!");
                    MainMenuButtons.main(null);
                    setVisible(false);
                }
                else {
                    loginstatus.setText("Wrong Credentials!");
                }
                //control.verifier(username, password);
            }
        });


//JButton is created to let users make a new user account - will pop open a new JFrame. No Functionality yet.
        JButton newuserbutton = new JButton("New User");
        newuserbutton.setBounds(520,385,345,75);
        newuserbutton.setForeground(Color.BLACK);
        newuserbutton.setBackground(Color.ORANGE);
        newuserbutton.setBorder(new MatteBorder(7,7,7,7,Color.WHITE));
        newuserbutton.setFont(new Font("Lucida Grande", Font.BOLD,40));
        getContentPane().add(newuserbutton);

        //Event Based Programming: Waiting for a specific event to happen (buttonclick in this case)
        newuserbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NewUser.main(null);
            }
        });
    }

//Creating JFrame
    public static void main(String[] args) {

        Login frame = new Login();
        frame.setTitle("Login To Your Account");
        frame.setVisible(true);
    }
}
