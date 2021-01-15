package Sports;
// Made by Aryan Amberkar


import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SportsMenu extends JFrame {
    public SportsMenu() {
        getContentPane().setBackground(Color.LIGHT_GRAY);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(150, 25, 1000, 1000);
        getContentPane().setLayout(null);

        JButton football = new JButton("Football Simulation");
        football.setBounds(125,125,350,350);
        football.setForeground(Color.BLACK);
        football.setBackground(Color.ORANGE);
        football.setBorder(new MatteBorder(7,7,7,7,Color.WHITE));
        football.setFont(new Font("Lucida Grande", Font.BOLD,25));
        getContentPane().add(football);
        football.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Sports.main(null);
            }
        });

        JButton basketball = new JButton("Basketball Simulation");
        basketball.setBounds(500,125,350,350);
        basketball.setForeground(Color.BLACK);
        basketball.setBackground(Color.ORANGE);
        basketball.setBorder(new MatteBorder(7,7,7,7,Color.WHITE));
        basketball.setFont(new Font("Lucida Grande", Font.BOLD,25));
        getContentPane().add(basketball);
        basketball.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SportsBasketball.main(null);
            }
        });

        JButton baseball = new JButton("Baseball Simulation");
        baseball.setBounds(125,500,350,350);
        baseball.setForeground(Color.BLACK);
        baseball.setBackground(Color.ORANGE);
        baseball.setBorder(new MatteBorder(7,7,7,7,Color.WHITE));
        baseball.setFont(new Font("Lucida Grande", Font.BOLD,25));
        getContentPane().add(baseball);
        baseball.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SportsBaseball.main(null);
            }
        });

    }

    public static void main(String[] args) {
        SportsMenu frame = new SportsMenu();
        frame.setTitle("Sports Main Menu");
        frame.setVisible(true);
    }
}
