package wordgame;

import java.util.ArrayList;
import java.util.List;

public class WordGame {
    private String word;
    private Masker masker;
    private int turnsRemaining = 10;
    List<Character> guessedChars = new ArrayList<>();

    WordGame(WordChooser chooser, Masker masker) {
        word = chooser.getRandomWordFromDictionary();
        this.masker = masker;
    }
    public String getWordToGuess() {
        return masker.getMaskedWord(word, guessedChars);
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
