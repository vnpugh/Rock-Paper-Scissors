package players;

import java.util.Scanner;

public class HumanPlayer extends Player {
    private Scanner scanner;

    public HumanPlayer(String s) {
        scanner = new Scanner(System.in);
    }

    @Override
    public String getChoice() {
        System.out.print("Enter your choice (rock\uD83D\uDDFF/paper\uD83D\uDCD1/scissors✂): ");
        String choice = scanner.nextLine().toLowerCase();

        while (!choice.equals("rock") && !choice.equals("paper") && !choice.equals("scissors")) {
            System.out.print("Invalid choice. Please enter rock, paper, or scissors: ");
            choice = scanner.nextLine().toLowerCase();
        }

        return choice;
    }

    @Override
    public String getName() {
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        return name;
    }
}












