import java.util.Scanner;

public class WordAndRowCounterMain {
    //Skriv ett program som läser in text ifrån kommandoraden rad för rad tills användaren skriver ordet stop.
//
//När användaren är klar skriver programmet ut antal tecken och hur många rader som användaren har skrivit, exklusive raden med ordet stop
    //Programmet skall bestå av två klasser:
//En klass som läser in text och skriver ut resultatet till användaren0
//En annan klass som räknar raderna och har koll på antalet tecken 0
//Kontrollen för att ha koll på om användaren har skrivit ordet stop eller inte får utföras i vilken av klasserna man vill
//Till programmet skall minst tre Junit-testfall skrivas
//
//Testfallen skall skilja sig märkvärt åt och testa olika delar av programmet
//Skriv antal tecken men notera om det är med eller utan mellanslag

    //Del 3
//
//Vidareutveckla ditt program i del 2 så att programmet även gör följande:
//
//Skriver ut antal ord (separerade med blanksteg)
//Skriver ut det längsta ordet
//
//Kontrollen om användaren har skrivit ordet stop eller inte måste ligga i den andra ”logik-klassen” Programmet skall fortfarande bestå av två klasser:
//En klass som läser in text och skriver ut resultatet till användaren
//En annan klass som:
//Räknar raderna, antal tecken och antal ord
//Har koll på det längsta ordet
//Har koll på om användaren har skrivit ordet stop eller inte Programmet skall fortfarande ha minst 3 testfall och läggas upp på samma sätt i Github som i del 2
    public static void main(String[] args) {
        int antalTecken = 0;
        int antalRader = 0;
        String input;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Skriv din text så analyserar jag den, Avsluta med stop: ");
            input = scanner.nextLine();
            String[] wordArray = input.split(" ");
            if (!input.equals("stop")) {
                antalTecken = antalTecken + input.length();
                antalRader++;
            }
        } while (!input.contains("stop"));
        System.out.println("Antal tecken (med blanksteg): " + antalTecken);
        System.out.println("Antal rader: " + antalRader);
    }
}
