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
}
