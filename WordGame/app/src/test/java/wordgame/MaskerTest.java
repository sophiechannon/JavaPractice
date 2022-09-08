package wordgame;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Test;

import java.util.Arrays;

public class MaskerTest {
    @Test public void testGetsMaskedWord() {
        Masker masker = new Masker();
        assertEquals(masker.getMaskedWord("MAKERS", Arrays.asList('A', 'K')), "MAK___");
    }

//    @Test public void testGetsWordToGuessAfterGuesses() {
//        WordChooser mockedChooser = mock(WordChooser.class);
//        when(mockedChooser.getRandomWordFromDictionary()).thenReturn("MAKERS");
//        WordGame game = new WordGame(mockedChooser);
//        game.guessLetter('K');
//        game.guessLetter('A');
//        game.guessLetter('Z');
//        assertEquals(game.getWordToGuess(), "MAK___");
//    }
//
//    @Test public void testGetsWordToGuessAfterGuessesRepeatedLetters() {
//        WordChooser mockedChooser = mock(WordChooser.class);
//        when(mockedChooser.getRandomWordFromDictionary()).thenReturn("DEVELOPER");
//        WordGame game = new WordGame(mockedChooser);
//        game.guessLetter('E');
//        assertEquals(game.getWordToGuess(), "DE_E___E_");
//    }
}
