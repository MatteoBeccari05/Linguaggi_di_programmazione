import java.io.*;
import java.util.StringTokenizer;

public class Main 
{
    public static void main(String[] args) 
    {
        String line, name;
        int units, count = 0;
        float price;
        String file = "inventory.dat";
        
        InventoryItem[] items = new InventoryItem[100];
        StringTokenizer tokenizer;
        
        try 
        {
            FileReader fr = new FileReader(file);
            BufferedReader inFile = new BufferedReader(fr);
            line = inFile.readLine();
            
            while (line != null) 
            {
                tokenizer = new StringTokenizer(line);
                name = tokenizer.nextToken();
                
                try 
                {
                    units = Integer.parseInt(tokenizer.nextToken());
                    price = Float.parseFloat(tokenizer.nextToken());
                    items[count++] = new InventoryItem(name, units, price);
                } 
                catch (NumberFormatException e) 
                {
                    System.out.println("Errore in input. Riga: " + line);
                }
                
                line = inFile.readLine();
            }
            
            inFile.close();
            
            // Scrive a video i dati letti
            for (int scan = 0; scan < count; scan++) 
            {
                System.out.println(items[scan]);
            }
            
        } 
        catch (FileNotFoundException e) 
        { 
            System.out.println("File " + file + " non trovato.");
        } 
        catch (IOException e) 
        {
            System.out.println(e);
        }
    }
}
