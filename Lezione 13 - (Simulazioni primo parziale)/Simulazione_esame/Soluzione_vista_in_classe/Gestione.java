import java.io.*;
import java.util.*;

public class Gestione 
{
    public static void main(String[] args) 
    {
        List<Campo> campi = new ArrayList<Campo>();

        try
        {
            BufferedReader bf = new BufferedReader(new FileReader("campi.txt"));
            String line = bf.readLine();
            while(line != null)
            {
                StringTokenizer tok = new StringTokenizer(line);
                int codice = Integer.parseInt(tok.nextToken());
                String tipo = tok.nextToken();
                String nome_campo = bf.readLine();
                line = bf.readLine();
                tok = new StringTokenizer(line);
                float larghezza = Float.parseFloat(tok.nextToken());
                float lunghezza = Float.parseFloat(tok.nextToken());

                if(tipo.equals("tennis"))
                {
                    float temp = Float.parseFloat(tok.nextToken());
                    String terreno = bf.readLine();
                    float costo = Float.parseFloat(bf.readLine());
                    Campo c = new Tennis(codice, nome_campo, larghezza, lunghezza, costo, temp, terreno);
                    campi.add(c);
                }
                else
                {
                    float altezza = Float.parseFloat(tok.nextToken());
                    int piano = Integer.parseInt(tok.nextToken());
                    float costo = Float.parseFloat(tok.nextToken());
                    Campo c1 = new Squash(codice, nome_campo, larghezza, lunghezza, costo, altezza, piano);
                    campi.add(c1);
                }
                line = bf.readLine();
            }
            bf.close();
        }
        catch(Exception ex)
        {
            System.out.print(ex);
        }


        for (Campo c : campi)
        {
            System.out.println(c);
        }
        
        
    }
    
}
