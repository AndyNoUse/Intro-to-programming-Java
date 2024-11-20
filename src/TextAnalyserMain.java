import java.util.Scanner;

public class TextAnalyserMain {

    //TEXT OCH SKRIVER RESULTATET KLASSEN
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String allText = "";
        String text;

        do {
            System.out.print("Skriv din text så analyserar jag den, Avsluta med stop: ");
            text = scanner.nextLine();

            if (!text.contains("stop")) {
                allText += text;
            }

        } while (!text.contains("stop"));

        TextAnalyserCharAndRow analyser = new TextAnalyserCharAndRow();
        analyser.addText(allText);

        System.out.println("Antal tecken (med blanksteg): " + analyser.charCount());
        System.out.println("Antal rader: " + analyser.rowCount());
        System.out.println("text = " + allText);
    }
}