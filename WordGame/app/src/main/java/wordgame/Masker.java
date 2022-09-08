package wordgame;

import java.util.List;

public class Masker {
    public String getMaskedWord(String word, List<Character> guessedChars) {
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
}
