import java.io.*;
import java.util.*;

public class Polisportiva {

        static List<Squadra> squadre   = new LinkedList<Squadra>();
        static List<Squadra> pallamano   = new LinkedList<Squadra>();
        static List<Squadra> hockey   = new LinkedList<Squadra>();
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
                float media         = Float.parseFloat(tok.nextToken());
                  

                    if (sport.equals("hockey")) {
                        float media_falli=Float.parseFloat(tok.nextToken());
                        Squadra s=new Hockey(cod,nome_squadra,pvinte,pperse,media,media_falli);
                        squadre.add(s);
                        hockey.add(s);
                    } else {
                        Squadra s=new Pallamano(cod,nome_squadra,pvinte,pperse,media);
                        squadre.add(s);
                        pallamano.add(s);
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
        int eta             = Integer.parseInt(tok.nextToken());
        int maglia          = Integer.parseInt(tok.nextToken());
        String ruolo        = tok.nextToken();
        boolean tit         = Boolean.parseBoolean(tok.nextToken());
        
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
        System.out.println("nome della squadra, codice, n. partite vinte, n. partite perse, n. medio di gol, n. medio di falli, n. medio di reti, sport");
        for (Squadra s : squadre)
            System.out.println(s);

        //PUNTO 4: elenco giocatori
        System.out.println("nome, cognome, età, numero di maglia, ruolo, titolare, nome squadra");
        for (Giocatore g : giocatori)
          System.out.println(g);

        //PUNTO 5: stampe del punteggio medio per sport
        
        System.out.println("media parte vinte delle squadre di hockey: "+media(hockey));
        System.out.println("media parte vinte delle squadre di pallamano: "+media(pallamano));

    
}//main

    private static Squadra trovaSquadra(int codice)  {
      Squadra sq=null;
        for (Squadra s: squadre)
        if (s.getCodice()==codice) sq=s;
        return sq;
    }
    private static double media(List<Squadra> squadre)  {
        double somma=0.0;
        for (Squadra s: squadre)
           somma=somma+s.getVinte();
        return somma/squadre.size();
    }
}
