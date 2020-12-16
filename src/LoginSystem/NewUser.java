package LoginSystem;

import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;

public class NewUser extends JFrame {

    private JLabel unamelabel = new JLabel();
    private JLabel passlabel = new JLabel();
    private JTextField unameentry = new JTextField();
    private JPasswordField passentry = new JPasswordField();


    public NewUser(){
        getContentPane().setBackground(Color.LIGHT_GRAY);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(300,300,1300,400);
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

        unameentry.setBounds(520,25,700,75);
        unameentry.setForeground(Color.pink);
        unameentry.setFont(new Font("Lucida Grande", Font.BOLD,40));
        getContentPane().add(unameentry);

        passentry.setBounds(520,140,700,75);
        passentry.setForeground(Color.pink);
        passentry.setFont(new Font("Lucida Grande", Font.BOLD,40));
        getContentPane().add(passentry);

        JButton newuserbutton = new JButton("Create New User");
        newuserbutton.setBounds(520,270,700,75);
        newuserbutton.setForeground(Color.BLACK);
        newuserbutton.setBackground(Color.ORANGE);
        newuserbutton.setBorder(new MatteBorder(7,7,7,7,Color.WHITE));
        newuserbutton.setFont(new Font("Lucida Grande", Font.BOLD,40));
        getContentPane().add(newuserbutton);
    }

    public static void main(String[] args) {
        NewUser frame = new NewUser();
        frame.setTitle("Create a New User Account");
        frame.setVisible(true);
    }
}
