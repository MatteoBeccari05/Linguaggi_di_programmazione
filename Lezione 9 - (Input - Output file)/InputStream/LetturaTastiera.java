import java.io.*;

public class LetturaTastiera 
{
    public static void main(String[] args) 
    {
        // 1. InputStream di base (Stream di byte, dati)
        // System.in 

        // 2. Adattatore (converte da stream di byte a stream di caratteri)
        InputStreamReader isr = new InputStreamReader(System.in);

        // 3. Stream di manipolazione (permette di leggere un'intera riga)
        BufferedReader kbd = new BufferedReader(isr);
        
        try 
        {
            System.out.println("Inserisci una frase:");
            // Legge l'intera stringa inserita dall'utente
            String frase = kbd.readLine(); 
            System.out.println("Hai inserito: " + frase);
        } 
        catch (IOException e) 
        {
            System.out.println("Si è verificato un errore di I/O: " + e);
        }
    }
}