import java.io.*;
import java.util.*;

public class Polisportiva {

        static List<Squadra> squadre   = new LinkedList<Squadra>();
    public static void main(String[] args) {


        //PUNTO 1: memorizzazione squadre
        try {
            BufferedReader br = new BufferedReader(new FileReader("squadre.txt"));
            String line=br.readLine();
            while (line!= null){
                String nome_squadra = line;
                line= br.readLine();
                StringTokenizer tok = new StringTokenizer(line);
                // statistiche
                int cod=Integer.parseInt(tok.nextToken());
                String sport=tok.nextToken();
                line                = br.readLine();
                tok = new StringTokenizer(line);
                int pvinte          = Integer.parseInt(tok.nextToken());
                int pperse          = Integer.parseInt(tok.nextToken());
                float media         = Float.parseFloat(tok.nextToken());
                    line = br.readLine(); 

                    if (sport.equals("basket")) {
                        Squadra s=new Basket(cod,nome_squadra,pvinte,pperse,media);
                        squadre.add(s);
                    } else {
                        Squadra s=new Pallavolo(cod,nome_squadra,pvinte,pperse,media);
                        squadre.add(s);
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
            BufferedReader br = new BufferedReader(new FileReader("giocatori.txt"));
            String line=br.readLine();
            while (line!= null){
                StringTokenizer tok = new StringTokenizer(line);
                // statistiche
                int codice_squadra=Integer.parseInt(tok.nextToken());
        String cognome      = tok.nextToken();
        int eta             = Integer.parseInt(tok.nextToken());
        int maglia          = Integer.parseInt(tok.nextToken());
        String ruolo        = tok.nextToken();
        boolean tit         = Boolean.parseBoolean(tok.nextToken());
        Giocatore g=new Giocatore(cognome,eta,maglia,ruolo,tit);
        trovaSquadra(codice_squadra).addGiocatore(g);
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
        System.out.println("\nnome della squadra\tcodice\tn. partite vinte\tn. partite perse\tpunteggio medio\tn. medio di set vinti\tsport\n");
        for (Squadra s : squadre)
            System.out.println(s);        

        //PUNTO 4: conteggio giocatori per squadra
        System.out.println("N. giocatori per squadra\n");
        for (Squadra s : squadre)
          System.out.println(s.getNome()+"\t"+s.nGiocatori());
        
        //PUNTO 5: stampe dei giocatori per squadra
        System.out.println("Giocatori della squadra "+args[0]);
        for (Giocatore g : trovaSquadra(args[0]).getGiocatori())
          System.out.println(g);
}//main

    private static Squadra trovaSquadra(int codice)  {
      Squadra sq=null;
        for (Squadra s: squadre)
        if (s.getCodice()==codice) sq=s;
        return sq;
    }
    private static Squadra trovaSquadra(String nome)  {
      Squadra sq=null;
        for (Squadra s: squadre)
        if (s.getNome().equals(nome)) sq=s;
        return sq;
    }
}
