package players;

import java.util.Scanner;

/**
 *Need to prompt the user to enter a move (either "rock", "paper", or "scissors").
 *Scanner reads their input.
 *Need to set the player's move to the value entered by the user.
 *The move is returned as a String value.
 */
public class Human extends Player {
    public String makeMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your move (rock, paper, or scissors): ");
        String move = scanner.nextLine();
        setMove(move); //This sets the player's move to the value entered by the user.
        return move;
    }


















    //public Human(String name) {super(name);}

    public String Player2;
}
