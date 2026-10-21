import java.io.*;
import java.util.*;

public class Gestione 
{
    public static void main(String[] args) 
    {
        List<Campo> campi = new ArrayList<Campo>();
        List<Socio> soci = new ArrayList<Socio>();
        Map<Integer, Campo> codCampo = new HashMap<Integer, Campo>();

        // DOMANDA 1: lettura file campi.txt
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
                    codCampo.put(codice, c);
                }
                else
                {
                    float altezza = Float.parseFloat(tok.nextToken());
                    int piano = Integer.parseInt(tok.nextToken());
                    float costo = Float.parseFloat(tok.nextToken());
                    Campo c1 = new Squash(codice, nome_campo, larghezza, lunghezza, costo, altezza, piano);
                    campi.add(c1);
                    codCampo.put(codice, c1);
                }
                line = bf.readLine();
            }
            bf.close();
        }
        catch(Exception ex)
        {
            System.out.println("Errore nella lettura di campi.txt: " + ex);
        }

        // DOMANDA 2: lettura file giocatori.txt
        try
        {
            BufferedReader br = new BufferedReader(new FileReader("giocatori.txt"));
            String line = br.readLine();
            while(line != null)
            {
                int codice = Integer.parseInt(line.trim());
                String nome = br.readLine();
                line = br.readLine();
                StringTokenizer tok = new StringTokenizer(line);
                int eta = Integer.parseInt(tok.nextToken());
                int categoria = Integer.parseInt(tok.nextToken());
                Socio s = new Socio(codice, nome, eta, categoria);
                soci.add(s);
                line = br.readLine();
                tok = new StringTokenizer(line);

                while(tok.hasMoreTokens())
                {
                    int codice_campo = Integer.parseInt(tok.nextToken());
                    int ora = Integer.parseInt(tok.nextToken());
                    Prenotazione p = new Prenotazione(codice_campo, ora);
                    s.addPrenotazione(p);
                    codCampo.get(codice_campo).addPrenotazione();
                }

                line = br.readLine();
            }
            br.close();
        }
        catch(Exception ex)
        {
            System.out.println("Errore nella lettura di giocatori.txt: " + ex);
        }

        // =========================================================================
        // DOMANDA 3: stampa di tutti i campi
        // =========================================================================
        System.out.println("\n--- ELENCO CAMPI ---");
        System.out.println("sport, nome del campo, codice, larghezza, lunghezza, temperatura, terreno, altezza, piano, costo");
        System.out.println("------------------------------------------------------------------------------------------------");
        for (Campo c : campi)
        {
            System.out.println(c);
        }

        // =========================================================================
        // DOMANDA 4: elenco dei soci
        // =========================================================================
        System.out.println("\n--- ELENCO SOCI ---");
        System.out.println("codice, nome e cognome, età, categoria, prenotazioni");
        System.out.println("--------------------------------------------------------------------------------");
        for (Socio s : soci)
        {
            System.out.println(s);
        }

        // =========================================================================
        // DOMANDA 5: stampa dell'incasso di un campo
        // =========================================================================
        System.out.println("\n--- INCASSO TOTALE CAMPO ---");
        if (args.length > 0) 
        {
            int cod = Integer.parseInt(args[0]);
            if (codCampo.containsKey(cod)) 
            {
                System.out.printf("Incasso totale per il campo %d: %.2f%n\n", cod, codCampo.get(cod).IncassoTotale());
            } 
            else 
            {
                System.out.println("Campo con codice " + cod + " non trovato.\n");
            }
        } 
        else 
        {
            System.out.println("Nessun codice campo passato da riga di comando (es. java Gestione 1).\n");
        }
    }
}