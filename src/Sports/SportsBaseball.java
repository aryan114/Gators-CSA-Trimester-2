package Sports;

// Made by Aryan Amberkar

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SportsBaseball extends JFrame {
    private JLabel team1 = new JLabel();
    private JLabel team2 = new JLabel();
    private JLabel teamGuess = new JLabel();
    private JTextField team1entry = new JTextField();
    private JTextField team2entry = new JTextField();
    private JLabel currency = new JLabel();
    private JTextField teamUserThinksIsWinner = new JTextField();
    int totalCurrency;
    private JLabel winner = new JLabel();

    public SportsBaseball() {
        getContentPane().setBackground(new Color(0, 166,255, 220));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(300,300, 1300,400);
        getContentPane().setLayout(null);

        team1.setForeground(Color.white);
        team1.setHorizontalAlignment(SwingConstants.CENTER);
        team1.setFont(new Font("Times New Roman", Font.BOLD, 45));
        team1.setText("Enter your first team: ");
        team1.setBounds(45,200,500,100);
        getContentPane().add(team1);

        team2.setForeground(Color.white);
        team2.setHorizontalAlignment(SwingConstants.CENTER);
        team2.setFont(new Font("Times New Roman", Font.BOLD, 45));
        team2.setText("Enter your second team: ");
        team2.setBounds(65,350,500,100);
        getContentPane().add(team2);

        teamGuess.setForeground(Color.white);
        teamGuess.setHorizontalAlignment(SwingConstants.CENTER);
        teamGuess.setFont(new Font("Times New Roman", Font.BOLD, 27));
        teamGuess.setText("Enter team you think will win: ");
        teamGuess.setBounds(45,75,500,100);
        getContentPane().add(teamGuess);

        winner.setForeground(Color.WHITE);
        winner.setHorizontalAlignment(SwingConstants.CENTER);
        winner.setFont(new Font("Times New Roman" , Font.BOLD, 45));
        winner.setBounds(250,650,700,100);
        winner.setText("Winner: ");
        getContentPane().add(winner);

        currency.setForeground(Color.WHITE);
        currency.setHorizontalAlignment(SwingConstants.CENTER);
        currency.setFont(new Font("Times New Roman" , Font.BOLD, 45));
        currency.setBounds(250,800,700,100);
        currency.setText("Currency: ");
        getContentPane().add(currency);

        team1entry.setBounds(750,200,500,100);
        team1entry.setForeground(Color.BLACK);
        getContentPane().add(team1entry);

        team2entry.setBounds(750,350,500,100);
        team2entry.setForeground(Color.BLACK);
        getContentPane().add(team2entry);

        teamUserThinksIsWinner.setBounds(750,75,500,100);
        teamUserThinksIsWinner.setForeground(Color.BLACK);
        getContentPane().add(teamUserThinksIsWinner);


        JButton calculate = new JButton("Calculate the Winner");
        calculate.setBounds(750,500,500,100);
        calculate.setForeground(Color.blue);
        calculate.setBackground(Color.black);
        getContentPane().add(calculate);

        calculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userGuess = teamUserThinksIsWinner.getText();
                String teamOne = team1entry.getText();
                String teamTwo = team2entry.getText();
                int iFirstTeamWins = getWin(teamOne);
                int iSecondTeamWins = getWin(teamTwo);
                if (iFirstTeamWins > iSecondTeamWins) {
                    winner.setText("The " + teamOne + " are the winner!");
                    if (userGuess.equals(teamOne)) {
                        totalCurrency += 100;
                    } else {
                        totalCurrency -= 50;
                    }
                    currency.setText("Your currency is: " + totalCurrency);

                } else if (iSecondTeamWins > iFirstTeamWins) {
                    winner.setText("The " + teamTwo + " are the winner!");
                    if (userGuess.equals(teamTwo)) {
                        totalCurrency = totalCurrency + 100;
                    } else {
                        totalCurrency = totalCurrency - 50;
                    }
                    currency.setText("Your currency is: " + totalCurrency);

                } else if (iFirstTeamWins == iSecondTeamWins) {
                    String[] winnerOfGame = {teamOne, teamTwo};
                    Random random = new Random();
                    int randomTeam = random.nextInt(winnerOfGame.length);
                    String newWinner = winnerOfGame[randomTeam];

                    if (newWinner.equals(teamOne)) {
                        winner.setText("The " + teamOne + " are the winner!");
                        if (userGuess.equals(teamOne)) {
                            totalCurrency += 100;
                        } else {
                            totalCurrency -= 50;
                        }
                        currency.setText("Your currency is: " + totalCurrency);
                    }
                    if (newWinner.equals(teamTwo)) {
                        winner.setText("The " + teamTwo + " are the winner!");
                        if (userGuess.equals(teamTwo)) {
                            totalCurrency = totalCurrency + 100;
                        } else {
                            totalCurrency = totalCurrency - 50;
                        }
                        currency.setText("Your currency is: " + totalCurrency);
                    }
                }
            }
        });
    }

    public int getWin(String teamName) {
        int wins = 0;
        switch (teamName) {
            case "yankees":
                wins = 136;
                break;
            case "rays":
                wins = 136;
                break;
            case "blue jays":
                wins = 99;
                break;
            case "orioles":
                wins = 79;
                break;
            case "red sox":
                wins = 108;
                break;
            case "twins":
                wins = 137;
                break;
            case "cleveland baseball team":
                wins = 128;
                break;
            case "white sox":
                wins = 107;
                break;
            case "royals":
                wins = 85;
                break;
            case "tigers":
                wins = 70;
                break;
            case "astros":
                wins = 136;
                break;
            case "athletics":
                wins = 133;
                break;
            case "rangers":
                wins = 100;
                break;
            case "angels":
                wins = 98;
                break;
            case "mariners":
                wins = 95;
                break;
            case "braves":
                wins = 132;
                break;
            case "nationals":
                wins = 119;
                break;
            case "marlins":
                wins = 88;
                break;
            case "mets":
                wins = 112;
                break;
            case "phillies":
                wins = 109;
                break;
            case "cardinals":
                wins = 121;
                break;
            case "cubs":
                wins = 118;
                break;
            case "brewers":
                wins = 118;
                break;
            case "pirates":
                wins = 88;
                break;
            case "reds":
                wins = 106;
                break;
            case "dodgers":
                wins = 149;
                break;
            case "padres":
                wins = 107;
                break;
            case "giants":
                wins = 106;
                break;
            case "diamondbacks":
                wins = 110;
                break;
            case "rockies":
                wins = 97;
                break;
        }
        return wins;
    }

    public static void main(String[] args) {
        SportsBaseball menu = new SportsBaseball();
        menu.setTitle("Welcome to the Baseball Simulation");
        menu.setVisible(true);
    }
}
