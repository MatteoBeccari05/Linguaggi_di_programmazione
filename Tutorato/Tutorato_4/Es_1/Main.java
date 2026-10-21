import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;

public class Main 
{
    public static void main(String[] args) 
    {
        Path path = Paths.get("file.txt");

        try 
        {
            String content = "";
            for(int i = 0; i < args.length; i++) 
            {   
                if(args[i] != null && !args[i].isEmpty()) 
                {
                    content += args[i] + "\n";
                }
            }
            Files.writeString(path, content);
        } 
        catch (IOException e) 
        {
            System.out.println("Errore durante la scrittura: " + e.getMessage());
        }

        try 
        {
            String content = Files.readString(path);
            System.out.println("Contenuto del file: \n" + content);
        }
        catch (IOException e) 
        {
            System.out.println("Errore durante la lettura: " + e.getMessage());
        }
    }
}
