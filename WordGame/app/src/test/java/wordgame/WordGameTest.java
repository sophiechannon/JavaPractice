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
        game.guessLetter('A');
        assertEquals(game.getRemainingAttempts(), 10);
        assertEquals(game.getGuessedChars(), Arrays.asList('A'));
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
        assertEquals(game.guessLetter('A'), true);
    }

    @Test public void testGetsWordToGuessAfterGuesses() {
        WordChooser mockedChooser = mock(WordChooser.class);
        when(mockedChooser.getRandomWordFromDictionary()).thenReturn("MAKERS");
        WordGame game = new WordGame(mockedChooser);
        game.guessLetter('K');
        game.guessLetter('A');
        game.guessLetter('Z');
        assertEquals(game.getWordToGuess(), "MAK___");
        assertEquals(game.getRemainingAttempts(), 9);
        assertEquals(game.getGuessedChars(), Arrays.asList('K', 'A'));
    }

    @Test public void testGetsWordToGuessAfterGuessesRepeatedLetters() {
        WordChooser mockedChooser = mock(WordChooser.class);
        when(mockedChooser.getRandomWordFromDictionary()).thenReturn("DEVELOPER");
        WordGame game = new WordGame(mockedChooser);
        game.guessLetter('E');
        assertEquals(game.getWordToGuess(), "DE_E___E_");
        assertEquals(game.getRemainingAttempts(), 10);
        assertEquals(game.getGuessedChars(), Arrays.asList('E'));
    }

    @Test public void testGameIsLostTrue() {
        WordChooser mockedChooser = mock(WordChooser.class);
        when(mockedChooser.getRandomWordFromDictionary()).thenReturn("DEVELOPER");
        WordGame game = new WordGame(mockedChooser);
        game.guessLetter('Z');
        game.guessLetter('Z');
        game.guessLetter('Z');
        game.guessLetter('Z');
        game.guessLetter('Z');
        game.guessLetter('Z');
        game.guessLetter('Z');
        game.guessLetter('Z');
        game.guessLetter('Z');
        game.guessLetter('Z');
        assertEquals(game.isGameLost(), true);
    }

    @Test public void testGameIsLostFalse() {
        WordChooser mockedChooser = mock(WordChooser.class);
        when(mockedChooser.getRandomWordFromDictionary()).thenReturn("DEVELOPER");
        WordGame game = new WordGame(mockedChooser);
        game.guessLetter('Z');
        game.guessLetter('Z');
        game.guessLetter('Z');
        game.guessLetter('Z');
        game.guessLetter('Z');
        game.guessLetter('Z');
        game.guessLetter('Z');
        game.guessLetter('Z');
        game.guessLetter('Z');
        assertEquals(game.isGameLost(), false);
    }

    @Test public void testGameIsWonTrue() {
        WordChooser mockedChooser = mock(WordChooser.class);
        when(mockedChooser.getRandomWordFromDictionary()).thenReturn("DEVELOPER");
        WordGame game = new WordGame(mockedChooser);
        game.guessLetter('D');
        game.guessLetter('E');
        game.guessLetter('v');
        game.guessLetter('l');
        game.guessLetter('o');
        game.guessLetter('p');
        game.guessLetter('r');
        assertEquals(game.isGameWon(), true);
    }
}
