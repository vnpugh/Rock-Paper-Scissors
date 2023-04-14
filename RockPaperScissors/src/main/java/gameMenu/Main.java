package gameMenu;


import players.Computer;
import players.Human;
import players.Player;

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
                System.out.println("\nWelcome to Rock, Paper, Scissors!");
                System.out.print("Enter Your Name: ");
                String name = scanner.nextLine();
                System.out.print("Welcome " + name + "!\n");
                System.out.print("\nMain Menu: Choose A Game Option: \n");
                //System.out.println("Select an option:");
                System.out.println("1. Play against the computer");
                System.out.println("2. Play against another player");
                System.out.println("3. View game history");
                System.out.println("4. Exit/Quit");

                int choice = scanner.nextInt();

                if (choice == 1) {
                    System.out.println("You are playing against the computer!");
                    while (!human.getHasWon() && !computer.getHasWon()) {
                        int humanMove = human.getMove();
                        int computerMove = computer.getMove();

                        if (humanMove == computerMove) {
                            human.setMove(RockPaperScissors.toString(String.valueOf(humanMove)));
                            computer.setMove(RockPaperScissors.toString(String.valueOf(computerMove)));
                            history.add("It's a tie!");
                            System.out.println("It's a tie!");
                        } else {
                            computer.setPoints(computer.getPoints() + 1);
                            human.setMove(RockPaperScissors.toString(String.valueOf(humanMove)));
                            computer.setMove(RockPaperScissors.toString(String.valueOf(computerMove)));
                            history.add("Computer wins!");
                            System.out.println("Computer wins!");
                        }



                    } //the game loop for both players and the getMove() method to call for each player's turn.
                } else if (choice == 2) {
                    System.out.println("You are playing against another player!\n");
                    System.out.print("Best of Luck!\n");
                    Player player1 = new Human("Player 1");
                    Player player2 = new Human("Player 2");
                    player1.setPoints(0);
                    player2.setPoints(0);
                    player1.setHasWon(false);
                    player2.setHasWon(false);



                    //player1.setMove(player1.getName());
                    //player2.setMove(player2.getName());

                    while (!player1.getHasWon() && !player2.getHasWon()) {
                        int player1Move = player1.getMove();
                        int player2Move = player2.getMove();

                        if (player1Move == player2Move) {
                                    player1.setMove(RockPaperScissors.toString(String.valueOf(player1Move)));
                            player2.setMove(RockPaperScissors.toString(String.valueOf(player2Move)));
                            history.add("It's a tie!");
                            System.out.println("It's a tie!");
                        } else {
                            player2.setPoints(player2.getPoints() + 1);
                            player1.setMove(RockPaperScissors.toString(String.valueOf(player1Move)));
                            player2.setMove(RockPaperScissors.toString(String.valueOf(player2Move)));
                            history.add("Player 2 wins!");
                            System.out.println("Player 2 wins!");
                        }
                    }
                } else if (choice == 3) {
                    System.out.println("Game History:");
                    for (String result : history) {
                        System.out.println(result);
                    }
                } else if (choice == 4) {
                    System.out.println("Thanks for playing!");
                    break;
                } else {
                    System.out.println("Invalid input. Please try again.");
                }
            }
        }
}























