package wordgame;

import java.util.Random;

public class WordGame {
    String word;
    int turnsRemaining = 10;

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
}
