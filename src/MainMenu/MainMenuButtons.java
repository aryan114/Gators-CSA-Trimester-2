//Created by Pranav Kambhampati
//This file uses JButtons to allow the user to display options

package MainMenu;

import Eccomerce.Itemspage;
import LoginSystem.Login;
import LoginSystem.NewUser;
import Sports.Sports;

import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenuButtons extends JFrame {

    public MainMenuButtons(){
        getContentPane().setBackground(Color.LIGHT_GRAY);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(300,300,1000,1000);
        setContentPane(new JLabel(new ImageIcon("D:\\Java Projects\\out\\production\\TheGators-Trimester2-CSA\\src\\Images\\GatorsImage.png")));
        //Adding an image to the background to make the project more customized to our group
        
        getContentPane().setLayout(null);
        
        JButton ecommerce = new JButton("E-Commerce");
        ecommerce.setBounds(125,125,350,350);
        ecommerce.setForeground(Color.BLACK);
        ecommerce.setBackground(Color.ORANGE);
        ecommerce.setBorder(new MatteBorder(7,7,7,7,Color.WHITE));
        ecommerce.setFont(new Font("Lucida Grande", Font.BOLD,40));
        getContentPane().add(ecommerce);
        ecommerce.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Itemspage.main(null);
            }
        });

        
        JButton snakegame = new JButton("Snake Game");
        snakegame.setBounds(525,125,350,350);
        snakegame.setForeground(Color.BLACK);
        snakegame.setBackground(Color.ORANGE);
        snakegame.setBorder(new MatteBorder(7,7,7,7,Color.WHITE));
        snakegame.setFont(new Font("Lucida Grande", Font.BOLD,40));
        getContentPane().add(snakegame);
       /*
        snakegame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NewUser.main(null);
            }
        });
        */
        //What is the actual snake game file?
        
        JButton sportssim = new JButton("Sports Sim");
        sportssim.setBounds(325,525,350,350);
        sportssim.setForeground(Color.BLACK);
        sportssim.setBackground(Color.ORANGE);
        sportssim.setBorder(new MatteBorder(7,7,7,7,Color.WHITE));
        sportssim.setFont(new Font("Lucida Grande", Font.BOLD,40));
        getContentPane().add(sportssim);
        sportssim.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Sports.main(null);
            }
        });
    }

    public static void main(String[] args) {
        MainMenuButtons frame = new MainMenuButtons();
        frame.setTitle("Main Menu");
        frame.setVisible(true);
    }
}
