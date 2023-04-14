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
    private String name;

    public Human(String name) {
        super();
        this.name = name;
    }

    public Human() {

    }

    public int getMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(this.getName() + ", enter your move (0 = rock, 1 = paper, 2 = scissors): ");
        int move = scanner.nextInt();
        return move;
    }

    public String getName() {
        return name;
    }



}
















