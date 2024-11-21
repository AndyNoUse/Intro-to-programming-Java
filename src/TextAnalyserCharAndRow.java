public class TextAnalyserCharAndRow {

    //RADER OCH TECKEN KLASSEN
    private String text;
    private int antalTecken = 0;
    private int antalRader = 0;
    private int antalOrd = 0;
    private String longestWord = "";

    public boolean addText(String text) {
        if (text.equalsIgnoreCase("stop")) {
            return false;
        }

        this.text = text;
        antalRader++;
        antalTecken += text.length();

        if (text.equals(""))
            return true;

        String[] words = text.split(" ");
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        antalOrd += words.length;

        return true;
    }

    public int charCount() {
        return antalTecken;
    }

    public int rowCount() {
        return antalRader;
    }

    public int wordCount() {
        return antalOrd;
    }

    public String getLongestWord() {
        return longestWord;
    }
}