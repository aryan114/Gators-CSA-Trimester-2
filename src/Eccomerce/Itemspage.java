package Eccomerce;

import Sports.Sports;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Itemspage extends JFrame {
    private JTextField itementry = new JTextField();
    private JButton search = new JButton();
    private JLabel results = new JLabel();

    public Itemspage() {
        getContentPane().setBackground(Color.WHITE);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(300,300, 1300,400);
        getContentPane().setLayout(null);

        itementry.setForeground(Color.black);
        itementry.setHorizontalAlignment(SwingConstants.CENTER);
        itementry.setText("What item do you want to buy?");
        itementry.setBounds(5,10,500,100);
        getContentPane().add(itementry);

        search.setBounds(520,10,700,100);
        search.setForeground(Color.black);
        search.setBackground(Color.white);
        search.setText("search");
        getContentPane().add(search);

        results.setBounds(500,120,500,100);
        results.setForeground(Color.BLACK);
        results.setBackground(Color.WHITE);
        getContentPane().add(results);

        search.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                results.setText("You searched for: "+ itementry.getText());
            }
        });
    }

    public static void main(String[] args) {
        Itemspage menu = new Itemspage();
        menu.setTitle("Welcome to the Ecommerce Store!");
        menu.setVisible(true);
    }
}
