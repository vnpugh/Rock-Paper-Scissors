package gameMenu;

import players.ComputerPlayer;
import players.HumanPlayer;
import players.Player;

import java.util.ArrayList;
import java.util.Scanner;


/**
 *The code needs validation input, which is what I was working on to avoid unexpected
 * errors, but I did not finish.
 * Need to close the scanner also.
 * Need to add try/catch.
 * In the future, I will separate the game logic into separate methods for better readability.
 *I initially had an enum called Choice to use instead of Strings to represent the choices (Rock, Paper, Scissors).
 */
public class PlayGame {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<String[]> gameHistory = new ArrayList<>();

    public static void main(String[] args) {

        int choice = getGameModeChoice();
        Player player1, player2;

        if (choice == 1) {
            player1 = new HumanPlayer("Player 1");
            player2 = new HumanPlayer("Player 2");
        } else {
            player1 = new HumanPlayer("Player 1");
            player2 = new ComputerPlayer();
        }

        while (true) {
            String p1Choice = player1.getChoice();
            String p2Choice = player2.getChoice();

            recordGame(p1Choice, p2Choice);

            System.out.println(player1.getName() + " chose " + p1Choice + ".");
            System.out.println(player2.getName() + " chose " + p2Choice + ".");

            String result = getResult(p1Choice, p2Choice);
            System.out.println(result);

            if (result.startsWith(player1.getName())) {
                player1.setWin(player1.getWin() + 1);
                player2.setLose(player2.getLose() + 1);
            } else if (result.startsWith(player2.getName())) {
                player2.setWin(player2.getWin() + 1);
                player1.setLose(player1.getLose() + 1);
            }

            System.out.println("Current score:");
            System.out.println(player1.getName() + ": " + player1.getWin() + " wins, " + player1.getLose() + " losses.");
            System.out.println(player2.getName() + ": " + player2.getWin() + " wins, " + player2.getLose() + " losses.");

            if (getPlayAgainChoice() == 2) {
                break;
            }
        }

        System.out.println("Thanks For Playing Rock, Paper, Scissors!");
        scanner.close();
    }

    /**
     * I wanted to customize and personalize the menu options in this game by asking
     * for the players names and adding emojis.
     * @return
     */
    private static int getGameModeChoice() { //MENU
        System.out.println("\nWelcome to Rock Paper Scissors!\n\uD83D\uDDFF\uD83D\uDCD1\u2702");
        System.out.println("Select A Game Option: ");
        System.out.println("1. Play Against Another Player\uD83D\uDE4B");
        System.out.println("2. Play Against the Computer\uD83D\uDCBB");

        System.out.print("Players Make Your Choice: ");


        int choice = scanner.nextInt();
        scanner.nextLine();

        while (choice != 1 && choice != 2) {
            System.out.println("Invalid choice. Please choose again.");
            choice = scanner.nextInt();
        }

        return choice;
    }

    private static int getPlayAgainChoice() {
        System.out.println("Would you like to play again?");
        System.out.println("1. Yes");
        System.out.println("2. No");

        int choice = scanner.nextInt();
        scanner.nextLine();

        while (choice != 1 && choice != 2) {
            System.out.println("Invalid choice. Please choose again.");
            choice = scanner.nextInt();
            scanner.nextLine();
        }

        return choice;
    }

    private static String getResult(String p1Choice, String p2Choice) {
        if (p1Choice.equals(p2Choice)) {
            return "It's a tie!";
        }

        if ((p1Choice.equals("rock") && p2Choice.equals("scissors"))
                || (p1Choice.equals("paper") && p2Choice.equals("rock"))
                || (p1Choice.equals("scissors") && p2Choice.equals("paper"))) {
            return "Player 1 wins!";
        } else {
            return "Player 2 wins!";
        }
    }

    private static void recordGame(String p1Choice, String p2Choice) {
        String[] gameRecord = {p1Choice, p2Choice};
        gameHistory.add(gameRecord);
    }
}
