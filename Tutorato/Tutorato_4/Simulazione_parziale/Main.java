import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main 
{
    public static void main(String[] args) 
    {
        List<Veicolo> veicoli = new ArrayList<Veicolo>();
        List<Cliente> clienti = new ArrayList<Cliente>();
        Map<Integer, Veicolo> codVeicolo = new HashMap<Integer, Veicolo>();
        Map<String , Veicolo> targaVeicolo = new HashMap<String , Veicolo>();

        // DOMANDA 1: lettura file veicoli.txt
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
                    double capienzaBag = Double.parseDouble(tok.nextToken());
                    int cilindrata = Integer.parseInt(tok.nextToken());
                    String categoria = bf.readLine();
                    double costo = Double.parseDouble(bf.readLine());
                    Veicolo v = new Auto(codice, targa, modello, marca, costo, capienzaBag, cilindrata, categoria);
                    veicoli.add(v);
                    targaVeicolo.put(targa, v);
                    codVeicolo.put(codice, v);
                }
                else
                {
                    line = bf.readLine();
                    tok = new StringTokenizer(line);
                    boolean rimorchio = Boolean.parseBoolean(tok.nextToken());
                    int numPosti = Integer.parseInt(tok.nextToken());
                    boolean vanoCarico = Boolean.parseBoolean(tok.nextToken());
                    double costo = Double.parseDouble(bf.readLine());
                    Veicolo v = new Furgone(codice, targa, modello, marca, costo, rimorchio, numPosti, vanoCarico);
                    veicoli.add(v);
                    targaVeicolo.put(targa, v);
                    codVeicolo.put(codice, v);
                }
                line = bf.readLine();
            }
            bf.close();
        }
        catch(Exception ex)
        {
            System.out.println("Errore nella lettura di veicoli.txt: " + ex);
        }


        // DOMANDA 2: lettura file clienti.txt
        try (BufferedReader br = new BufferedReader(new FileReader("clienti.txt")))
        {
            String line = br.readLine();

            while (line != null)
            {
                while (line != null && line.trim().isEmpty()) 
                {
                    line = br.readLine();
                }
                
                if (line == null) 
                {
                    break;
                }

                String nome = line.trim();
                Cliente c = new Cliente(nome);
                clienti.add(c);

                line = br.readLine();
                while (line != null && !line.trim().isEmpty())
                {
                    StringTokenizer tok = new StringTokenizer(line);
                    int codice = Integer.parseInt(tok.nextToken());
                    int giorni = Integer.parseInt(tok.nextToken());

                    Veicolo v = codVeicolo.get(codice);
                    if (v != null) {
                        c.addNoleggio(new Noleggio(codice, giorni, v.getCosto()));
                        v.addNoleggio();
                    }

                    line = br.readLine();
                }
            }
            br.close();
        }
        catch (Exception ex)
        {
            System.out.println("Errore nella lettura di clienti.txt: " + ex);
        }

        // DOMANDA 3: stampa di tutti i veicoli
        System.out.println("\n--- ELENCO VEICOLI ---");
        System.out.println("tipo, targa, codice, modello, marca, costo giornaliero, bagagliaio, cilindrata, categoria, rimorchio, numero di posti, vano di carico");
        System.out.println("------------------------------------------------------------------------------------------------");
        for (Veicolo v : veicoli)
        {
            System.out.println(v);
        }

        // DOMANDA 4: elenco dei clienti
        System.out.println("\n--- ELENCO CLIENTI ---");
        System.out.println(String.format("%-25s %22s %15s", "nome e cognome", "costo noleggio maggiore", "numero noleggi"));
        System.out.println("--------------------------------------------------------------------------------");
        for (Cliente c : clienti)
        {
            System.out.println(c);
        }



        //DOMANDA 5
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserire numero targa su cui conteggiare i noleggi: ");
        String targa = scanner.nextLine();
        scanner.close();
        System.out.println("Per la targa " + targa + " sono registrati " + targaVeicolo.get(targa).getNumNoleggi() + " noleggi");

    }
}
