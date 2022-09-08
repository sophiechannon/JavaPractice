package wordgame;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    @Test public void testGuessedCharsIsEmptyInitially() {
        WordChooser mockedChooser = mock(WordChooser.class);
        when(mockedChooser.getRandomWordFromDictionary()).thenReturn("MAKERS");
        WordGame game = new WordGame(mockedChooser);
        assertEquals(game.getGuessedChars(), Arrays.asList());
    }

    @Test public void testUpdatesCounterBadLetter() {
        WordChooser mockedChooser = mock(WordChooser.class);
        when(mockedChooser.getRandomWordFromDictionary()).thenReturn("MAKERS");
        WordGame game = new WordGame(mockedChooser);
        game.guessLetter('L');
        assertEquals(game.getRemainingAttempts(), 9);
        assertEquals(game.getGuessedChars(), Arrays.asList());
    }

    @Test public void testUpdatesGuessedWordsGoodLetter() {
        WordChooser mockedChooser = mock(WordChooser.class);
        when(mockedChooser.getRandomWordFromDictionary()).thenReturn("MAKERS");
        WordGame game = new WordGame(mockedChooser);
        game.guessLetter('M');
        assertEquals(game.getRemainingAttempts(), 10);
        assertEquals(game.getGuessedChars(), Arrays.asList('M'));
    }

    @Test public void testGuessLetterReturnsFailureMessage() {
        WordChooser mockedChooser = mock(WordChooser.class);
        when(mockedChooser.getRandomWordFromDictionary()).thenReturn("MAKERS");
        WordGame game = new WordGame(mockedChooser);
        assertEquals(game.guessLetter('L'), false);
    }

    @Test public void testGuessLetterReturnsSuccessMessage() {
        WordChooser mockedChooser = mock(WordChooser.class);
        when(mockedChooser.getRandomWordFromDictionary()).thenReturn("MAKERS");
        WordGame game = new WordGame(mockedChooser);
        assertEquals(game.guessLetter('M'), true);
    }
}
