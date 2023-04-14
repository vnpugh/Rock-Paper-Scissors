package players;


/**
 *This class defines the state of a player in the game, including their score and last move, as well as
 * methods for getting and adding to the score, and an abstract makeMove
 * method that must be implemented by subclasses.
 */
public abstract class Player {
    protected int score;
    protected int lastMove;

    public int getScore() {
        return score;
    }

    public int getLastMove() {
        return lastMove;
    }

    public void addScore(int points) {
        score += points;
    }
    public abstract int play(int opponentMove);

    public abstract int makeMove();
}