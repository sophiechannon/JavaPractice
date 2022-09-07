package wordgame;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class WordChooserTest {
    @Test
    public void testGetsRandomWordFromDictionary() {
        WordChooser mockedChooser = mock(WordChooser.class);
        when(mockedChooser.getRandomWordFromDictionary()).thenReturn("MAKERS");
        assertEquals(mockedChooser.getRandomWordFromDictionary(), "MAKERS");
    }

}
