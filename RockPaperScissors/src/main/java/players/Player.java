package players;

import gameInterfaces.TwoPlayers;

public abstract class Player implements TwoPlayers {
    protected int points;
    protected int move;
    protected boolean won;
    protected int gameWinCount;
    protected int gameLossCount;
    protected int gameTieCount;

    public Player() {
        points = 0;
        won = false;
        gameWinCount= 0;
        gameLossCount = 0;
        gameTieCount = 0;
    }

    public void addPoints(int points) {
        this.points += points;
    }

    public int getPoints() {
        return points;
    }

    public void setOpponentMove(int move) {
        // do nothing
    }

    public void setWin() {
        won = true;
        gameWinCount++;
    }

    public void setLoss() {
        won = false;
        gameLossCount++;
    }

    public void setTie() {
        won = false;
        gameTieCount++;
    }

    public int getWinCount() {
        return gameWinCount;
    }

    public int getLossCount() {
        return gameLossCount;
    }

    public int getTieCount() {
        return gameTieCount;
    }

    public void resetStats() {
        points = 0;
        won = false;
        gameWinCount = 0;
        gameLossCount = 0;
        gameTieCount = 0;
    }

    public void setHasWon(boolean b) {
    }
    public void setPoints(int i) {
    }

    public void setMove(String s) {
    }

    public boolean getHasWon() {
        return false;
    }
}
