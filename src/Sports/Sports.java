package Sports;
// Made by Aryan Amberkar
//

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sports extends JFrame {
    private JLabel team1 = new JLabel();
    private JLabel team2 = new JLabel();
    private JLabel teamGuess = new JLabel();
    private JTextField team1entry = new JTextField();
    private JTextField team2entry = new JTextField();
    private JLabel currency = new JLabel();
    private JTextField teamUserThinksIsWinner = new JTextField();
    static int totalCurrency;
    private JLabel winner = new JLabel();

    public Sports() {
        getContentPane().setBackground(Color.CYAN);
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
                    int iFirstTeamOverall = teamRating(teamOne);
                    int iSecondTeamOverall = teamRating(teamTwo);
                        if (iFirstTeamOverall > iSecondTeamOverall) {
                            winner.setText("The " + teamOne + " are the winner!");
                            if (userGuess.equals(teamOne)) {
                                totalCurrency += 100;
                            } else {
                                totalCurrency -= 50;
                            }
                            currency.setText("Your currency is: " + totalCurrency);
                        }
                        if (iSecondTeamOverall > iFirstTeamOverall) {
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
        public int getWin(String teamOfChoice) {
            int wins = 0;
            switch (teamOfChoice) {
                case "ravens":
                    wins = 26;
                    break;
                case "steelers":
                    wins = 20;
                    break;
                case "browns":
                    wins = 18;
                    break;
                case "bengals":
                    wins = 6;
                    break;
                case "patriots":
                    wins = 19;
                    break;
                case "bills":
                    wins = 23;
                    break;
                case "jets":
                    wins = 9;
                    break;
                case "dolphins":
                    wins = 15;
                    break;
                case "chiefs":
                    wins = 29;
                    break;
                case "chargers":
                    wins = 12;
                    break;
                case "raiders":
                    wins = 15;
                    break;
                case "broncos":
                    wins = 12;
                    break;
                case "titans":
                    wins = 22;
                    break;
                case "colts":
                    wins = 18;
                    break;
                case "texans":
                    wins = 16;
                    break;
                case "jaguars":
                    wins = 7;
                    break;
                case "packers":
                    wins = 27;
                    break;
                case "bears":
                    wins = 16;
                    break;
                case "vikings":
                    wins = 18;
                    break;
                case "lions":
                    wins = 8;
                    break;
                case "49ers":
                    wins = 21;
                    break;
                case "seahawks":
                    wins = 24;
                    break;
                case "rams":
                    wins = 20;
                    break;
                case "cardinals":
                    wins = 13;
                case "saints":
                    wins = 26;
                    break;
                case "panthers":
                    wins = 10;
                    break;
                case "buccaneers":
                    wins = 19;
                    break;
                case "falcons":
                    wins = 11;
                    break;
                case "giants":
                    wins = 10;
                    break;
                case "cowboys":
                    wins = 14;
                    break;
                case "eagles":
                    wins = 13;
                    break;
                case "washington football team":
                    wins = 10;
                    break;
                default:
                    wins = 0;
            }
            return wins;

        }
    public int teamRating(String teamOfChoice) {
        int overall = 0;
        switch (teamOfChoice) {
            case "ravens":
                overall = 90;
                break;
            case "steelers":
                overall = 86;
                break;
            case "browns":
                overall = 81;
                break;
            case "bengals":
                overall = 73;
                break;
            case "patriots":
                overall = 78;
                break;
            case "bills":
                overall = 89;
                break;
            case "jets":
                overall = 65;
                break;
            case "dolphins":
                overall = 81;
                break;
            case "chiefs":
                overall = 93;
                break;
            case "chargers":
                overall = 79;
                break;
            case "raiders":
                overall = 80;
                break;
            case "broncos":
                overall = 75;
                break;
            case "titans":
                overall = 88;
                break;
            case "colts":
                overall = 86;
                break;
            case "texans":
                overall = 74;
                break;
            case "jaguars":
                overall = 60;
                break;
            case "packers":
                overall = 92;
                break;
            case "bears":
                overall = 83;
                break;
            case "vikings":
                overall = 80;
                break;
            case "lions":
                overall = 71;
                break;
            case "49ers":
                overall = 77;
                break;
            case "seahawks":
                overall = 85;
                break;
            case "rams":
                overall = 87;
                break;
            case "cardinals":
                overall = 82;
            case "saints":
                overall = 89;
                break;
            case "panthers":
                overall = 71;
                break;
            case "buccaneers":
                overall = 86;
                break;
            case "falcons":
                overall = 73;
                break;
            case "giants":
                overall = 77;
                break;
            case "cowboys":
                overall = 77;
                break;
            case "eagles":
                overall = 77;
                break;
            case "washington football team":
                overall = 79;
                break;
            default:
                overall = 0;
        }
        return overall;

    }

    public static void main(String[] args) {
        Sports menu = new Sports();
        menu.setTitle("Welcome to the Sports Simulation");
        menu.setVisible(true);
    }

}