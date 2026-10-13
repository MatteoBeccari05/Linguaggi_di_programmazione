import java.io.*;

public class ScritturaFileWriter 
{
    public static void main(String[] args) throws IOException 
    {
        // 1. Stream di dati (si collega fisicamente al file sul disco)
        FileWriter fw = new FileWriter("mio_file.txt");
        
        // 2. Stream di manipolazione (ci fornisce la comodità di print e println)
        PrintWriter outFile = new PrintWriter(fw);
        
        // Scriviamo nel file
        outFile.println("Questa è la prima riga del file.");
        outFile.println("Questa è la seconda riga.");
        outFile.print("Questa riga non va a capo: ");
        outFile.println(12345);
        
        // È fondamentale chiudere il canale per completare l'operazione
        outFile.close();
        
        System.out.println("Scrittura completata.");
    }
}