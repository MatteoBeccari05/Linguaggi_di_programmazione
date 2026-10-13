import java.io.*;

public class LetturaFileReader 
{
    public static void main(String[] args) 
    {
        
        String file = "prova.txt";
        System.out.println("--- LETTURA CON FILEREADER ---");

        // Utilizziamo il try-with-resources per chiudere il FileReader in automatico
        try (FileReader fr = new FileReader(file)) 
        {
            int carattere;
            
            // Il metodo read() legge un carattere alla volta e restituisce il suo codice Unicode.
            // Quando restituisce -1, significa che siamo arrivati alla fine del file.
            while ((carattere = fr.read()) != -1) 
            {
                // Effettuiamo un cast da intero a char per visualizzare il carattere corretto
                System.out.print((char) carattere); 
            }
        } 
        catch (FileNotFoundException e) 
        {
            System.out.println("\nErrore: File " + file + " non trovato.");
        } 
        catch (IOException e) 
        {
            System.out.println("\nErrore di lettura/scrittura: " + e.getMessage());
        }
    }
}