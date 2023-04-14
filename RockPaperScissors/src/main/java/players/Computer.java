package players;
import gameInterfaces.GameAI;
import gameInterfaces.RockPaperScissors;

import java.util.Random;

/**
 *Need an integer to select a move from the options array. The move is stored in the move variable.
 */

public class Computer extends Player implements RockPaperScissors, GameAI {
    private Random random = new Random(); //this method generates random

    public Computer() {
        super();
    }

    public int getMove() {
        move = makeMove(new int[] {rock,paper,scissors});
        return move;
    }

    @Override
    public String getName() {
        return getName();
    }

    public int makeMove(int[] moves) {
        return moves[random.nextInt(moves.length)];
    }

}
