package players;

public abstract class Player{
    private int points;
    private boolean hasWon;
    private String move;

    private String name;

    public void setPoints(int points) {
        this.points = points;
    }

    public int getPoints() {
        return points;
    }

    public void setHasWon(boolean hasWon) {
        this.hasWon = hasWon;
    }

    public boolean getHasWon() {
        return hasWon;
    }

    public void setMove(String move) {
        this.move = move;
    }

    public String getMove() {
        return move;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }








    /**String choice;
    public String name;

    Player(String name) {
        this.name = name;
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    } */


}
