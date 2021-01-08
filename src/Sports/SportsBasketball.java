package Sports;
// Made by Aryan Amberkar

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SportsBasketball extends JFrame {
    private JLabel teamUno = new JLabel();
    private JLabel teamDos = new JLabel();
    private JLabel teamGuess = new JLabel();
    private JTextField team1UserEntry = new JTextField();
    private JTextField team2UserEntry = new JTextField();
    private JLabel winnerOfGame = new JLabel();
    private JLabel currency = new JLabel();
    private JTextField teamUserThinksIsWinner = new JTextField();
    static int totalCurrency;

    public SportsBasketball() {
        getContentPane().setBackground(Color.CYAN);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(300,300, 1300,400);
        getContentPane().setLayout(null);

        teamUno.setForeground(Color.white);
        teamUno.setHorizontalAlignment(SwingConstants.CENTER);
        teamUno.setFont(new Font("Times New Roman", Font.BOLD, 45));
        teamUno.setText("Enter Your First Team: ");
        teamUno.setBounds(45,200,500,100);
        getContentPane().add(teamUno);

        teamDos.setForeground(Color.white);
        teamDos.setHorizontalAlignment(SwingConstants.CENTER);
        teamDos.setFont(new Font("Times New Roman", Font.BOLD, 45));
        teamDos.setText("Enter your second team: ");
        teamDos.setBounds(45,350,500,100);
        getContentPane().add(teamDos);

        teamGuess.setForeground(Color.white);
        teamGuess.setHorizontalAlignment(SwingConstants.CENTER);
        teamGuess.setFont(new Font("Times New Roman", Font.BOLD, 27));
        teamGuess.setText("Enter team you think will win: ");
        teamGuess.setBounds(45,75,500,100);
        getContentPane().add(teamGuess);


        winnerOfGame.setForeground(Color.WHITE);
        winnerOfGame.setHorizontalAlignment(SwingConstants.CENTER);
        winnerOfGame.setFont(new Font("Times New Roman" , Font.BOLD, 45));
        winnerOfGame.setBounds(250,650,700,100);
        winnerOfGame.setText("Winner: ");
        getContentPane().add(winnerOfGame);

        currency.setForeground(Color.WHITE);
        currency.setHorizontalAlignment(SwingConstants.CENTER);
        currency.setFont(new Font("Times New Roman" , Font.BOLD, 45));
        currency.setBounds(250,800,700,100);
        currency.setText("Currency: ");
        getContentPane().add(currency);

        team1UserEntry.setBounds(750,200,500,100);
        team1UserEntry.setForeground(Color.BLACK);
        getContentPane().add(team1UserEntry);

        team2UserEntry.setBounds(750,350,500,100);
        team2UserEntry.setForeground(Color.BLACK);
        getContentPane().add(team2UserEntry);

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
                String teamOne = team1UserEntry.getText();
                String teamTwo = team2UserEntry.getText();
                int iFirstTeamOverall = teamRating1(teamOne);
                int iSecondTeamOverall = teamRating1(teamTwo);
                if (iFirstTeamOverall > iSecondTeamOverall) {
                    winnerOfGame.setText("The " + teamOne + " are the winner!");
                    if (userGuess.equals(teamOne)) {
                        totalCurrency += 100;
                    } else {
                        totalCurrency -= 50;
                    }
                    currency.setText("Your currency is: " + totalCurrency);

                } else if (iSecondTeamOverall > iFirstTeamOverall) {
                    winnerOfGame.setText("The " + teamTwo + " are the winner!");
                    if (userGuess.equals(teamTwo)) {
                        totalCurrency = totalCurrency + 100;
                    } else {
                        totalCurrency = totalCurrency - 50;
                    }
                    currency.setText("Your currency is: " + totalCurrency);

                } else {
                    int iFirstTeamWins = getWin(teamOne);
                    int iSecondTeamWins = getWin(teamTwo);
                    if (iFirstTeamWins > iSecondTeamWins) {
                        winnerOfGame.setText("The " + teamOne + " are the winner!");
                        if (userGuess.equals(teamOne)) {
                            totalCurrency = totalCurrency + 100;
                        } else {
                            totalCurrency = totalCurrency - 50;
                        }
                        currency.setText("Your currency is: " + totalCurrency);
                    }

                    if (iSecondTeamWins > iFirstTeamWins) {
                        winnerOfGame.setText("The " + teamTwo + " are the winner!");
                        if (userGuess.equals(teamOne)) {
                            totalCurrency = totalCurrency + 100;
                            currency.setText("Your currency is: " + totalCurrency);
                        } else if (!userGuess.equals(teamTwo)) {
                            totalCurrency = totalCurrency - 50;
                            currency.setText("Your currency is: " + totalCurrency);
                        }
                    }
                }
            }
        });
    }
    //public int getCurrency(String userChoice, String userTeam1, String userTeam2) {

    //}

    public int getWin(String teamOfChoice) {
        int wins = 0;
        switch (teamOfChoice) {
            case "bucks":
                wins = 131;
                break;
            case "raptors":
                wins = 134;
                break;
            case "celtics":
                wins = 112;
                break;
            case "76ers":
                wins = 101;
                break;
            case "pacers":
                wins = 93;
                break;
            case "heat":
                wins = 97;
                break;
            case "nets":
                wins = 78;
                break;
            case "magic":
                wins = 77;
                break;
            case "pistons":
                wins = 61;
                break;
            case "hornets":
                wins = 62;
                break;
            case "wizards":
                wins = 57;
                break;
            case "hawks":
                wins = 49;
                break;
            case "bulls":
                wins = 44;
                break;
            case "knicks":
                wins = 38;
                break;
            case "cavaliers":
                wins = 38;
                break;
            case "lakers":
                wins = 105;
                break;
            case "clippers":
                wins = 106;
                break;
            case "nuggets":
                wins = 116;
                break;
            case "rockets":
                wins = 108;
                break;
            case "jazz":
                wins = 98;
                break;
            case "thunder":
                wins = 97;
                break;
            case "trail blazers":
                wins = 97;
                break;
            case "spurs":
                wins = 83;
                break;
            case "mavericks":
                wins = 78;
                break;
            case "kings":
                wins = 70;
            case "grizzlies":
                wins = 67;
                break;
            case "timberwolves":
                wins = 55;
                break;
            case "pelicans":
                wins = 63;
                break;
            case "suns":
                wins = 53;
                break;
            case "warriors":
                wins = 86;
                break;
            default:
                wins = 0;
        }
        return wins;

    }
    public int teamRating1(String teamOfChoice) {
        int overall = 0;
        switch (teamOfChoice) {
            case "bucks":
                overall = 90;
                break;
            case "raptors":
                overall = 86;
                break;
            case "celtics":
                overall = 88;
                break;
            case "76ers":
                overall = 86;
                break;
            case "pacers":
                overall = 82;
                break;
            case "heat":
                overall = 87;
                break;
            case "nets":
                overall = 91;
                break;
            case "magic":
                overall = 77;
                break;
            case "pistons":
                overall = 71;
                break;
            case "hornets":
                overall = 73;
                break;
            case "wizards":
                overall = 79;
                break;
            case "hawks":
                overall = 79;
                break;
            case "bulls":
                overall = 71;
                break;
            case "knicks":
                overall = 72;
                break;
            case "cavaliers":
                overall = 74;
                break;
            case "lakers":
                overall = 93;
                break;
            case "clippers":
                overall = 91;
                break;
            case "nuggets":
                overall = 92;
                break;
            case "rockets":
                overall = 85;
                break;
            case "jazz":
                overall = 88;
                break;
            case "thunder":
                overall = 76;
                break;
            case "trail blazers":
                overall = 86;
                break;
            case "spurs":
                overall = 79;
                break;
            case "mavericks":
                overall = 84;
                break;
            case "kings":
                overall = 78;
            case "grizzlies":
                overall = 83;
                break;
            case "timberwolves":
                overall = 74;
                break;
            case "pelicans":
                overall = 80;
                break;
            case "suns":
                overall = 80;
                break;
            case "warriors":
                overall = 86;
                break;
            default:
                overall = 0;
        }
        return overall;

    }

    public static void main(String[] args) {
        SportsBasketball menu = new SportsBasketball();
        menu.setTitle("Welcome to the Basketball Sports Simulation");
        menu.setVisible(true);
    }

}