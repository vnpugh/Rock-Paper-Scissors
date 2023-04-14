package gameInterfaces;

import players.Player;

/**
 *Need to define how each player makes a move in the game - player behaviors
 */

public interface TwoPlayers {
    int getMove();
    void setOpponentMove(int move);
    void addPoints(int points);
    int getPoints();
    String getName();
    void setWin();
    void setLoss();
    void setTie();
    int getWinCount();
    int getLossCount();
    int getTieCount();
    void resetStats();
}

