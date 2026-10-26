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
        Map<Dipendente, Integer> dipNserv = new HashMap<>();

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
                    dipNserv.put(t, 0);

                }
                else
                {
                    line = br.readLine();
                    tok = new StringTokenizer(line);
                    long telefono = Long.parseLong(tok.nextToken());
                    boolean medico = Boolean.parseBoolean(tok.nextToken());
                    int appuntamenti = Integer.parseInt(tok.nextToken());
                    double costo = Double.parseDouble(tok.nextToken());
                    Nutrizionista n = new Nutrizionista(codice, nome, costo, telefono, medico, appuntamenti);
                    dipendenti.add(n);
                    codDip.put(codice, n);
                    dipNserv.put(n, 0);
                    int servizi = dipNserv.get(n);
                    dipNserv.put(n, servizi+1);
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

                    dipNserv.put(d, dipNserv.get(d) + 1);
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


        int s_max = 0;
        String nome_max = "";
        for(Dipendente d : dipendenti)
        {
            int n_serv = dipNserv.get(d);
            if(n_serv > s_max)
            {
                s_max = n_serv;
                nome_max = d.getNome();
            }
        }

        System.out.println(nome_max);
    }
}
