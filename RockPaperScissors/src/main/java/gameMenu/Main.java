package gameMenu;

import players.Computer;
import players.Human;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {



        public static void main(String[] args) {

  /** Play rock–paper–scissors against a computer player.
                    Play rock–paper–scissors against a human player.
                    Hint: Use a random number generator to make the computer's choice.

            Feature Requirements
            Your game must:

            Have a main menu with options to enter 2 players or vs. computer.
                    If the user enters 2 players, they should be able to play rock–paper–scissors against a human competitor.
                    If the user enters vs. computer, they should be able to play against the computer.
            When the game is over, the winner should be declared.
     */
            ArrayList<String> history = new ArrayList<String>();
            //GameMenu gameMenu = new GameMenu();
            Scanner scanner = new Scanner(System.in);

            Human human = new Human();
            human.setPoints(0);
            human.setHasWon(false);
            human.setMove("");

            Computer computer = new Computer();
            computer.setPoints(0);
            computer.setHasWon(false);
            computer.setMove("");

            while (true) {
                //gameMenu.display();
                System.out.println("Welcome to Rock, Paper, Scissors!");
                System.out.print("Enter your name: ");
                String name = scanner.nextLine();
                System.out.print("Choose A Game Option: ");
                System.out.println("1. Play against computer");
                System.out.println("2. Play against another player");
                System.out.println("3. View game history");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();

                if (choice == 1) {
                    System.out.println("You are playing against the computer.");
                    while (true) {
                        String humanMove = human.makeMove();
                        String computerMove = computer.makeMove();

                        if (humanMove.equals("rock")) {
                            if (computerMove.equals("rock")) {
                                System.out.println("It's a tie!");
                                history.add("Tie");
                            } else if (computerMove.equals("paper")) {
                                System.out.println("You lose!");
                                computer.setPoints(computer.getPoints() + 1);
                                history.add("Computer");
                            } else {
                                System.out.println("You win!");
                                human.setPoints(human.getPoints() + 1);
                                human.setHasWon(true);
                                history.add(name);
                            }
                        } else if (humanMove.equals("paper")) {
                            if (computerMove.equals("rock")) {
                                System.out.println("You win!");
                                human.setPoints(human.getPoints() + 1);
                                human.setHasWon(true);
                                history.add(name);
                            } else if (computerMove.equals("paper")) {
                                System.out.println("It's a tie!");
                                history.add("Tie");
                            } else {
                                System.out.println("You lose!");
                                computer.setPoints(computer.getPoints() + 1);
                                history.add("Computer");
                            }
                        } else {
                            if (computerMove.equals("rock")) {
                                System.out.println("You lose!");
                                computer.setPoints(computer.getPoints() + 1);
                                history.add("Computer");
                            } else if (computerMove.equals("paper")) {
                                System.out.println("You win!");
                                human.setPoints(human.getPoints() + 1);
                                human.setHasWon(true);
                                history.add(name);
                            } else {
                                System.out.println("It's a tie!");
                                history.add("Tie");
                            }
                        }

                        System.out.println(name + ": " + humanMove + ", Computer: " + computerMove);
                        System.out.println(name + ": " + human.getPoints() + ", Computer: " + computer.getPoints());

                        if (human.getPoints() == 3 || computer.getPoints() == 3) {
                            if (human.getPoints() == 3) {
                                System.out.println(name + " wins!");
                                human.setHasWon(true);
                            } else {
                                System.out.println("Computer wins!");
                                computer.setHasWon(true);
                            }

                            System.out.print("Play again? (Y/N): ");
                            String playAgain = scanner.next();
                            if (playAgain.equalsIgnoreCase("N")) {
                                break;
                            } else if (!playAgain.equalsIgnoreCase("Y")) {
                                System.out.println("Invalid choice. Exiting game.");
                                break;
                            } } } } } } }
















