import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main 
{
    public static void main(String[] args) 
    {
        List<Call> chiamateLunghe = new ArrayList<>();

        try
        {
            BufferedReader br = new BufferedReader(new FileReader("data.txt"));
            String line;
            while ((line = br.readLine()) != null) 
            {
                line = line.trim();
                if (!line.isEmpty()) 
                {
                    // Separazione dei valori mediante il carattere ';'
                    String[] parti = line.split(";");
                    
                    if (parti.length == 4) 
                    {
                        String sender = parti[0];
                        String receiver = parti[1];
                        int start = Integer.parseInt(parti[2]);
                        int stop = Integer.parseInt(parti[3]);

                        Call chiamata = new Call(sender, receiver, start, stop);

                        // Filtraggio delle chiamate con durata > 550.000 ms
                        if (chiamata.getDuration() > 550000) 
                        {
                            chiamateLunghe.add(chiamata);
                        }
                    }
                }
            }
        } 
        catch (IOException e) 
        {
            System.err.println("Errore durante la lettura del file: " + e.getMessage());
        } 
        catch (NumberFormatException e) 
        {
            System.err.println("Errore di conversione nei dati numerici: " + e.getMessage());
        }

        System.out.println("Totale: " + chiamateLunghe.size() + " chiamate Lunghe");
    }
}
