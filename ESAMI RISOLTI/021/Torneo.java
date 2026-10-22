import java.io.*;
import java.util.*;

public class Torneo {

        static List<Giocatore> giocatori   = new LinkedList<Giocatore>();
    public static void main(String[] args) {


        //PUNTO 1: memorizzazione giocatori
        try {
            BufferedReader br = new BufferedReader(new FileReader("giocatori.txt"));
            String line=br.readLine();
            while (line!= null){
                int cod=Integer.parseInt(line);
                line                = br.readLine();
                String tipo = line;
                line= br.readLine();
                String nome=line;
                line= br.readLine();
                if (tipo.equals("testa-di-serie")) {
                        StringTokenizer tok = new StringTokenizer(line);
                        int rank=Integer.parseInt(tok.nextToken());
                        int eta=Integer.parseInt(tok.nextToken());
                        boolean prof=Boolean.parseBoolean(tok.nextToken());
                        Giocatore g=new TestaDiSerie(cod,nome,rank,eta,prof);
                        giocatori.add(g);
                    } else {
                        String circolo=line;
                        line= br.readLine();                
                        StringTokenizer tok = new StringTokenizer(line);
                        int set=Integer.parseInt(tok.nextToken());
                        int partite=Integer.parseInt(tok.nextToken());
                        Giocatore g=new Normale(cod,nome,partite,set,circolo);
                        giocatori.add(g);
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
            BufferedReader br = new BufferedReader(new FileReader("partite.txt"));
            String line=br.readLine();
            while (line!= null){
                StringTokenizer tok = new StringTokenizer(line);
                int codice1=Integer.parseInt(tok.nextToken());
                int codice2=Integer.parseInt(tok.nextToken());
                line=br.readLine();
                tok = new StringTokenizer(line);
                int set1=Integer.parseInt(tok.nextToken());
                int set2=Integer.parseInt(tok.nextToken());
        
        Giocatore g=trovaGioc(codice1);
        Partita p=new Partita(codice2,set1,set2);
        g.addPartita(p);
        g=trovaGioc(codice2);
        p=new Partita(codice1,set2,set1);
        g.addPartita(p);                    
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


        //PUNTO 3: stampa di tutti i giocatori
        System.out.println("nome, codice, tipo, ranking, età, professionista, circolo, n. set vinti, n. partite");
        for (Giocatore g : giocatori)
            System.out.println(g);

        //PUNTO 4: stampa partite
        for (Giocatore g : giocatori)
        {
          System.out.println(g.getNome());
          List<Partita> partite   = g.getPartite();
          System.out.println("\t"+partite);
        }
        //PUNTO 5: stampe del del giocatore che ha che ha vinto più partite
        System.out.println();

        System.out.print("Il giocatore che ha che ha vinto più partite è ");

        int max=0;
        String nome=null;
        for (Giocatore g : giocatori)
        {
          int vinte =g.getVinte();
          if (vinte>max)
            {
                max=vinte;
                nome=g.getNome();
            }
        }    
      System.out.println(nome);
}//main

    private static Giocatore trovaGioc(int codice)  {
        Giocatore gioc=null;
        for (Giocatore g: giocatori)
        if (g.getCodice()==codice) gioc=g;
        return gioc;
    }
}
