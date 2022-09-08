/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package wordgame;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        WordChooser word = new WordChooser();
        Masker masker = new Masker();
        WordGame game = new WordGame(word, masker );
        System.out.println("Welcome! Today the word to guess is:");
        do {
            System.out.println(game.getWordToGuess());
            System.out.println("Enter one letter to guess (" + game.getRemainingAttempts() +" attempts remaining):");
            Scanner userInput = new Scanner(System.in);
            Character letter = userInput.nextLine().charAt(0);
            if (game.guessLetter(letter)) {
                System.out.println("Right!");
            } else {
                System.out.println("Wrong...");
            }

            if (game.isGameWon()) {
                System.out.println("You have guessed the word " + game.getWordToGuess() + " correctly!");
                break;
            }

            if (game.isGameLost()) {
                System.out.println("You have lost.");
                break;
            }
        } while (game.getRemainingAttempts() > 0);
    }
}
