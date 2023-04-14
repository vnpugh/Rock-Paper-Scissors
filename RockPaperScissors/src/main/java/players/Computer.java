package players;

import gameInterfaces.RockPaperScissors;

import java.util.Random;

public class Computer extends Player implements RockPaperScissors {
    private Random random;

    public Computer() {
        random = new Random();
    }
    public int play(int opponentMove) {
        int move = random.nextInt(3) + 1;
        System.out.print("Computer chose ");
        if (move == ROCK) {
            System.out.println("Rock");
        } else if (move == PAPER) {
            System.out.println("Paper");
        } else if (move == SCISSORS) {
            System.out.println("Scissors");
        }
        return compareMoves(move, opponentMove);
    }
    private static int compareMoves(int move1, int move2) {
        if (move1 == move2) {
            return 0;
        } else if (move1 == ROCK && move2 == SCISSORS ||
                move1 == PAPER && move2 == ROCK ||
                move1 == SCISSORS && move2 == PAPER) {
            return 1;
        } else {
            return -1;
        }
    }





    @Override
    public int makeMove() {
        int move = random.nextInt(3) + 1;
        lastMove = move;
        return move;
    } }


    /**
    @Override
    public int play(int move) {
        int result = move - lastMove;
        if (result == 0) {
            return 0;
        } else if (result == -1 || result == 2) {
            addScore(1);
            return 1;
        } else {
            addScore(-1);
            return -1;
        }
    }
}
     */