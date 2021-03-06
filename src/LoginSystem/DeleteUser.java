//Made by Pranav Kambhampati
//File Works


package LoginSystem;

import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeleteUser extends JFrame {
    private JLabel unamelabel = new JLabel();
    private JLabel passlabel = new JLabel();
    private JTextField unameentry = new JTextField();
    private JPasswordField passentry = new JPasswordField();
//Gets the common hashmap which stores the credentials
    CredentialStore deluser = CredentialStore.getInstance();


    public DeleteUser(){
        getContentPane().setBackground(Color.LIGHT_GRAY);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(300,300,1300,400);
        getContentPane().setLayout(null);
//Using same code from NewUser in order to maintain color unity
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
//creating a text field to enter username
        unameentry.setBounds(520,25,700,75);
        unameentry.setForeground(Color.pink);
        unameentry.setFont(new Font("Lucida Grande", Font.BOLD,40));
        getContentPane().add(unameentry);
//creating a password field to enter password
        passentry.setBounds(520,140,700,75);
        passentry.setForeground(Color.pink);
        passentry.setFont(new Font("Lucida Grande", Font.BOLD,40));
        getContentPane().add(passentry);
//Creates button for deleting the user
        JButton deluserbutton = new JButton("Delete Existing User");
        deluserbutton.setBounds(520,270,700,75);
        deluserbutton.setForeground(Color.BLACK);
        deluserbutton.setBackground(Color.ORANGE);
        deluserbutton.setBorder(new MatteBorder(7,7,7,7,Color.WHITE));
        deluserbutton.setFont(new Font("Lucida Grande", Font.BOLD,40));
        getContentPane().add(deluserbutton);

        //Event Based Programming: Waiting for a specific event to happen (buttonclick in this case)
        deluserbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usertemp = unameentry.getText();
                String passtemp = passentry.getText();
                deluser.removeUserCredentials(usertemp, passtemp);
                setVisible(false);
            }
        });
    }
//Creating the JFrame and setting title
    public static void main(String[] args) {
        DeleteUser frame = new DeleteUser();
        frame.setTitle("Remove a User Account");
        frame.setVisible(true);
    }
}
