package wordgame;

import java.util.ArrayList;
import java.util.List;

public class WordGame {
    private String word;
    private int turnsRemaining = 10;
    List<Character> guessedChars = new ArrayList<>();

    WordGame(WordChooser chooser) {
        word = chooser.getRandomWordFromDictionary();
    }
    public String getWordToGuess() {
        StringBuilder wordToGuess = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            char firstLetter = word.charAt(0);
            if (i == 0) {
                wordToGuess.append(firstLetter);
            } else if (guessedChars.contains(word.charAt(i))) {
                wordToGuess.append(word.charAt(i));
            } else {
                wordToGuess.append("_");
            }
        }
        return wordToGuess.toString();
    }

    public int getRemainingAttempts() {
        return turnsRemaining;
    }

    public List getGuessedChars() {
        return guessedChars;
    }

    public Boolean guessLetter(char letter) {
        letter = Character.toUpperCase(letter);
        if (word.contains(Character.toString(letter))) {
            guessedChars.add(letter);
            return true;
        } else {
            turnsRemaining --;
            return false;
        }
    }

    public Boolean isGameLost() {
        if (turnsRemaining <= 0) {
            return true;
        } else {
            return false;
        }
    }

    public Boolean isGameWon() {
        if (getWordToGuess().contains("_")) {
            return false;
        } else {
            return true;
        }
    }
}
