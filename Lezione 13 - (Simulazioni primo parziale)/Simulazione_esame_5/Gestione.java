import java.io.*;
import java.util.*;
public class Gestione 
{
    public static void main(String[] args) 
    {
        List<Veicolo> veicoli = new ArrayList<Veicolo>();
        List<Cliente> clienti = new ArrayList<>();
        Map<Integer, String> codTarga = new HashMap<>();
        Map<Integer, Double> codCosto = new HashMap<>();
        Map<Integer, Double> codTotale = new HashMap<>();

        try
        {
            BufferedReader bf = new BufferedReader(new FileReader("veicoli.txt"));
            String line = bf.readLine();
            while(line != null)
            {
                StringTokenizer tok = new StringTokenizer(line);
                int codice = Integer.parseInt(tok.nextToken());
                String tipo = tok.nextToken();
                String targa = tok.nextToken();
                String modello = bf.readLine();
                String marca = bf.readLine();

                if(tipo.equals("auto"))
                {
                    line = bf.readLine();
                    tok = new StringTokenizer(line);
                    int cilindrata = Integer.parseInt(tok.nextToken());
                    double capienzaBag = Double.parseDouble(tok.nextToken());
                    double costo = Double.parseDouble(bf.readLine());
                    Auto a = new Auto(codice, targa, marca, modello, costo, cilindrata, capienzaBag);
                    veicoli.add(a);
                    codTarga.put(codice, targa);
                    codCosto.put(codice, costo);
                    codTotale.put(codice, 0.0);
                }
                else
                {
                    line = bf.readLine();
                    String categoria = line;
                    line = bf.readLine();
                    tok = new StringTokenizer(line);
                    int numPosti = Integer.parseInt(tok.nextToken());
                    boolean vanoCarico = Boolean.parseBoolean(tok.nextToken());
                    double costo = Double.parseDouble(bf.readLine());
                    Furgone f = new Furgone(codice, targa, marca, modello, costo, categoria, numPosti, vanoCarico);
                    veicoli.add(f);
                    codTarga.put(codice, targa);
                    codCosto.put(codice, costo);
                    codTotale.put(codice, 0.0);
                }
                line = bf.readLine();
            }
            bf.close();
        }
        catch(Exception ex)
        {
            System.out.println("Errore nella lettura di veicoli.txt: " + ex);
        }


        try 
        {
            BufferedReader br = new BufferedReader(new FileReader("clienti.txt"));
            String line=br.readLine();
            while (line!= null)
            {
                String nomeCog = line;
                Cliente c = new Cliente(nomeCog);
                clienti.add(c);
                line = br.readLine();
                StringTokenizer tok = new StringTokenizer(line);
                while (tok.hasMoreElements())
                {
                    int codice = Integer.parseInt(tok.nextToken());
                    int giorni = Integer.parseInt(tok.nextToken());
                    String targa = codTarga.get(codice);
                    double costo = codCosto.get(codice);
                    c.addNoleggio(targa, giorni, costo);
                    double current = codTotale.get(codice);
                    codTotale.put(codice, current + giorni * costo);
                }
                line = br.readLine();
            }
            br.close();
        }
        catch (Exception e) 
        {
            System.err.println(e);
        }

        //PUNTO 3
        for (Veicolo v : veicoli)
        {
            System.out.println(v);
        }


        //PUNTO 4
        System.out.println("\n");
        for (Cliente c : clienti)
        {
            System.out.println(c);
        }

        //PUNTO 5
        int codice = Integer.parseInt(args[0]);
        System.out.println(codTotale.get(codice));

    }
}
