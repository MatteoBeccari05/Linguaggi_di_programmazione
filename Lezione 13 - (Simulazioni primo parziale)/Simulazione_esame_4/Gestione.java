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
        List<Veicolo> veicoli = new ArrayList<Veicolo>();
        List<Cliente> clienti = new ArrayList<>();
        Map<Integer, Veicolo> codVeicolo = new HashMap<Integer,Veicolo>();

        try
        {
            BufferedReader br = new BufferedReader(new FileReader("veicoli.txt"));
            String line = br.readLine();
            
            while(line != null)
            {
                StringTokenizer tok = new StringTokenizer(line);
                int codice = Integer.parseInt(tok.nextToken());
                String tipo = tok.nextToken();
                String marca = br.readLine();
                if(tipo.equals("roulotte"))
                {
                    line = br.readLine();
                    tok = new StringTokenizer(line);
                    int peso = Integer.parseInt(tok.nextToken());
                    float lunghezza = Float.parseFloat(tok.nextToken());
                    float larghezza = Float.parseFloat(tok.nextToken());
                    int posti_letto = Integer.parseInt(tok.nextToken());
                    tok = new StringTokenizer(br.readLine());
                    String veranda = tok.nextToken();
                    float costo = Float.parseFloat(tok.nextToken());
                    Roulotte r = new Roulotte(codice, marca, lunghezza, larghezza, posti_letto, costo, peso, veranda);
                    veicoli.add(r);
                    codVeicolo.put(codice, r);
                    line = br.readLine();
                }
                else
                {
                    line = br.readLine();
                    tok = new StringTokenizer(line);
                    float larghezza = Float.parseFloat(tok.nextToken());
                    float lunghezza = Float.parseFloat(tok.nextToken());
                    int potenza = Integer.parseInt(tok.nextToken());
                    int posti_letto = Integer.parseInt(tok.nextToken());
                    float costo = Float.parseFloat(tok.nextToken());
                    Caravan c = new Caravan(codice, marca, lunghezza, larghezza, posti_letto, costo, potenza);
                    veicoli.add(c);
                    codVeicolo.put(codice, c);
                    line = br.readLine();
                }
                line = br.readLine();
            }
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }


        try
        {
            BufferedReader br = new BufferedReader(new FileReader("clienti.txt"));
            String line = br.readLine();

            while(line != null)
            {
                int codice = Integer.parseInt(line);
                String nome = br.readLine();
                String cognome = br.readLine();
                String indirizzo = br.readLine();
                Cliente c = new Cliente(codice, nome, cognome, indirizzo);
                clienti.add(c);
                line = br.readLine();
                while(line != null && !line.equals(""))
                {
                    StringTokenizer tok = new StringTokenizer(line);
                    int codice_veicolo = Integer.parseInt(tok.nextToken());
                    int giorni = Integer.parseInt(tok.nextToken());
                    Noleggio n = new Noleggio(codice_veicolo, giorni);
                    c.AddNoleggio(n);
                    Veicolo v = codVeicolo.get(codice_veicolo);
                    v.addPrenotazione(n);
                    line = br.readLine();
                }
                line = br.readLine();
            }
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }

        System.out.println("tipo, codice, marca, larghezza, lunghezza, posti letto, peso, veranda, potenza, costo");
        //PUNTO 3
        for(Veicolo v : veicoli)
        {
            System.out.println(v);
        }

        System.out.println("\ncodice, cognome, nome, indirizzo, prenotazioni ");
        //PUNTO 4
        for(Cliente c : clienti)
        {
            System.out.println(c);
        }

        System.out.println("\ncodice, incasso");
        //PUNTO 5
        for(Veicolo v : veicoli)
        {
            System.out.println(v.getCod() + "\t" + v.incasso());
        }
    }
}
