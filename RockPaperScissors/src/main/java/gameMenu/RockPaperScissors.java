package gameMenu;

/**Here, I decided to create this class for a set of constant values (enum).
 *The enum values are ROCK, PAPER, and SCISSORS with their integer values.
 *Added toString() method to return the string of each value:
 */
public enum RockPaperScissors { //values can be switched
    ROCK(0),
    PAPER(1),
    SCISSORS(2);

    private final int value;

    RockPaperScissors(int value) {
        this.value = value;
    }

    public static String toString(String humanMove) {
        return humanMove;
    }


    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        switch (this) {
            case ROCK:
                return "Rock";
            case PAPER:
                return "Paper";
            case SCISSORS:
                return "Scissors";
            default:
                return "";
        }
    }
}
