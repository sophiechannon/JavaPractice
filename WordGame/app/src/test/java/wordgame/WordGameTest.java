package wordgame;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WordGameTest {
    @Test public void testGetsWordToGuess() {
        WordGame game = new WordGame("MAKERS");
        assertEquals(game.getWordToGuess(), "M_____");
    }
}
