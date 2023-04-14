package gameMenu;

import gameInterfaces.TwoPlayers;

/**
     *While loop used to display the main menu and prompts the user for input until the
     * user chooses to exit the game.
     */


    public interface GameUI {
        void displayMenu();
        void showMove(int player, int move);
        void showResult(int winner, int move1, int move2);
        void showScore(TwoPlayers player1, TwoPlayers player2);
    }
