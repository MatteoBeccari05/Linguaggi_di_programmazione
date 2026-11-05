import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Gestione 
{
    public static void main(String[] args) 
    {
        List<Cliente> clienti = new ArrayList<>();
        Map<Integer, Cliente> codCli = new HashMap<>();

        try
        {
            BufferedReader br = new BufferedReader(new FileReader("clienti.txt"));
            String line = br.readLine();
            while(line != null)
            {
                StringTokenizer tok = new StringTokenizer(line);
                String tipo = tok.nextToken();
                int codice = Integer.parseInt(tok.nextToken());
                if(tipo.equals("residenziale"))
                {
                    String nome = br.readLine();
                    String tipo_contratto = br.readLine();
                    String indirizzo = br.readLine();
                    Residenziale r = new Residenziale(codice, tipo_contratto, indirizzo, tipo, nome);
                    clienti.add(r);
                    line = br.readLine();
                    codCli.put(codice, r);
                }
                else
                {
                    String ragione_sociale = br.readLine();
                    double portata = Double.parseDouble(br.readLine());
                    String tipo_contratto = br.readLine();
                    String indirizzo = br.readLine();
                    Aziendale a = new Aziendale(codice, tipo_contratto, indirizzo, tipo, ragione_sociale, portata);
                    clienti.add(a);
                    line = br.readLine();
                    codCli.put(codice, a);
                }
                line = br.readLine();
            }
            br.close();

        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }

        System.out.println("ID Tipo Nome/Cognome RagioneSociale Indirizzo TipoContratto PortataMassima ");
        for(Cliente c : clienti)
        {
            System.out.println(c);
        }

        double max_lettura = 0.0;
        Cliente max = null;

        try
        {
            BufferedReader br = new BufferedReader(new FileReader("letture.txt"));
            String line = br.readLine();

            while(line != null)
            {
                StringTokenizer tok = new StringTokenizer(line);
                int codice = Integer.parseInt(tok.nextToken());
                double mq = Double.parseDouble(tok.nextToken());
                Cliente c = codCli.get(codice);
                Lettura lettura = new Lettura(codice, mq);
                c.addLettura(lettura);

                if(mq > max_lettura)
                {
                    max_lettura = mq;
                    max = c;
                }
                line = br.readLine();
            }
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }


        for(Cliente c : clienti)
        {
            if(c.getTipo().equals("aziendale"))
            {
                System.out.println(c.getNome() + " " + c.getTotale());
            }
            else
            {
                System.out.println(c.getNome() + " " + c.getTotale());
            }
        }

        System.out.println(max.getNome() + " " + max_lettura);

    }
    
}
