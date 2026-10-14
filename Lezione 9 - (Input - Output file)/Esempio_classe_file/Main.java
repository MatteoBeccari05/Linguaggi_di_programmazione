import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
// In Java 11+ potresti usare direttamente Path.of() invece di Paths.get()

public class Main 
{
    public static void main(String[] args) 
    {
        Path percorsoFile = Paths.get("nuovo_file_nio.txt");
        
        String testoDaScrivere = "Questo è un esempio di I/O moderno in Java.\n" +
                                 "Usiamo la classe Files introdotta con NIO.\n" +
                                 "Non servono né Scanner né PrintWriter!\n";

        // =======================================================
        // SCRITTURA DEL FILE (in una sola riga di codice effettivo)
        // =======================================================
        System.out.println("--- FASE DI SCRITTURA ---");
        try 
        {
            // Scrive l'intera stringa nel file in una singola chiamata.
            // Crea il file se non esiste, o lo sovrascrive se esiste.
            Files.writeString(percorsoFile, testoDaScrivere);
            System.out.println("File scritto con successo!");
            
        } 
        catch (IOException e) 
        {
            System.out.println("Errore durante la scrittura: " + e.getMessage());
        }


        // =======================================================
        // LETTURA DEL FILE (in una sola riga di codice effettivo)
        // =======================================================
        System.out.println("\n--- FASE DI LETTURA ---");
        try 
        {
            // Legge tutto il contenuto del file in una singola stringa!
            String contenutoLetto = Files.readString(percorsoFile);
            
            System.out.println("Contenuto del file:");
            System.out.println(contenutoLetto);
            
        } 
        catch (IOException e) 
        {
            System.out.println("Errore durante la lettura: " + e.getMessage());
        }
    }
}