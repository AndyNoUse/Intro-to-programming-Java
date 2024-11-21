import java.util.Scanner;

public class TextAnalyserMain {

    //TEXT OCH SKRIVER RESULTATET KLASSEN
    public static void main(String[] args) {
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        TextAnalyserCharAndRow analyser = new TextAnalyserCharAndRow();
        String text;

        do {
            System.out.print("Skriv din text så analyserar jag den, Avsluta med stop: ");
            text = scanner.nextLine();
            loop = analyser.addText(text);

        } while (loop);

        System.out.println("Antal rader: " + analyser.rowCount());
        System.out.println("Antal tecken (med blanksteg): " + analyser.charCount());
        System.out.println("Antal ord: " + analyser.wordCount());
        System.out.println("Längsta ordet är: " + analyser.getLongestWord());
    }
}