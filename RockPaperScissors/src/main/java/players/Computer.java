package players;

import java.util.Random;


public class Computer extends Player{

    public Computer() {
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
    }



}
