import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TextAnalyserTest {
//Skriv ett program som läser in text ifrån kommandoraden rad för rad tills användaren skriver ordet stop.
//
//När användaren är klar skriver programmet ut antal tecken och hur många rader som användaren har skrivit, exklusive raden med ordet stop
    //Programmet skall bestå av två klasser:
//En klass som läser in text och skriver ut resultatet till användaren
//En annan klass som räknar raderna och har koll på antalet tecken
//Kontrollen för att ha koll på om användaren har skrivit ordet stop eller inte får utföras i vilken av klasserna man vill
//Till programmet skall minst tre Junit-testfall skrivas
//
//Testfallen skall skilja sig märkvärt åt och testa olika delar av programmet
//Skriv antal tecken men notera om det är med eller utan mellanslag

    //Del 3
//
//Vidareutveckla ditt program i del 2 så att programmet även gör följande:
//
//Skriver ut antal ord (separerade med blanksteg)
//Skriver ut det längsta ordet
//
//Kontrollen om användaren har skrivit ordet stop eller inte måste ligga i den andra ”logik-klassen” Programmet skall fortfarande bestå av två klasser:
//En klass som läser in text och skriver ut resultatet till användaren
//En annan klass som:
//Räknar raderna, antal tecken och antal ord
//Har koll på det längsta ordet
//Har koll på om användaren har skrivit ordet stop eller inte Programmet skall fortfarande ha minst 3 testfall och läggas upp på samma sätt i Github som i del 2

    @Test
    public void charCounter() {
        TextAnalyserCharAndRow analyser = new TextAnalyserCharAndRow();
        analyser.addText("Hej");
        analyser.addText("jag heter Love Nilsson"); //27 tecken, 5 ord, 2 rader, längsta ordet Nilsson.
        analyser.addText("stop");
        assertEquals(25, analyser.charCount());
    }

    @Test
    public void rowCounter() {
        TextAnalyserCharAndRow analyser = new TextAnalyserCharAndRow();
        analyser.addText("Hej");
        analyser.addText("jag heter Love Nilsson");
        analyser.addText("Hej");
        analyser.addText("Hej");
        analyser.addText("stop");
        assertEquals(4, analyser.rowCount());
    }

    @Test
    public void countWords() {
        TextAnalyserCharAndRow analyser = new TextAnalyserCharAndRow();
        analyser.addText("Hej");
        analyser.addText("jag heter Love Nilsson");
        analyser.addText("stop");
        assertEquals(5, analyser.wordCount());
    }

    @Test
    public void noWordsStop() {
        TextAnalyserCharAndRow analyser = new TextAnalyserCharAndRow();
        analyser.addText("");
        analyser.addText("");
        analyser.addText("stop");
        assertEquals(2, analyser.rowCount());
        assertEquals(0, analyser.charCount());
        assertEquals(0, analyser.wordCount());

    }

    @Test
    public void longestWord() {
        TextAnalyserCharAndRow analyser = new TextAnalyserCharAndRow();
        analyser.addText("Hej");
        analyser.addText("Jag heter Love Nilsson");
        analyser.addText("Abrakadabra"); //11 tecken
        analyser.addText("stop");
        assertEquals("Abrakadabra",analyser.getLongestWord());
    }
}