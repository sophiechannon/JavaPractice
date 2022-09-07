package wordgame;

import java.util.Random;

public class WordChooser {
    static final String[] DICTIONARY = {"MAKERS", "CANDIES", "DEVELOPER", "LONDON"};

    public String getRandomWordFromDictionary() {
        int randomIndex = new Random().nextInt(DICTIONARY.length);
        return DICTIONARY[randomIndex];
    }
}
