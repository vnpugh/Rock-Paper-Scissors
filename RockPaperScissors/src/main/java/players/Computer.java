package players;
import java.util.Random;

/**
 *Need an integer to select a move from the options array. The move is stored in the move variable.
 */
public class Computer extends Player{
    public String makeMove() {
        String[] options = {"rock", "paper", "scissors"};
        Random random = new Random(); //generates a random integer
        String move = options[random.nextInt(3)]; //between 0 and 2 using the nextInt method of the random object.
        setMove(move);
        return move;
    }
















    /** public Computer() {
        super("Computer");
    }

    public String makeChoice() {
        Random rand = new Random();
        int n = rand.nextInt(3);
        if(n == 0) {
            return "rock";
        } else if(n == 1) {
            return "paper";
        } else {
            return "scissors";
        }
    } */



}
