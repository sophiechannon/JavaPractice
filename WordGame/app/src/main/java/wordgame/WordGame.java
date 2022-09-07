package wordgame;

public class WordGame {
    String word;

    WordGame(String newWord) {
        word = newWord;
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
}
