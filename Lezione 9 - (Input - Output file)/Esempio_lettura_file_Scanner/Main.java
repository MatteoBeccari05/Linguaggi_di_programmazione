import java.io.*;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner; 
public class Main 
{
    public static void main(String[] args) 
    {
        String name;
        int units, count = 0;
        float price;
        String file = "inventory.dat";
        
        InventoryItem[] items = new InventoryItem[100];
        
        try 
        {
            Scanner sc = new Scanner(new File(file));
            sc.useLocale(Locale.UK);
            
            while (sc.hasNext()) 
            {
                name = sc.next();
                try 
                {
                    units = sc.nextInt();
                    price = sc.nextFloat();
                    items[count++] = new InventoryItem(name, units, price);
                } 
                catch (InputMismatchException e) 
                { 
                    System.out.println("Error in input format"); 
                    // Se c'è un errore, leggiamo il resto della riga per non bloccare il ciclo all'infinito
                    if (sc.hasNextLine())
                    {
                        sc.nextLine(); 
                    } 
                }
            }
            sc.close();
            
            for (int scan = 0; scan < count; scan++)
            {
                System.out.println(items[scan]);
            }
        } 
        catch (FileNotFoundException e) 
        {
            System.out.println("File " + file + " not found.");
        }
    }
}
