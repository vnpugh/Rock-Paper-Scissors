package gameInterfaces;


/**This interface defines the constants for the game moves and the play method
that takes an integer representing the move and returns an integer
 representing the result of the game (0 for a tie, 1 for a win,
 -1 for a loss).*/

public interface RockPaperScissors {
        int ROCK = 1;
        int PAPER = 2;
        int SCISSORS = 3;

        int play(int move);

}






