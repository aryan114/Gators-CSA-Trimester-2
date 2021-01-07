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


                while (true) {
                    if (teamOne.contains("ravens")) {
                        int teamUno = 25;
                    } else if (teamOne.contains("steelers")) {
                        int teamUno = 20;
                    } else if (teamOne.contains("browns")) {
                        int teamUno = 17;
                    } else if (teamOne.contains("bengals")) {
                        int teamUno = 6;
                    }
                }

                if (teamTwo.contains("ravens")) {
                     teamDos = 25;
                }
                else if (teamTwo.contains("steelers")) {
                     teamDos = 20;
                    
                }
                else if (teamOne.contains("browns")) {
                     teamUno = 17;
                    
                }
                else if (teamTwo.contains("browns")) {
                     teamDos = 17;
                    
                }
                else if (teamOne.contains("bengals")) {
                     teamUno = 6;
                    
                }
                else if (teamTwo.contains("bengals")) {
                     teamDos = 6;
                    
                }
                else if (teamOne.contains("patriots")) {
                     teamUno = 19;
                    
                }
                else if (teamTwo.contains("patriots")) {
                     teamDos = 19;
                    
                }
                else if (teamOne.contains("bills")) {
                     teamUno = 22;
                    
                }
                else if (teamTwo.contains("bills")) {
                     teamDos = 22;
                    
                }
                else if (teamOne.contains("dolphins")) {
                     teamUno = 15;
                    
                }
                else if (teamTwo.contains("dolphins")) {
                     teamDos = 15;
                    
                }
                else if (teamOne.contains("jets")) {
                     teamUno = 9;
                    
                }
                else if (teamTwo.contains("jets")) {
                     teamDos = 9;
                    
                }
                else if (teamOne.contains("chiefs")) {
                     teamUno = 29;
                    
                }
                else if (teamTwo.contains("chiefs")) {
                     teamDos = 29;
                    
                }
                else if (teamOne.contains("chargers")) {
                     teamUno = 12;
                    
                }
                else if (teamTwo.contains("chargers")) {
                     teamDos = 12;
                    
                }
                else if (teamOne.contains("raiders")) {
                     teamUno = 15;
                    
                }
                else if (teamTwo.contains("raiders")) {
                     teamDos = 15;
                    
                }
                else if (teamOne.contains("broncos")) {
                     teamUno = 12;
                    
                }
                else if (teamTwo.contains("broncos")) {
                     teamDos = 12;
                    
                }
                else if (teamOne.contains("titans")) {
                     teamUno = 22;
                    
                }
                else if (teamTwo.contains("titans")) {
                     teamDos = 22;
                    
                }
                else if (teamOne.contains("colts")) {
                     teamUno = 18;
                    
                }
                else if (teamTwo.contains("colts")) {
                     teamDos = 18;
                    
                }
                else if (teamOne.contains("texans")) {
                     teamUno = 16;
                    
                }
                else if (teamTwo.contains("texans")) {
                     teamDos = 16;
                    
                }
                else if (teamOne.contains("jaguars")) {
                     teamUno = 7;
                    
                }
                else if (teamTwo.contains("jaguars")) {
                     teamDos = 7;
                    
                }
                else if (teamOne.contains("packers")) {
                     teamUno = 27;
                    
                }
                else if (teamTwo.contains("packers")) {
                     teamDos = 27;
                    
                }
                else if (teamOne.contains("bears")) {
                     teamUno = 16;
                    
                }
                else if (teamTwo.contains("bears")) {
                     teamDos = 16;
                    
                }
                else if (teamOne.contains("vikings")) {
                     teamUno = 18;
                    
                }
                else if (teamTwo.contains("vikings")) {
                     teamDos = 18;
                    
                }
                else if (teamOne.contains("lions")) {
                     teamUno = 8;
                    
                }
                else if (teamTwo.contains("lions")) {
                     teamDos = 8;
                    
                }
                else if (teamOne.contains("49ers")) {
                     teamUno = 21;
                    
                }
                else if (teamTwo.contains("49ers")) {
                     teamDos = 21;
                    
                }
                else if (teamOne.contains("seahawks")) {
                     teamUno = 24;
                    
                }
                else if (teamTwo.contains("seahawks")) {
                     teamDos = 24;
                    
                }
                else if (teamOne.contains("cardinals")) {
                     teamUno = 13;
                    
                }
                else if (teamTwo.contains("cardinals")) {
                     teamDos = 13;
                    
                }
                else if (teamOne.contains("rams")) {
                     teamUno = 19;
                    
                }
                else if (teamTwo.contains("rams")) {
                     teamDos = 19;
                    
                }
                else if (teamOne.contains("sas")) {
                     teamUno = 25;
                    
                }
                else if (teamTwo.contains("sas")) {
                     teamDos = 25;
                    
                }
                else if (teamOne.contains("panthers")) {
                     teamUno = 10;
                    
                }
                else if (teamTwo.contains("panthers")) {
                     teamDos = 10;
                    
                }
                else if (teamOne.contains("buccaneers")) {
                     teamUno = 18;
                    
                }
                else if (teamTwo.contains("buccaneers")) {
                     teamDos = 18;
                    
                }
                else if (teamOne.contains("falcons")) {
                     teamUno = 11;
                    
                }
                else if (teamTwo.contains("falcons")) {
                     teamDos = 11;
                    
                }
                else if (teamOne.contains("Washington Football Team")) {
                     teamUno = 10;
                    
                }
                else if (teamTwo.contains("Washington Football Team")) {
                     teamDos = 10;
                    
                }
                else if (teamOne.contains("giants")) {
                     teamUno = 10;
                    
                }
                else if (teamTwo.contains("giants")) {
                     teamDos = 10;
                    
                }
                else if (teamOne.contains("cowboys")) {
                     teamUno = 14;
                    
                }
                else if (teamTwo.contains("cowboys")) {
                     teamDos = 14;
                    
                }
                else if (teamOne.contains("eagles")) {
                     teamUno = 13;
                    
                }
                else if (teamTwo.contains("eagles")) {
                     teamDos = 13;
                    
                }


 
            }

        });
    }

    public static void main(String[] args) {
        Sports menu = new Sports();
        menu.setTitle("Welcome to the Sports Simulation");
        menu.setVisible(true);
    }

}