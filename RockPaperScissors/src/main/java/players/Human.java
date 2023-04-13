package players;

import java.util.Scanner;

public class Human extends Player {
    public String makeMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your move (rock, paper, or scissors): ");
        String move = scanner.nextLine();
        setMove(move);
        return move;
    }


















    //public Human(String name) {super(name);}

}
