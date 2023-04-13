package gameInterfaces;

import players.Player;

public interface GameConsole {
    void display(String message);
    void displayResult(Player player1, Player player2);

}