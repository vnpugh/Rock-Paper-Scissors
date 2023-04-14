package players;


/**
 *This class defines the state of a player in the game, including their score and last move, as well as
 * methods for getting and adding to the score, and an abstract makeMove
 * method that must be implemented by subclasses.
 */
public abstract class Player {
private int win = 0;
private int lose = 0;

public int getWin() {
        return win;
        }

public void setWin(int win) {
        this.win = win;
        }

public int getLose() {
        return lose;
        }

public void setLose(int lose) {
        this.lose = lose;
        }

public abstract String getChoice();

public abstract String getName();
        }