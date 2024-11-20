public class TextAnalyserCharAndRow {
    //RADER OCH TECKEN KLASSEN
    private String text;
    private int antalTecken = 0;
    private int antalRader = 0;

    public void addText(String text) {
        this.text = text;
        antalRader++;
    }


    public int charCount() {
        antalTecken = antalTecken + text.length();
        return antalTecken;
    }

    public int rowCount() {
        return antalRader-1;
    }

}