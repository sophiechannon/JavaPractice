package wordgame;

import java.util.ArrayList;
import java.util.List;

public class WordGame {
    String word;
    int turnsRemaining = 10;
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
        if (word.contains(Character.toString(letter))) {
            guessedChars.add(letter);
            return true;
        } else {
            turnsRemaining --;
            return false;
        }
    }
}
