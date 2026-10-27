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
        List<Progetto> progetti = new ArrayList<Progetto>();
        List<Ricercatore> ricercatori = new ArrayList<>();
        Map<Integer,Progetto> codProg = new HashMap<Integer,Progetto>();
        String cog = args[0];

        try
        {
            BufferedReader br = new BufferedReader(new FileReader("progetti.txt"));
            String line = br.readLine();
            
            while(line != null)
            {
                StringTokenizer tok = new StringTokenizer(line);
                int codice = Integer.parseInt(tok.nextToken());
                String tipo = tok.nextToken();
                String titolo = br.readLine();
                String nome_cognome = br.readLine();
                String organizzatore = br.readLine();
                if(tipo.equals("ricerca"))
                {
                    line = br.readLine();
                    tok = new StringTokenizer(line);
                    String codice_argomento = tok.nextToken();
                    int num_partner = Integer.parseInt(tok.nextToken());
                    double importo = Double.parseDouble(br.readLine());
                    Ricerca r = new Ricerca(codice, titolo, nome_cognome, organizzatore, importo, codice_argomento, num_partner);
                    progetti.add(r);
                    codProg.put(codice, r);
                }
                else
                {
                    line = br.readLine();
                    tok = new StringTokenizer(line);
                    int num_aziende = Integer.parseInt(tok.nextToken());
                    double importo = Double.parseDouble(tok.nextToken());
                    Innovazione in = new Innovazione(codice, titolo, nome_cognome, organizzatore, importo, num_aziende);
                    progetti.add(in);
                    codProg.put(codice, in);
                }
                line = br.readLine();
            }
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }


        for(Progetto p : progetti)
        {
            System.out.println(p);
        }


        try
        {

            BufferedReader br = new BufferedReader(new FileReader("ricercatori.txt"));
            String line = br.readLine();

            while(line != null)
            {
                String nome = line;
                String cognome = br.readLine();
                Ricercatore r = new Ricercatore(nome, cognome);
                ricercatori.add(r);
                line = br.readLine();
                while(line != null && !line.equals(""))
                {
                    StringTokenizer tok = new StringTokenizer(line);
                    int codice = Integer.parseInt(tok.nextToken());
                    double ore = Double.parseDouble(tok.nextToken());
                    r.addProgetto(codProg.get(codice), ore);
                    line = br.readLine();
                }
                line = br.readLine();
            }
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }


        for(Ricercatore ri : ricercatori)
        {
            System.out.println(ri);
        }

        for (Ricercatore r : ricercatori)
        {
            if (r.getCognome().equals(cog))
            {
                Impegno i = r.getMax();
                System.out.println(r.getNome() + " " + r.getCognome() + " " + i.getOre() + " " + i.getProgetto().getTitolo());
            }
        }


        
    }
    
}
