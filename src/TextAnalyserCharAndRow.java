public class TextAnalyserCharAndRow {

//RADER OCH TECKEN KLASSEN
    private String textArray[];
    private int antalTecken = 0;
    private int antalRader= 0;

    public TextAnalyserCharAndRow(String[] inputText) {
        this.textArray = inputText;
    }

    public int charCount() {
        for (String line : textArray){
            antalTecken += line.length();
        }
        return antalTecken;
    }

    public int rowCount() {
        antalRader= textArray.length;
        return antalRader;
    }
}
