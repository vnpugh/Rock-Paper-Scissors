package rockPaperScissors;

import gameInterfaces.GameAI;
import players.Computer;
import players.Human;
import players.Player;
import java.util.Random;
import java.util.Scanner;

public class Main {

        public static void main(String[] args) {


  /**
            Play rock–paper–scissors against a computer player.
                    Play rock–paper–scissors against a human player.
                    Hint: Use a random number generator to make the computer's choice.

            Feature Requirements
            Your game must:

            Have a main menu with options to enter 2 players or vs. computer.
                    If the user enters 2 players, they should be able to play rock–paper–scissors against a human competitor.
                    If the user enters vs. computer, they should be able to play against the computer.
            When the game is over, the winner should be declared.
     */





            Scanner sc = new Scanner(System.in);
            System.out.println("Welcome to Rock, Paper, Scissors!");
            System.out.println("Let's Start the Game!");
            System.out.println("Choose a Game Option:");
            System.out.println("1. Play Against the Computer");
            System.out.println("2. Play Against a Friend");
            System.out.println("3. View Your Game History");
            System.out.println("4. Quit/Exit the Game");
            int option = sc.nextInt();
            sc.nextLine(); // to consume the newline character

            Player player1, player2;
            player1 = new Human("Player 1");
            if(option == 1) {
                player2 = new Computer();
            } else {
                player2 = new Human("Player 2");
            }

            playGame(player1, player2);

            sc.close();
        }

        public static void playGame(Player player1, Player player2) {
           // System.out.println(player1.name + ", please choose 1rock, 2paper, or 3scissors: ");
            System.out.println(player1.name + ", please choose 1rock, 2paper, or 3scissors: ");

            player1.setChoice(getValidChoice());

            if(player2 instanceof GameAI) {
                player2.setChoice(((GameAI)player2).makeChoice());
                System.out.println(player2.name + " chooses " + player2.getChoice() + ".");
            } else {
                System.out.println(player2.name + ", please choose rock, paper, or scissors: ");
                player2.setChoice(getValidChoice());
            }

            System.out.println(player1.name + " chooses " + player1.getChoice() + ".");

            String result = getWinner(player1, player2);
            if(result.equals("tie")) {
                System.out.println("It's a tie!");
            } else {
                System.out.println(result + " wins!");
            }
        }

        public static String getValidChoice() {
            Scanner scanner = new Scanner(System.in);
            String choice = scanner.nextLine().toLowerCase();
            while(!choice.equals("rock") && !choice.equals("paper") && !choice.equals("scissors")) {
                System.out.println("Invalid choice, please choose rock, paper, or scissors: ");
                choice = scanner.nextLine().toLowerCase();
            }
            return choice;
        }

        public static String getWinner(Player player1, Player player2) {
            String choice1 = player1.getChoice();
            String choice2 = player2.getChoice();

            if(choice1.equals(choice2)) {
                return "tie";
            } else if((choice1.equals("rock") && choice2.equals("scissors")) ||
                    (choice1.equals("paper") && choice2.equals("rock")) ||
                    (choice1.equals("scissors") && choice2.equals("paper"))) {
                return player1.name;
            } else {
                return player2.name;
            }
        }

}