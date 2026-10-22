import java.io.*;
import java.util.*;

public class Catena {

        static List<Locale> locali   = new LinkedList<Locale>();
    public static void main(String[] args) {


        //PUNTO 1: memorizzazione squadre
        try {
            BufferedReader br = new BufferedReader(new FileReader("ristoranti.txt"));
            String line=br.readLine();
            while (line!= null){
                StringTokenizer tok = new StringTokenizer(line);
                // statistiche
                int cod=Integer.parseInt(tok.nextToken());
                String tipo=tok.nextToken();
                line                = br.readLine();
                String nome = line;
                line= br.readLine();
                tok = new StringTokenizer(line);
                    if (tipo.equals("pub")) {
                        int dip=Integer.parseInt(tok.nextToken());
                        int tavoli=Integer.parseInt(tok.nextToken());
                        Locale l=new Pub(cod,nome,dip,tavoli);
                        locali.add(l);
                    } else {
                        int posti=Integer.parseInt(tok.nextToken());
                        float sup=Float.parseFloat(tok.nextToken());
                        boolean bagno=Boolean.parseBoolean(tok.nextToken());
                        Locale l=new Osteria(cod,nome,posti,sup,bagno);
                        locali.add(l);
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
            BufferedReader br = new BufferedReader(new FileReader("menu.txt"));
            String line=br.readLine();
            while (line!= null){
                 int codice=Integer.parseInt(line);
                 String desc=br.readLine();
                 line=br.readLine();
                StringTokenizer tok = new StringTokenizer(line);
                // statistiche
        String tipo        = tok.nextToken();
        float prezzo=Float.parseFloat(tok.nextToken());
        float costo=Float.parseFloat(tok.nextToken());
        
        Locale l=trovaLocale(codice);
        Prodotto p=new Prodotto(desc,tipo,prezzo,costo);
        l.addProdotto(p);
                    line = br.readLine();
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


        //PUNTO 3: stampa di tutti i locali
        System.out.println("nome, codice, tipo, n. dipendenti, n. tavoli, n. posti, superficie, bagno disabili");
        for (Locale l : locali)
            System.out.println(l);

        //PUNTO 4: stampa menu
        for (Locale l : locali)
        {
          System.out.println(l.getNome());
          List<Prodotto> menu   = l.getMenu();
          System.out.println("\t"+menu);
        }
        //PUNTO 5: stampe del del locale che ha il prezzo medio più alto
        System.out.println();

        System.out.print("Il locale con il prezzo media più alto è ");

        float max=0;
        String nome=null;
        for (Locale l : locali)
        {
          float media =l.getMedia();
          if (media>max)
            {
                max=media;
                nome=l.getNome();
            }
        }    
      System.out.println(nome);
}//main

    private static Locale trovaLocale(int codice)  {
      Locale loc=null;
        for (Locale l: locali)
        if (l.getCodice()==codice) loc=l;
        return loc;
    }
}
