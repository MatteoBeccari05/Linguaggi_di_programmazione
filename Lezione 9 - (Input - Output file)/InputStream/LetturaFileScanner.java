import java.io.*;
import java.util.Scanner;

public class LetturaFileScanner 
{
    public static void main(String[] args) 
    {
        
        // Specifichiamo il nome del file già esistente
        String file = "prova.txt";
        
        System.out.println("--- LETTURA CON SCANNER ---");

        // Utilizziamo il try-with-resources per chiudere lo Scanner in automatico
        try (Scanner sc = new Scanner(new File(file))) 
        {
            // Cicliamo finché ci sono righe nel file
            while (sc.hasNextLine()) 
            {
                String riga = sc.nextLine();
                System.out.println(riga);
            }
            
        } 
        catch (FileNotFoundException e) 
        {
            // Gestione dell'eccezione se il file non esiste
            System.out.println("File " + file + " non trovato.");
        }
    }
}