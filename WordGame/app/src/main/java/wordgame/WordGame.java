package wordgame;

public class WordGame {
    String word;

    WordGame(String newWord) {
        word = newWord;
    }
    public String getWordToGuess() {
        char firstLetter = word.charAt(0);
        String wordToGuess = String.format("%c" + "_".repeat(word.length() - 1), firstLetter);
        return wordToGuess;
    }
}
