package Lecture;
// Made by Aryan Amberkar
// This website is referenced for help: https://www.javatpoint.com/palindrome-program-in-java

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Palindrome extends JFrame {
    private JTextField userEntry = new JTextField();
    private JLabel isPaliOrNo = new JLabel();
    private JLabel enterString = new JLabel();
    private JLabel challenge = new JLabel();
    int tCurrency;
    private JLabel currency = new JLabel();

    public Palindrome() {
        getContentPane().setBackground(new Color(0,204,255));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(300,300, 1300,400);
        getContentPane().setLayout(null);

        enterString.setForeground(Color.WHITE);
        enterString.setHorizontalAlignment(SwingConstants.CENTER);
        enterString.setFont(new Font("Times New Roman", Font.BOLD, 45));
        enterString.setText("Enter Your String: ");
        enterString.setBounds(45,200,500,100);
        getContentPane().add(enterString);

        challenge.setForeground(Color.WHITE);
        challenge.setHorizontalAlignment(SwingConstants.CENTER);
        challenge.setFont(new Font("Times New Roman", Font.BOLD, 45));
        challenge.setText("+10 for a palindrome ");
        challenge.setBounds(45,100,500,100);
        getContentPane().add(challenge);

        isPaliOrNo.setForeground(Color.WHITE);
        isPaliOrNo.setHorizontalAlignment(SwingConstants.CENTER);
        isPaliOrNo.setFont(new Font("Times New Roman" , Font.BOLD, 45));
        isPaliOrNo.setBounds(250,650,700,100);
        isPaliOrNo.setText("");
        getContentPane().add(isPaliOrNo);

        userEntry.setBounds(750,200,500,100);
        userEntry.setForeground(Color.BLACK);
        getContentPane().add(userEntry);

        currency.setForeground(Color.WHITE);
        currency.setHorizontalAlignment(SwingConstants.CENTER);
        currency.setFont(new Font("Times New Roman" , Font.BOLD, 45));
        currency.setBounds(250,800,700,100);
        currency.setText("Currency: 0 ");
        getContentPane().add(currency);

        JButton calculate = new JButton("Check!");
        calculate.setBounds(750,500,500,100);
        calculate.setForeground(Color.blue);
        calculate.setBackground(Color.black);
        getContentPane().add(calculate);

        calculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userEntry1 = userEntry.getText();
                checkPalindrome(userEntry1);
            }
        });
    }

    public String checkPalindrome(String userChoice) {
        int lengthofString = userChoice.length();
        String palindrome = "";
        for (int i = lengthofString - 1; i >= 0; i--) {
            palindrome = palindrome + userChoice.charAt(i);
        }
        if (palindrome.equals(userChoice)) {
            isPaliOrNo.setText("Is palindrome!");
            tCurrency +=10;
            currency.setText("Currency: " + tCurrency);
        } else {
            isPaliOrNo.setText("Not a palindrome");
            tCurrency -=10;
            currency.setText("Currency: " + tCurrency);
        }
        return palindrome;
    }

    public static void main(String[] args) {
        Palindrome menu = new Palindrome();
        menu.setTitle("Welcome to the Palindrome Checker!");
        menu.setVisible(true);
    }



}
