package players;

import gameInterfaces.RockPaperScissors;

import java.util.Scanner;

/**
 *Need to prompt the user to enter a move (either "rock", "paper", or "scissors").
 *Scanner reads their input.
 *Need to set the player's move to the value entered by the user.
 *The move is returned as a String value.
 */
public class Human extends Player implements RockPaperScissors {
    private Scanner scanner;

    public Human() {
        scanner = new Scanner(System.in);
    }


    /**
    public int play(int opponentMove) {
        System.out.println("Choose your move:");
        System.out.println("1. Rock");
        System.out.println("2. Paper");
        System.out.println("3. Scissors");
        int move = scanner.nextInt();
        if (move == ROCK) {
            System.out.println("You chose Rock");
        } else if (move == PAPER) {
            System.out.println("You chose Paper");
        } else if (move == SCISSORS) {
            System.out.println("You chose Scissors");
        }
        return compareMoves(move, opponentMove);
    }*/







    @Override
    public int makeMove() {
        System.out.print("Enter your move (1 for Rock, 2 for Paper, 3 for Scissors): ");
        int move = scanner.nextInt();
        lastMove = move;
        return move;
    }

    @Override
    public int play(int move) {
        int result = move - lastMove;
        if (result == 0) {
            return 0;
        } else if (result == 1 || result == -2) {
            addScore(1);
            return 1;
        } else {
            addScore(-1);
            return -1;
        }
    }
}