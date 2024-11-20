public class TextAnalyserCharAndRow {
    //RADER OCH TECKEN KLASSEN
    private String text;
    private int antalTecken = 0;
    private int antalRader = 0;

    public void addText(String text) {
        if (text.equalsIgnoreCase("stop")){
            return;
        }
        this.text = text;
        antalRader++;
        antalTecken += text.length();
    }

    public int getCharCount() {
        return antalTecken;
    }

    public int getRowCount() {
        return antalRader;
    }

}