public class TextAnalyserCharAndRow {

    //RADER OCH TECKEN KLASSEN
    private String text = "";
    private int charCount = 0;
    private int rowCount = 0;
    private int wordCount = 0;
    private String longestWord = "";
    private int lengthofLongestWord = 0;

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
            if (word.length() > lengthofLongestWord) {
                lengthofLongestWord = word.length();
                longestWord = word; // Byt ut innehållet med det nya längsta ordet
            } else if (word.length() == lengthofLongestWord) {
                if (!longestWord.contains(word)) {
                    longestWord += ", " + word; // Lägg till om ordet redan inte finns
                }
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