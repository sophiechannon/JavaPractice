package wordgame;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class WordGameTest {
    @Test public void testGetsWordToGuess() {
        WordChooser mockedChooser = mock(WordChooser.class);
        when(mockedChooser.getRandomWordFromDictionary()).thenReturn("MAKERS");
        WordGame game = new WordGame(mockedChooser);
        assertEquals(game.getWordToGuess(), "M_____");
    }

    @Test public void testGetsInitialRemainingAttempts() {
        WordChooser chooser = new WordChooser();
        WordGame game = new WordGame(chooser);
        assertEquals(game.getRemainingAttempts(), 10);
    }
}
