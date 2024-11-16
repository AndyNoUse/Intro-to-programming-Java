
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class WordAndRowCounterTest {

    @Test
    void wordCounter() {
        WordAndRowCounter WordAndRowCounter = new WordAndRowCounter("Hej" +
                "jag heter" +
                "LoveNilsson");
        assertEquals(4, WordAndRowCounter.wordCount());
    }

    @Test
    void rowCounter() {
        WordAndRowCounter WordAndRowCounter = new WordAndRowCounter("Hej" +
                "jag heter" +
                "LoveNilsson" +
                "stop");
        assertEquals(3, WordAndRowCounter.rowCount());
    }
    @Test
    void charCounter() {
        WordAndRowCounter WordAndRowCounter = new WordAndRowCounter("Hej" +
                "jag heter" +
                "LoveNilsson" +
                "stop");
        assertEquals(22, WordAndRowCounter.charCount());
    }

}
