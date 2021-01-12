package Lecture;
// Made by Aryan Amberkar
// This website is referenced for help: https://www.javatpoint.com/palindrome-program-in-java

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;


public class Palindrome extends JFrame {
    private JLabel userEntry;
    private JLabel isPaliOrNo;
    private JLabel enter;

    public Palindrome() {
        getContentPane().setBackground(new Color(0,204,255));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(300,300, 1300,400);
        getContentPane().setLayout(null);

        enter.setForeground(Color.white);
        enter.setHorizontalAlignment(SwingConstants.CENTER);
        enter.setFont(new Font("Times New Roman", Font.BOLD, 45));
        enter.setText("Enter Your String: ");
        enter.setBounds(45,200,500,100);
        getContentPane().add(enter);

        isPaliOrNo.setForeground(Color.WHITE);
        isPaliOrNo.setHorizontalAlignment(SwingConstants.CENTER);
        isPaliOrNo.setFont(new Font("Times New Roman" , Font.BOLD, 45));
        isPaliOrNo.setBounds(250,650,700,100);
        isPaliOrNo.setText("");
        getContentPane().add(isPaliOrNo);

        userEntry.setBounds(750,200,500,100);
        userEntry.setForeground(Color.BLACK);
        getContentPane().add(userEntry);

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
        } else {
            isPaliOrNo.setText("Not a palindrome");
        }
        return palindrome;
    }

    public static void main(String[] args) {
        Palindrome menu = new Palindrome();
        menu.setTitle("Welcome to the Palindrome Checker!");
        menu.setVisible(true);
    }



}
