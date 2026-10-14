import java.io.*;

public class Tabelline 
{
    public static void main(String[] args) throws IOException 
    {
        FileWriter fw = new FileWriter("tabelline.txt");
        PrintWriter outFile = new PrintWriter(fw);
        for (int i = 1; i <= 10; i++) 
        {
            for (int j = 1; j <= 10; j++)
            {
                outFile.printf("%5d", (i * j));
            }
            outFile.println();
        }
        outFile.close();
    }
}