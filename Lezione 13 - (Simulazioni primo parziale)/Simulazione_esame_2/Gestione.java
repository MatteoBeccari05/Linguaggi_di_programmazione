import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Gestione 
{
    public static void main(String[] args) 
    {
        List<Dipendente> dipendenti = new ArrayList<Dipendente>();
        Map<Integer, Dipendente> codDip = new HashMap<Integer, Dipendente>();
        List<Cliente> clienti = new ArrayList<Cliente>();

        try
        {
            BufferedReader br = new BufferedReader(new FileReader("dipendenti.txt"));
            String line = br.readLine();
            while(line != null)
            {
                StringTokenizer tok = new StringTokenizer(line);
                int codice = Integer.parseInt(tok.nextToken());
                String tipo = tok.nextToken();
                line = br.readLine();
                String nome = line;
                if(tipo.equals("trainer"))
                {
                    line = br.readLine();
                    tok = new StringTokenizer(line);
                    int ore = Integer.parseInt(tok.nextToken());
                    double costo = Double.parseDouble(tok.nextToken());
                    String specialita = br.readLine();

                    Trainer t = new Trainer(codice, nome, costo, ore, specialita);
                    dipendenti.add(t);
                    codDip.put(codice, t);

                }
                else
                {
                    line = br.readLine();
                    tok = new StringTokenizer(line);
                    int telefono = Integer.parseInt(tok.nextToken());
                    boolean medico = Boolean.parseBoolean(tok.nextToken());
                    int appuntamenti = Integer.parseInt(tok.nextToken());
                    double costo = Double.parseDouble(tok.nextToken());
                    Nutrizionista n = new Nutrizionista(codice, nome, costo, telefono, medico, appuntamenti);
                    dipendenti.add(n);
                    codDip.put(codice, n);
                }
                line = br.readLine();
                
            }
            
        }
        catch(Exception e)
        {
            System.err.println(e.getMessage());
        }

        for(Dipendente d : dipendenti)
        {
            System.out.println(d);
        }



        try
        {
            BufferedReader br = new BufferedReader(new FileReader("clienti.txt"));
            String line = br.readLine();
            while(line != null)
            {
                int codice = Integer.parseInt(line);
                String nome = br.readLine();
                Cliente c = new Cliente(codice, nome);
                clienti.add(c);
                line = br.readLine();
                while(line != null && !line.equals(""))
                {
                    StringTokenizer tok = new StringTokenizer(line);
                    int codice_dip = Integer.parseInt(tok.nextToken());
                    double ore = Double.parseDouble(tok.nextToken());
                    Dipendente d = codDip.get(codice_dip);
                    Servizio s = new Servizio(ore, d);
                    c.addServizio(s);
                    line = br.readLine();
                }
                line = br.readLine();
            }
        }
        catch(Exception e)
        {
            System.err.println(e.getMessage());
        }


        for(Cliente d : clienti)
        {
            System.out.println(d);
        }
    }
}
