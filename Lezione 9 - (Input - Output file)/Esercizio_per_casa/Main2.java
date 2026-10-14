import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main2 
{
    public static void main(String[] args) 
    {
        String fileName = "file.txt";
        Scanner consoleScanner = new Scanner(System.in);
        
        //scrittura da console su file fino a linea vuota
        try 
        {
            PrintWriter writer = new PrintWriter(new File(fileName));
            System.out.println("Inserisci il testo riga per riga (premi Invio a riga vuota per terminare):");
            
            String line = consoleScanner.nextLine();
            while (!line.isEmpty()) 
            {
                writer.println(line);
                line = consoleScanner.nextLine();
            }
            writer.close();
        } 
        catch (FileNotFoundException e) 
        {
            System.out.println("Errore nella creazione/scrittura del file: " + e.getMessage());
        }
        
        //lettura del file di testo e stampa a video del contenuto
        try 
        {
            Scanner fileScanner = new Scanner(new File(fileName));
            
            while (fileScanner.hasNextLine()) 
            {
                String contentLine = fileScanner.nextLine();
                System.out.println(contentLine);
            }
            fileScanner.close();
        } 
        catch (FileNotFoundException e) 
        {
            System.out.println("File " + fileName + " non trovato.");
        }
    }
}