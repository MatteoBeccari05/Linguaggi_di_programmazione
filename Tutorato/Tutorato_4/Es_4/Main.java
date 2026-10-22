import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Main 
{
    public static void main(String[] args) 
    {
        String inputFile = "Purgatorio_Canto28_versi.txt";
        String outputFile = "Purgatorio_Canto28_testo.txt";

        // Inserendo br e bw dentro le parentesi del try (...), Java li chiuderà automaticamente alla fine
        try (BufferedReader br = new BufferedReader(new FileReader(inputFile, StandardCharsets.UTF_8));
             BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile, StandardCharsets.UTF_8)))    
        {
            List<String> gruppo = new ArrayList<>();
            String line;

            while ((line = br.readLine()) != null) 
            {
                line = line.trim();
                
                // Salta eventuali righe vuote
                if (!line.isEmpty()) 
                {
                    gruppo.add(line);

                    // Ogni 3 versi accumulati, li unisce separandoli con uno spazio e li scrive nel file
                    if (gruppo.size() == 3) 
                    {
                        bw.write(String.join(" ", gruppo));
                        bw.newLine();
                        gruppo.clear();
                    }
                }
            }

            // Se alla fine rimangono 1 o 2 versi (non multiplo di 3), li scrive comunque
            if (!gruppo.isEmpty()) 
            {
                bw.write(String.join(" ", gruppo));
                bw.newLine();
            }

            System.out.println("File elaborato e salvato con successo in " + outputFile);

        } 
        catch (IOException e) 
        {
            System.err.println("Errore durante la lettura/scrittura del file: " + e.getMessage());
        }
    }
}