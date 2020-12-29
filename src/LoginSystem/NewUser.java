//Made by Pranav Kambhampati
//File Works, but need to connect to AWS DynamoDB (adding credentials to table)


package LoginSystem;

import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.PutItemOutcome;
import com.amazonaws.services.dynamodbv2.document.Table;
//import boto3;


import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewUser extends JFrame {

    private JLabel unamelabel = new JLabel();
    private JLabel passlabel = new JLabel();
    private JTextField unameentry = new JTextField();
    private JPasswordField passentry = new JPasswordField();

    //getting the hasmap from CredentialStore
    CredentialStore newuser = CredentialStore.getInstance();


    public NewUser(){
        getContentPane().setBackground(Color.LIGHT_GRAY);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(300,300,1300,400);
        getContentPane().setLayout(null);
//Creating labels on the JPanel
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
//Creating Username Entry Textfield
        unameentry.setBounds(520,25,700,75);
        unameentry.setForeground(Color.pink);
        unameentry.setFont(new Font("Lucida Grande", Font.BOLD,40));
        getContentPane().add(unameentry);

//Creating password entry Passwordfield
        passentry.setBounds(520,140,700,75);
        passentry.setForeground(Color.pink);
        passentry.setFont(new Font("Lucida Grande", Font.BOLD,40));
        getContentPane().add(passentry);
//Creating Button that makes the new user
        JButton newuserbutton = new JButton("Create New User");
        newuserbutton.setBounds(520,270,700,75);
        newuserbutton.setForeground(Color.BLACK);
        newuserbutton.setBackground(Color.ORANGE);
        newuserbutton.setBorder(new MatteBorder(7,7,7,7,Color.WHITE));
        newuserbutton.setFont(new Font("Lucida Grande", Font.BOLD,40));
        getContentPane().add(newuserbutton);

        //Event Based Programming: Waiting for a specific event to happen (buttonclick in this case)
        newuserbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usertemp = unameentry.getText();
                String passtemp = passentry.getText();
                newuser.addUserCredentials(usertemp, passtemp);
                //newuser.addstackusername(usertemp);
                //newuser.addqueuepassword(passtemp);
                setVisible(false);

                System.out.println("New User");



            }
        });
    }
//Creating JFrame with title
    public static void main(String[] args) {
        NewUser frame = new NewUser();
        frame.setTitle("Create a New User Account");
        frame.setVisible(true);




    }
}
