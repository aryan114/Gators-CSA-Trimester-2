//Can we get rid of this file since it can't run the SnakeGame?

package MainMenu;
// Made by Aryan Amberkar, taken with help from previous project
//Gators Image from Aryan, added to JFrame by Pranav
//This file uses the JMenuBar method to display options

import javax.swing.*;

import Eccomerce.Itemspage;
import Snake.Snake;
import Sports.Sports;
import LoginSystem.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;


import java.awt.*;

public class MainMenu extends JFrame {

    private static final long serialVersionUID = 1L;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                MainMenu Gators = new MainMenu();
                Gators.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public MainMenu() throws IOException {

        // Adding Gators logo to main menu
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        JLabel image = new JLabel();
        java.awt.Image gators = new ImageIcon("GatorsImage.png").getImage();
        image.setIcon(new ImageIcon(gators));
        image.setBounds(377, 111, 128, 128);
        Container GatorLogo = getContentPane();
        GatorLogo.setBackground(new Color(4, 106, 56));
        GatorLogo.add(image);
        setContentPane(new JLabel(new ImageIcon("D:\\Java Projects\\out\\production\\TheGators-Trimester2-CSA\\src\\Images\\GatorsImage.png")));



        // Adding menu bars to the main menu
        JMenuBar projects = new JMenuBar();
        setJMenuBar(projects);


        JMenu labs = new JMenu("Projects");
        projects.add(labs);

        JMenuItem Sports = new JMenuItem("Sports Simulator");
            Sports.addActionListener(e -> {
            Sports frame = new Sports();
            frame.setVisible(true);
        });
        labs.add(Sports);

        JMenuItem LoginStuff = new JMenuItem("Login");
        LoginStuff.addActionListener(e -> {
            Login frame = new Login();
            frame.setVisible(true);
        });
        labs.add(LoginStuff);

        JMenuItem Ecommerce = new JMenuItem("Ecommerce Store");
        Ecommerce.addActionListener(e ->  {
            Itemspage frame = new Itemspage();
            frame.setVisible(true);
        });
        labs.add(Ecommerce);
/*
        JMenuItem Snakegame = new JMenuItem("Snake Game");
        Snakegame.addActionListener(e ->  {
            Snake frame = new Snake();
            frame.setVisible(true);
        });
        labs.add(Snakegame);
        
 */

        //JMenuItem SnakeGame = new JMenuItem("Snake Game");
        //SnakeGame.addActionListener(e ->  {
            //Snake.SnakeFram frame = new Snake();
            //frame.setVisible(true);
                }
                //);

    }

