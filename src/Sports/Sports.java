package Sports;
// Made by Aryan Amberkar

import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sports extends JFrame {
    private JLabel team1 = new JLabel();
    private JLabel team2 = new JLabel();
    private JButton calculate = new JButton();
    private JTextField team1entry = new JTextField();
    private JTextField team2entry = new JTextField();

    public Sports() {
        getContentPane().setBackground(Color.CYAN);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(300,300, 1300,400);
        getContentPane().setLayout(null);

        team1.setForeground(Color.white);
        team2.setForeground(Color.white);
        team1.setHorizontalAlignment(SwingConstants.CENTER);
        team2.setHorizontalAlignment(SwingConstants.CENTER);
        team1.setText("Enter your first team: ");
        team2.setText("Enter your second team: ");
        team1.setBounds(5,10,500,100);
        team2.setBounds(5,105,500,100);
        getContentPane().add(team1);
        getContentPane().add(team2);

        team1entry.setBounds(750,10,500,100);
        team1entry.setForeground(Color.BLACK);
        getContentPane().add(team1entry);

        team2entry.setBounds(750,120,500,100);
        team2entry.setForeground(Color.BLACK);
        getContentPane().add(team2entry);

        calculate.setBounds(520,270,700,75);
        calculate.setForeground(Color.blue);
        calculate.setBackground(Color.black);
        getContentPane().add(calculate);
    }

    public static void main(String[] args) {
        Sports menu = new Sports();
        menu.setTitle("Welcome to the Sports Simulation");
        menu.setVisible(true);
    }

}