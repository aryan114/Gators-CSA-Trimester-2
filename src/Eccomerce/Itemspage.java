package Eccomerce;

import Sports.Sports;
//
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;
//
public class Itemspage extends JFrame {
    private JTextField itementry = new JTextField();
    private JButton search = new JButton();
    private JLabel results = new JLabel();
    private JButton checkout = new JButton();

    String [] items = new String[]{"Apples", "Bannanas"};
    String [] price = new String[]{"$1.99", "$2.99"};
    List<String> arritems = Arrays.asList(items);
    //double doubleitemprice = Double.parseDouble(itemprice);
    int index;
    String itemprice;

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

        checkout.setBounds(520,300,700,100);
        checkout.setForeground(Color.black);
        checkout.setBackground(Color.white);
        checkout.setText("");
        getContentPane().add(checkout);
        checkout.setVisible(false);

        results.setBounds(500,120,500,100);
        results.setForeground(Color.BLACK);
        results.setBackground(Color.WHITE);
        getContentPane().add(results);

        search.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                results.setText("You searched for: "+ itementry.getText());
                if(arritems.contains(itementry.getText())){
                    index = arritems.indexOf(itementry.getText());
                    itemprice = price[index];
                    checkout.setVisible(true);
                    System.out.println(itementry.getText());
                    checkout.setText(itementry.getText() + " " + itemprice);
                }
                else{
                    checkout.setVisible(true);
                    checkout.setText("Item Not In Stock");
                }
            }
        });
    }

    public static void main(String[] args) {
        Itemspage menu = new Itemspage();
        menu.setTitle("Welcome to the Ecommerce Store!");
        menu.setVisible(true);
    }
}
