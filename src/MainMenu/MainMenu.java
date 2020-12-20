package MainMenu;
// Made by Aryan Amberkar, taken with help from previous project

import javax.swing.*;
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

    }
}
