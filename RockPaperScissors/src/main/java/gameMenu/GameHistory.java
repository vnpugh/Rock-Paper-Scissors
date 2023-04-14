package gameMenu;

import players.Human;

import java.util.ArrayList;

public class GameHistory extends Human {


        private ArrayList<String> moves;
        private ArrayList<String> results;

        public GameHistory() {
            moves = new ArrayList<String>();
            results = new ArrayList<String>();
        }

        public void addMove(String move) {
            moves.add(move);
        }

        public void addResult(String result) {
            results.add(result);
        }

        public void printGameHistory() {
            System.out.println("Game history:");
            for (int i = 0; i < moves.size(); i++) {
                System.out.println("Move #" + (i+1) + ": " + moves.get(i) + ", Result: " + results.get(i));
            }
        }

}



