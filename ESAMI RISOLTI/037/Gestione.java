import java.io.*;
import java.util.*;

public class Gestione {

        static List<Campo> campi   = new LinkedList<Campo>();
        static List<Socio> soci   = new LinkedList<Socio>();
        static Map<Integer, Campo> codCampo=new HashMap<Integer,Campo>();
    public static void main(String[] args) {


        //PUNTO 1: memorizzazione squadre
        try {
            BufferedReader br = new BufferedReader(new FileReader("campi.txt"));
            String line=br.readLine();
            while (line!= null){
                StringTokenizer tok = new StringTokenizer(line);
                // statistiche
                int cod=Integer.parseInt(tok.nextToken());
                String sport=tok.nextToken();
                line                = br.readLine();
                String nome_campo = line;
                line= br.readLine();
                tok = new StringTokenizer(line);
                float larghezza          = Float.parseFloat(tok.nextToken());
                float lunghezza          = Float.parseFloat(tok.nextToken());
                  

                    if (sport.equals("tennis")) {
                        float temperatura=Float.parseFloat(tok.nextToken());
                        String terreno= br.readLine();
                        line= br.readLine();
                        float costo=Float.parseFloat(line);           
                        Campo c=new Tennis(cod,nome_campo,larghezza,lunghezza,temperatura,costo,terreno);
                        campi.add(c);
                        codCampo.put(cod,c);

                    } else {
                        float altezza=Float.parseFloat(tok.nextToken());
                        int piano=Integer.parseInt(tok.nextToken());
                        float costo=Float.parseFloat(tok.nextToken());           
                        Campo c=new Squash(cod,nome_campo,larghezza,lunghezza,altezza,costo,piano);
                        campi.add(c);
                        codCampo.put(cod,c);

                    }
                    line = br.readLine();
                }
            br.close();
        } catch (IOException e) {
            System.err.println(e);
        }
        catch (Exception e) {
			System.err.println(e);
        }
        //PUNTO 2: lettura di tutti i giocatori

        try {
            BufferedReader br = new BufferedReader(new FileReader("soci.txt"));
            String line=br.readLine();
            while (line!= null){
                 int codice=Integer.parseInt(line);
                 String nome_cognome=br.readLine();
                 line=br.readLine();
                StringTokenizer tok = new StringTokenizer(line);
                // statistiche
        int eta             = Integer.parseInt(tok.nextToken());
        int categoria          = Integer.parseInt(tok.nextToken());
        
        Socio s=new Socio(codice,nome_cognome,eta,categoria);
        soci.add(s);
                    line = br.readLine();
                    tok = new StringTokenizer(line);

                    while (tok.hasMoreTokens())
                    {
                        int cod=Integer.parseInt(tok.nextToken());
                        int ora=Integer.parseInt(tok.nextToken());
                        Prenotazione pren= new Prenotazione(cod,ora);
                        s.addPrenotazione(pren);
                        codCampo.get(cod).addPrenotazione();
                    }
                    line = br.readLine();
                }
            br.close();
            }
        catch (IOException e) {
            System.err.println(e);
        }
        catch (Exception e) {
			System.err.println(e);
        }


        //PUNTO 3: stampa di tutti campi
        System.out.println("sport, nome del campo, codice, larghezza, lunghezza, temperatura, terreno, altezza, piano, costo");
        for (Campo c : campi)
            System.out.println(c);

        //PUNTO 4: elenco dei soci
        System.out.println("codice, nome e cognome, età, prenotazioni");
        for (Socio s : soci)
          System.out.println(s);

        //PUNTO 5: stampe dell'incasso di un campo
        int cod=Integer.parseInt(args[0]);

        System.out.println(codCampo.get(cod).incasso());
    
}//main

}
