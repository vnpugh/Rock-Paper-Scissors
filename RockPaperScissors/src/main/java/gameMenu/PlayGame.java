package gameMenu;

import players.Computer;
import players.Human;
import players.Player;

import java.util.ArrayList;
import java.util.Scanner;

public class PlayGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> history = new ArrayList<String>();
        Player player1, player2;

        System.out.println("Welcome to Rock Paper Scissors!\n\uD83D\uDDFF\uD83D\uDCD1\u2702");
        System.out.println("Select A Game Option: ");
        System.out.println("1. Play Against Another Player\uD83D\uDE4B");

        System.out.println("2. Play Against the Computer\uD83D\uDCBB");

        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            player1 = new Human();
            player2 = new Human();

        } else {
            player1 = new Human();
            player2 = new Computer();
        }

        System.out.println("Let's play!");
        boolean playing = true;
        while (playing) {
            int move1 = player1.makeMove();
            int move2 = player2.makeMove();
            int result1 = player1.play(move2);
            int result2 = player2.play(move1);

            if (result1 == 0 && result2 == 0) {
                System.out.println("It's a tie!");
                history.add("Tie");
            } else if (result1 == 1 && result2 == -1) {
                System.out.println("Player 1 wins!");
                history.add("Player 1 wins");
            } else if (result1 == -1 && result2 == 1) {
                System.out.println("Player 2 wins!");
                history.add("Player 2 wins");
            }

            System.out.print("Do You Want to Play Again? (y/n): ");
            String input = scanner.next();
            if (input.equals("n")) {
                playing = false;
            }
        }

        System.out.println("\nGOODBYE!\n");
        System.out.println("Game History Print Out:");
        for (String result : history) {
            System.out.println(result);
        }

        scanner.close();
    }
}

