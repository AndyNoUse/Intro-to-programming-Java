import java.util.Scanner;

public class TextAnalyserMain {

    //TEXT OCH SKRIVER RESULTATET KLASSEN
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String allinput = "";
        String input;

        do {
            System.out.print("Skriv din text så analyserar jag den, Avsluta med stop: ");
            input = scanner.nextLine();

            if (!input.contains("stop ")) {
                allinput += input +" ";
            }

        } while (!input.contains("stop"));

        TextAnalyserCharAndRow textAnalyserCharAndRow = new TextAnalyserCharAndRow(allinput);

        System.out.println("Antal tecken (med blanksteg): " +
                textAnalyserCharAndRow.charCount());
        System.out.println("Antal rader: " +
                textAnalyserCharAndRow.rowCount());
    }
}
