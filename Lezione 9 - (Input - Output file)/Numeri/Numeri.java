import java.util.Scanner;
import java.util.Locale;

public class Numeri 
{
    public static void main(String[] args) 
    {
        // Creazione dello Scanner con Locale.US (usa il punto '.' per i decimali)
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // 1. Lettura di un numero intero
        System.out.print("Inserisci un numero intero (es. 42): ");
        int numeroIntero = scanner.nextInt();

        // 2. Lettura di un numero float
        System.out.print("Inserisci un numero float (es. 3.14): ");
        float numeroFloat = scanner.nextFloat();

        // Stampa dei risultati
        System.out.println("\n--- Valori letti ---");
        System.out.println("Intero: " + numeroIntero);
        System.out.println("Float:  " + numeroFloat);

        // Chiusura dello scanner
        scanner.close();
    }
}