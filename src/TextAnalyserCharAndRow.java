public class TextAnalyserCharAndRow {

    //RADER OCH TECKEN KLASSEN
    private String text = "";
    private int charCount = 0;
    private int rowCount = 0;
    private int wordCount = 0;
    private String longestWord = "";

    public boolean addText(String text) {
        if (text.equalsIgnoreCase("stop")) {
            return false;
        }

        this.text = text;
        rowCount++;
        charCount += text.length();

        if (text.equals(""))
            return true;

        String[] words = text.split(" ");
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        wordCount += words.length;
        return true;
    }

    public int charCount() {
        return charCount;
    }

    public int rowCount() {
        return rowCount;
    }

    public int wordCount() {
        return wordCount;
    }

    public String getLongestWord() {
        return longestWord;
    }
}