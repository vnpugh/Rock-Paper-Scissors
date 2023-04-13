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
                System.out.println("Welcome to Rock, Paper, Scissors!");
                System.out.print("Enter Your Name: ");
                String name = scanner.nextLine();
                System.out.print("Main Menu: Choose A Game Option: \n");
                System.out.println("1. Play against computer");
                System.out.println("2. Play against another player");
                System.out.println("3. View game history");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // consume newline character after integer input
              //PLAYING AGAINST COMPUTER
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
                            if (computerMove.equals("paper")) {
                                System.out.println("It's a tie!");
                                history.add("Tie");
                            } else if (computerMove.equals("scissors")) {
                                System.out.println("You lose!");
                                computer.setPoints(computer.getPoints() + 1);
                                history.add("Computer");
                            } else {
                                System.out.println("You win!");
                                human.setPoints(human.getPoints() + 1);
                                human.setHasWon(true);
                                history.add(name);
                            }
                        } else if (humanMove.equals("scissors")) {
                            if (computerMove.equals("scissors")) {
                                System.out.println("It's a tie!");
                                history.add("Tie");
                            } else if (computerMove.equals("rock")) {
                                System.out.println("You lose!");
                                computer.setPoints(computer.getPoints() + 1);
                                history.add("Computer");
                            } else {
                                System.out.println("You win!");
                                human.setPoints(human.getPoints() + 1);
                                human.setHasWon(true);
                                history.add(name);
                            }
                        } else {
                            System.out.println("Invalid move. Please try again.");
                            continue;
                        }

                        System.out.println("Your move: " + humanMove);
                        System.out.println("Computer's move: " + computerMove);
                        System.out.println(name + ": " + human.getPoints() + "  Computer: " + computer.getPoints());

                        System.out.print("Do you want to play again? (Y/N): ");
                        String playAgain = scanner.next();

                        if (playAgain.equalsIgnoreCase("n")) {
                            break;
                        }
                    }

                    //PLAYING AGAINST ANOTHER PLAYER2
                } else if (choice == 2) {

                    System.out.println("You are playing against another player.");
                    System.out.print("Enter The Second Player's Name: ");
                   

                    String secondPlayerName = scanner.nextLine();
                    Human player2 = new Human();
                    player2.setPoints(0);
                    player2.setHasWon(false);
                    player2.setMove("");

                    while (true) {
                        String humanMove = human.makeMove();
                        String player2Move = player2.makeMove();

                        if (humanMove.equals("rock")) {
                            if (player2Move.equals("rock")) {
                                System.out.println("It's a tie!");
                                history.add("Tie");
                            } else if (player2Move.equals("paper")) {
                                System.out.println("Player 2 wins!");
                                player2.setPoints(player2.getPoints() + 1);
                                history.add("Player 2");
                            } else {
                                System.out.println(name + " wins!");
                                human.setPoints(human.getPoints() + 1);
                                human.setHasWon(true);
                                history.add(name);
                            }
                        } else if (humanMove.equals("paper")) {
                            if (player2Move.equals("rock")) {
                                System.out.println(name + " wins!");
                                human.setPoints(human.getPoints() + 1);
                                human.setHasWon(true);
                                history.add(name);
                            } else if (player2Move.equals("paper")) {
                                System.out.println("It's a tie!");
                                history.add("Tie");
                            } else {
                                System.out.println("Player 2 wins!");
                                player2.setPoints(player2.getPoints() + 1);
                                history.add("Player 2");
                            }
                        } else {
                            if (player2Move.equals("rock")) {
                                System.out.println("Player 2 wins!");
                                player2.setPoints(player2.getPoints() + 1);
                                history.add("Player 2");
                            } else if (player2Move.equals("paper")) {
                                System.out.println(name + " wins!");
                                human.setPoints(human.getPoints() + 1);
                                human.setHasWon(true);
                                history.add(name);
                            } else {
                                System.out.println("It's a tie!");
                                history.add("Tie");
                            }
                        }

                        if (human.getPoints() >= 3) {
                            System.out.println(name + " wins the game!");
                            human.setHasWon(true);
                            break;
                        } else if (player2.getPoints() >= 3) {
                            System.out.println("Player 2 wins the game!");
                            player2.setHasWon(true);
                            break;
                        }
                    }
                }}}}






                            /**
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
                            } } } } } } } */
















