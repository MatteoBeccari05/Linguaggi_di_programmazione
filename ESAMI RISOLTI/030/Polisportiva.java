import java.io.*;
import java.util.*;

public class Polisportiva {

        static List<Squadra> squadre   = new LinkedList<Squadra>();
        static List<Giocatore> giocatori   = new LinkedList<Giocatore>();
    public static void main(String[] args) {


        //PUNTO 1: memorizzazione squadre
        try {
            BufferedReader br = new BufferedReader(new FileReader("squadre.txt"));
            String line=br.readLine();
            while (line!= null){
                StringTokenizer tok = new StringTokenizer(line);
                // statistiche
                int cod=Integer.parseInt(tok.nextToken());
                String sport=tok.nextToken();
                line                = br.readLine();
                String nome_squadra = line;
                line= br.readLine();
                tok = new StringTokenizer(line);
                int pvinte          = Integer.parseInt(tok.nextToken());
                int pperse          = Integer.parseInt(tok.nextToken());
                  

                    if (sport.equals("pallacanestro")) {
                        float media_falli=Float.parseFloat(tok.nextToken());
                        int punti_tot=Integer.parseInt(tok.nextToken());
                        Squadra s=new Pallacanestro(cod,nome_squadra,pvinte,pperse,punti_tot,media_falli);
                        squadre.add(s);
                    } else {
                float media         = Float.parseFloat(tok.nextToken());
                        Squadra s=new Pallamano(cod,nome_squadra,pvinte,pperse,media);
                        squadre.add(s);
                    }
                    line = br.readLine();
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
            BufferedReader br = new BufferedReader(new FileReader("giocatori.txt"));
            String line=br.readLine();
            while (line!= null){
                 int codice_squadra=Integer.parseInt(line);
                 String cognome=br.readLine();
                 String nome=br.readLine();
                 line=br.readLine();
                StringTokenizer tok = new StringTokenizer(line);
                // statistiche
        boolean tit         = Boolean.parseBoolean(tok.nextToken());
        int eta             = Integer.parseInt(tok.nextToken());
        int maglia          = Integer.parseInt(tok.nextToken());
        String ruolo        = tok.nextToken();
        
        Squadra s=trovaSquadra(codice_squadra);
        Giocatore g=new Giocatore(cognome,nome,eta,maglia,ruolo,tit,s);
        s.addGiocatore(g);
        giocatori.add(g);
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


        //PUNTO 3: stampa di tutte le squadre
        System.out.println("nome della squadra, codice, n. partite vinte, n. partite perse, punti totali, n. medio di falli, n. medio di reti, sport");
        for (Squadra s : squadre)
            System.out.println(s);

        //PUNTO 4: elenco giocatori titolari
        System.out.println("nome, cognome, età, numero di maglia, ruolo, titolare, nome squadra");
        for (Giocatore g : giocatori)
          if (g.Titolare())
            System.out.println(g);

        //PUNTO 5: stampe del punteggio medio per sport
        
        for (Squadra s : squadre)
            System.out.println(s.getNome()+ " "+ s.nGiocatori());
    
}//main

    private static Squadra trovaSquadra(int codice)  {
      Squadra sq=null;
        for (Squadra s: squadre)
        if (s.getCodice()==codice) sq=s;
        return sq;
    }

}
