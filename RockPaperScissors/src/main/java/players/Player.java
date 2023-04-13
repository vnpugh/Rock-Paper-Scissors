package players;

public abstract class Player{
    String choice;
    public String name;

    Player(String name) {
        this.name = name;
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }


}
