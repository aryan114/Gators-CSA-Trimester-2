package Sports;
// Made by Aryan Amberkar

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sports extends JFrame {
    private JLabel team1 = new JLabel();
    private JLabel team2 = new JLabel();
    private JLabel winner = new JLabel();
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
        
        winner.setForeground(Color.WHITE);
        winner.setHorizontalAlignment(SwingConstants.CENTER);
        winner.setBounds(520,360,700,100);
        winner.setText("Winner: ");
        getContentPane().add(winner);

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

        calculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String teamOne = team1entry.getText();
                String teamTwo = team2entry.getText();

                int teamUno;
                if (teamOne.contains("ravens")) {
                        teamUno = 25;
                    }
                    if (teamOne.contains("steelers")) {
                        teamUno = 20;
                    }
                 
                if (teamTwo.contains("steelers")) {
                    teamDos = 20;
                }
/*
                if (teamOne.contains("ravens")) {
                    teamUno = 25;
                    if (teamUno > teamDos) {
                        winner.setText(teamOne + " is the winner!");
                    }
                    else if (teamDos > teamUno) {
                        winner.setText(teamTwo + " is the winner!");
                    }
                }


                if (teamTwo.contains("ravens")) {
                     teamDos = 25;
                    if (teamUno > teamDos) {
                        winner.setText(teamOne + " is the winner!");
                    }
                    else if (teamDos > teamUno) {
                        winner.setText(teamTwo + " is the winner!");
                    }
                }
                if (teamOne.contains("steelers")) {
                     teamUno = 20;
                    if (teamUno > teamDos) {
                        winner.setText(teamOne + " is the winner!");
                    }
                    else if (teamDos > teamUno) {
                        winner.setText(teamTwo + " is the winner!");
                    }
                }
                if (teamTwo.contains("steelers")) {
                     teamDos = 20;
                    if (teamUno > teamDos) {
                        winner.setText(teamOne + " is the winner!");
                    }
                    else if (teamDos > teamUno) {
                        winner.setText(teamTwo + " is the winner!");
                    }
                }
                if (teamOne.contains("browns")) {
                     teamUno = 17;
                    if (teamUno > teamDos) {
                        winner.setText(teamOne + " is the winner!");
                    }
                    else if (teamDos > teamUno) {
                        winner.setText(teamTwo + " is the winner!");
                    }
                }
                if (teamTwo.contains("browns")) {
                     teamDos = 17;
                    if (teamUno > teamDos) {
                        winner.setText(teamOne + " is the winner!");
                    }
                    else if (teamDos > teamUno) {
                        winner.setText(teamTwo + " is the winner!");
                    }
                }
                if (teamOne.contains("bengals")) {
                     teamUno = 6;
                    if (teamUno > teamDos) {
                        winner.setText(teamOne + " is the winner!");
                    }
                    else if (teamDos > teamUno) {
                        winner.setText(teamTwo + " is the winner!");
                    }
                }
                if (teamTwo.contains("bengals")) {
                     teamDos = 6;
                    if (teamUno > teamDos) {
                        winner.setText(teamOne + " is the winner!");
                    }
                    else if (teamDos > teamUno) {
                        winner.setText(teamTwo + " is the winner!");
                    }
                }
                if (teamOne.contains("patriots")) {
                     teamUno = 19;
                    if (teamUno > teamDos) {
                        winner.setText(teamOne + " is the winner!");
                    }
                    else if (teamDos > teamUno) {
                        winner.setText(teamTwo + " is the winner!");
                    }
                }
                if (teamTwo.contains("patriots")) {
                     teamDos = 19;
                    if (teamUno > teamDos) {
                        winner.setText(teamOne + " is the winner!");
                    }
                    else if (teamDos > teamUno) {
                        winner.setText(teamTwo + " is the winner!");
                    }
                }
                if (teamOne.contains("bills")) {
                     teamUno = 22;
                    if (teamUno > teamDos) {
                        winner.setText(teamOne + " is the winner!");
                    }
                    else if (teamDos > teamUno) {
                        winner.setText(teamTwo + " is the winner!");
                    }
                }
                if (teamTwo.contains("bills")) {
                     teamDos = 22;
                    if (teamUno > teamDos) {
                        winner.setText(teamOne + " is the winner!");
                    }
                    else if (teamDos > teamUno) {
                        winner.setText(teamTwo + " is the winner!");
                    }
                }
                if (teamOne.contains("dolphins")) {
                     teamUno = 15;
                    if (teamUno > teamDos) {
                        winner.setText(teamOne + " is the winner!");
                    }
                    else if (teamDos > teamUno) {
                        winner.setText(teamTwo + " is the winner!");
                    }
                }
                if (teamTwo.contains("dolphins")) {
                     teamDos = 15;
                    if (teamUno > teamDos) {
                        winner.setText(teamOne + " is the winner!");
                    }
                    else if (teamDos > teamUno) {
                        winner.setText(teamTwo + " is the winner!");
                    }
                }
                if (teamOne.contains("jets")) {
                     teamUno = 9;
                    if (teamUno > teamDos) {
                        winner.setText(teamOne + " is the winner!");
                    }
                    else if (teamDos > teamUno) {
                        winner.setText(teamTwo + " is the winner!");
                    }
                }
                if (teamTwo.contains("jets")) {
                     teamDos = 9;
                    if (teamUno > teamDos) {
                        winner.setText(teamOne + " is the winner!");
                    }
                    else if (teamDos > teamUno) {
                        winner.setText(teamTwo + " is the winner!");
                    }
                }
                if (teamOne.contains("chiefs")) {
                     teamUno = 29;
                    if (teamUno > teamDos) {
                        winner.setText(teamOne + " is the winner!");
                    }
                    else if (teamDos > teamUno) {
                        winner.setText(teamTwo + " is the winner!");
                    }
                }
                if (teamTwo.contains("chiefs")) {
                     teamDos = 29;
                    if (teamUno > teamDos) {
                        winner.setText(teamOne + " is the winner!");
                    }
                    else if (teamDos > teamUno) {
                        winner.setText(teamTwo + " is the winner!");
                    }
                }
                if (teamOne.contains("chargers")) {
                     teamUno = 12;
                    if (teamUno > teamDos) {
                        winner.setText(teamOne + " is the winner!");
                    }
                    else if (teamDos > teamUno) {
                        winner.setText(teamTwo + " is the winner!");
                    }
                }
                if (teamTwo.contains("chargers")) {
                     teamDos = 12;
                    if (teamUno > teamDos) {
                        winner.setText(teamOne + " is the winner!");
                    }
                    else if (teamDos > teamUno) {
                        winner.setText(teamTwo + " is the winner!");
                    }
                }
                if (teamOne.contains("raiders")) {
                     teamUno = 15;
                    if (teamUno > teamDos) {
                        winner.setText(teamOne + " is the winner!");
                    }
                    else if (teamDos > teamUno) {
                        winner.setText(teamTwo + " is the winner!");
                    }
                }
                if (teamTwo.contains("raiders")) {
                     teamDos = 15;
                    if (teamUno > teamDos) {
                        winner.setText(teamOne + " is the winner!");
                    }
                    else if (teamDos > teamUno) {
                        winner.setText(teamTwo + " is the winner!");
                    }
                }
                if (teamOne.contains("broncos")) {
                     teamUno = 12;
                    if (teamUno > teamDos) {
                        winner.setText(teamOne + " is the winner!");
                    }
                    else if (teamDos > teamUno) {
                        winner.setText(teamTwo + " is the winner!");
                    }
                }
                if (teamTwo.contains("broncos")) {
                     teamDos = 12;
                    if (teamUno > teamDos) {
                        winner.setText(teamOne + " is the winner!");
                    }
                    else if (teamDos > teamUno) {
                        winner.setText(teamTwo + " is the winner!");
                    }
                }
                if (teamOne.contains("titans")) {
                     teamUno = 22;
                    if (teamUno > teamDos) {
                        winner.setText(teamOne + " is the winner!");
                    }
                    else if (teamDos > teamUno) {
                        winner.setText(teamTwo + " is the winner!");
                    }
                }
                if (teamTwo.contains("titans")) {
                     teamDos = 22;
                    if (teamUno > teamDos) {
                        winner.setText(teamOne + " is the winner!");
                    }
                    else if (teamDos > teamUno) {
                        winner.setText(teamTwo + " is the winner!");
                    }
                }
                if (teamOne.contains("colts")) {
                     teamUno = 18;
                    if (teamUno > teamDos) {
                        winner.setText(teamOne + " is the winner!");
                    }
                    else if (teamDos > teamUno) {
                        winner.setText(teamTwo + " is the winner!");
                    }
                }
                if (teamTwo.contains("colts")) {
                     teamDos = 18;
                    if (teamUno > teamDos) {
                        winner.setText(teamOne + " is the winner!");
                    }
                    else if (teamDos > teamUno) {
                        winner.setText(teamTwo + " is the winner!");
                    }
                }
                if (teamOne.contains("texans")) {
                     teamUno = 16;
                    if (teamUno > teamDos) {
                        winner.setText(teamOne + " is the winner!");
                    }
                    else if (teamDos > teamUno) {
                        winner.setText(teamTwo + " is the winner!");
                    }
                }
                if (teamTwo.contains("texans")) {
                     teamDos = 16;
                    if (teamUno > teamDos) {
                        winner.setText(teamOne + " is the winner!");
                    }
                    else if (teamDos > teamUno) {
                        winner.setText(teamTwo + " is the winner!");
                    }
                }
                if (teamOne.contains("jaguars")) {
                     teamUno = 7;
                    if (teamUno > teamDos) {
                        winner.setText(teamOne + " is the winner!");
                    }
                    else if (teamDos > teamUno) {
                        winner.setText(teamTwo + " is the winner!");
                    }
                }
                if (teamTwo.contains("jaguars")) {
                     teamDos = 7;
                    if (teamUno > teamDos) {
                        winner.setText(teamOne + " is the winner!");
                    }
                    else if (teamDos > teamUno) {
                        winner.setText(teamTwo + " is the winner!");
                    }
                }
                if (teamOne.contains("packers")) {
                     teamUno = 27;
                    if (teamUno > teamDos) {
                        winner.setText(teamOne + " is the winner!");
                    }
                    else if (teamDos > teamUno) {
                        winner.setText(teamTwo + " is the winner!");
                    }
                }
                if (teamTwo.contains("packers")) {
                     teamDos = 27;
                    if (teamUno > teamDos) {
                        winner.setText(teamOne + " is the winner!");
                    }
                    else if (teamDos > teamUno) {
                        winner.setText(teamTwo + " is the winner!");
                    }
                }
                if (teamOne.contains("bears")) {
                     teamUno = 16;
                    if (teamUno > teamDos) {
                        winner.setText(teamOne + " is the winner!");
                    }
                    else if (teamDos > teamUno) {
                        winner.setText(teamTwo + " is the winner!");
                    }
                }
                if (teamTwo.contains("bears")) {
                     teamDos = 16;
                    if (teamUno > teamDos) {
                        winner.setText(teamOne + " is the winner!");
                    }
                    else if (teamDos > teamUno) {
                        winner.setText(teamTwo + " is the winner!");
                    }
                }
                if (teamOne.contains("vikings")) {
                     teamUno = 18;
                    if (teamUno > teamDos) {
                        winner.setText(teamOne + " is the winner!");
                    }
                    else if (teamDos > teamUno) {
                        winner.setText(teamTwo + " is the winner!");
                    }
                }
                if (teamTwo.contains("vikings")) {
                     teamDos = 18;
                    if (teamUno > teamDos) {
                        winner.setText(teamOne + " is the winner!");
                    }
                    else if (teamDos > teamUno) {
                        winner.setText(teamTwo + " is the winner!");
                    }
                }
                if (teamOne.contains("lions")) {
                     teamUno = 8;
                    if (teamUno > teamDos) {
                        winner.setText(teamOne + " is the winner!");
                    }
                    else if (teamDos > teamUno) {
                        winner.setText(teamTwo + " is the winner!");
                    }
                }
                if (teamTwo.contains("lions")) {
                     teamDos = 8;
                    if (teamUno > teamDos) {
                        winner.setText(teamOne + " is the winner!");
                    }
                    else if (teamDos > teamUno) {
                        winner.setText(teamTwo + " is the winner!");
                    }
                }
                if (teamOne.contains("49ers")) {
                     teamUno = 21;
                    if (teamUno > teamDos) {
                        winner.setText(teamOne + " is the winner!");
                    }
                    else if (teamDos > teamUno) {
                        winner.setText(teamTwo + " is the winner!");
                    }
                }
                if (teamTwo.contains("49ers")) {
                     teamDos = 21;
                    if (teamUno > teamDos) {
                        winner.setText(teamOne + " is the winner!");
                    }
                    else if (teamDos > teamUno) {
                        winner.setText(teamTwo + " is the winner!");
                    }
                }
                if (teamOne.contains("seahawks")) {
                     teamUno = 24;
                    if (teamUno > teamDos) {
                        winner.setText(teamOne + " is the winner!");
                    }
                    else if (teamDos > teamUno) {
                        winner.setText(teamTwo + " is the winner!");
                    }
                }
                if (teamTwo.contains("seahawks")) {
                     teamDos = 24;
                    if (teamUno > teamDos) {
                        winner.setText(teamOne + " is the winner!");
                    }
                    else if (teamDos > teamUno) {
                        winner.setText(teamTwo + " is the winner!");
                    }
                }
                if (teamOne.contains("cardinals")) {
                     teamUno = 13;
                    if (teamUno > teamDos) {
                        winner.setText(teamOne + " is the winner!");
                    }
                    else if (teamDos > teamUno) {
                        winner.setText(teamTwo + " is the winner!");
                    }
                }
                if (teamTwo.contains("cardinals")) {
                     teamDos = 13;
                    if (teamUno > teamDos) {
                        winner.setText(teamOne + " is the winner!");
                    }
                    else if (teamDos > teamUno) {
                        winner.setText(teamTwo + " is the winner!");
                    }
                }
                if (teamOne.contains("rams")) {
                     teamUno = 19;
                    if (teamUno > teamDos) {
                        winner.setText(teamOne + " is the winner!");
                    }
                    else if (teamDos > teamUno) {
                        winner.setText(teamTwo + " is the winner!");
                    }
                }
                if (teamTwo.contains("rams")) {
                     teamDos = 19;
                    if (teamUno > teamDos) {
                        winner.setText(teamOne + " is the winner!");
                    }
                    else if (teamDos > teamUno) {
                        winner.setText(teamTwo + " is the winner!");
                    }
                }
                if (teamOne.contains("sas")) {
                     teamUno = 25;
                    if (teamUno > teamDos) {
                        winner.setText(teamOne + " is the winner!");
                    }
                    else if (teamDos > teamUno) {
                        winner.setText(teamTwo + " is the winner!");
                    }
                }
                if (teamTwo.contains("sas")) {
                     teamDos = 25;
                    if (teamUno > teamDos) {
                        winner.setText(teamOne + " is the winner!");
                    }
                    else if (teamDos > teamUno) {
                        winner.setText(teamTwo + " is the winner!");
                    }
                }
                if (teamOne.contains("panthers")) {
                     teamUno = 10;
                    if (teamUno > teamDos) {
                        winner.setText(teamOne + " is the winner!");
                    }
                    else if (teamDos > teamUno) {
                        winner.setText(teamTwo + " is the winner!");
                    }
                }
                if (teamTwo.contains("panthers")) {
                     teamDos = 10;
                    if (teamUno > teamDos) {
                        winner.setText(teamOne + " is the winner!");
                    }
                    else if (teamDos > teamUno) {
                        winner.setText(teamTwo + " is the winner!");
                    }
                }
                if (teamOne.contains("buccaneers")) {
                     teamUno = 18;
                    if (teamUno > teamDos) {
                        winner.setText(teamOne + " is the winner!");
                    }
                    else if (teamDos > teamUno) {
                        winner.setText(teamTwo + " is the winner!");
                    }
                }
                if (teamTwo.contains("buccaneers")) {
                     teamDos = 18;
                    if (teamUno > teamDos) {
                        winner.setText(teamOne + " is the winner!");
                    }
                    else if (teamDos > teamUno) {
                        winner.setText(teamTwo + " is the winner!");
                    }
                }
                if (teamOne.contains("falcons")) {
                     teamUno = 11;
                    if (teamUno > teamDos) {
                        winner.setText(teamOne + " is the winner!");
                    }
                    else if (teamDos > teamUno) {
                        winner.setText(teamTwo + " is the winner!");
                    }
                }
                if (teamTwo.contains("falcons")) {
                     teamDos = 11;
                    if (teamUno > teamDos) {
                        winner.setText(teamOne + " is the winner!");
                    }
                    else if (teamDos > teamUno) {
                        winner.setText(teamTwo + " is the winner!");
                    }
                }
                if (teamOne.contains("Washington Football Team")) {
                     teamUno = 10;
                    if (teamUno > teamDos) {
                        winner.setText(teamOne + " is the winner!");
                    }
                    else if (teamDos > teamUno) {
                        winner.setText(teamTwo + " is the winner!");
                    }
                }
                if (teamTwo.contains("Washington Football Team")) {
                     teamDos = 10;
                    if (teamUno > teamDos) {
                        winner.setText(teamOne + " is the winner!");
                    }
                    else if (teamDos > teamUno) {
                        winner.setText(teamTwo + " is the winner!");
                    }
                }
                if (teamOne.contains("giants")) {
                     teamUno = 10;
                    if (teamUno > teamDos) {
                        winner.setText(teamOne + " is the winner!");
                    }
                    else if (teamDos > teamUno) {
                        winner.setText(teamTwo + " is the winner!");
                    }
                }
                if (teamTwo.contains("giants")) {
                     teamDos = 10;
                    if (teamUno > teamDos) {
                        winner.setText(teamOne + " is the winner!");
                    }
                    else if (teamDos > teamUno) {
                        winner.setText(teamTwo + " is the winner!");
                    }
                }
                if (teamOne.contains("cowboys")) {
                     teamUno = 14;
                    if (teamUno > teamDos) {
                        winner.setText(teamOne + " is the winner!");
                    }
                    else if (teamDos > teamUno) {
                        winner.setText(teamTwo + " is the winner!");
                    }
                }
                if (teamTwo.contains("cowboys")) {
                     teamDos = 14;
                    if (teamUno > teamDos) {
                        winner.setText(teamOne + " is the winner!");
                    }
                    else if (teamDos > teamUno) {
                        winner.setText(teamTwo + " is the winner!");
                    }
                }
                if (teamOne.contains("eagles")) {
                     teamUno = 13;
                    if (teamUno > teamDos) {
                        winner.setText(teamOne + " is the winner!");
                    }
                    else if (teamDos > teamUno) {
                        winner.setText(teamTwo + " is the winner!");
                    }
                }
                if (teamTwo.contains("eagles")) {
                     teamDos = 13;
                    if (teamUno > teamDos) {
                        winner.setText(teamOne + " is the winner!");
                    }
                    else if (teamDos > teamUno) {
                        winner.setText(teamTwo + " is the winner!");
                    }
                }


 */
            }

        });
    }

    public static void main(String[] args) {
        Sports menu = new Sports();
        menu.setTitle("Welcome to the Sports Simulation");
        menu.setVisible(true);
    }

}