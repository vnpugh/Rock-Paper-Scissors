package gameMenu;

import java.util.ArrayList;

public class GameHistory {
    private ArrayList<String> player1Moves;
    private ArrayList<String> player2Moves;
    private ArrayList<String> winners;

    public GameHistory() {
        player1Moves = new ArrayList<String>();
        player2Moves = new ArrayList<String>();
        winners = new ArrayList<String>();
    }

    public void addMove(String player1Move, String player2Move, String winner) {
        player1Moves.add(player1Move);
        player2Moves.add(player2Move);
        winners.add(winner);
    }

    public void printHistory() {
        System.out.println("Game History:");
        for (int i = 0; i < player1Moves.size(); i++) {
            System.out.println("Player 1: " + player1Moves.get(i) + " | " +
                    "Player 2: " + player2Moves.get(i) + " | " +
                    "Winner: " + winners.get(i));
        }
    }
}




