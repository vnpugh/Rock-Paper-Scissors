package players;
import java.util.Random;


public class Computer extends Player{
    public String makeMove() {
        String[] options = {"rock", "paper", "scissors"};
        Random random = new Random();
        String move = options[random.nextInt(3)];
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
