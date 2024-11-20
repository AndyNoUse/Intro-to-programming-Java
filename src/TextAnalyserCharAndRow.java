public class TextAnalyserCharAndRow {

    //RADER OCH TECKEN KLASSEN
    private String text;
    private int antalTecken = 0;
    private int antalRader = 0;

    public TextAnalyserCharAndRow(String inputText) {
        this.text = inputText;
    }

    public int charCount() {
        antalTecken = antalTecken + text.length();
        return antalTecken;
    }

    public int rowCount() {
        return text.split(" ").length;
    }
}