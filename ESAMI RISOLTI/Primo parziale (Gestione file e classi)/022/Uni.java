import java.io.*;
import java.util.*;

public class Uni {

        static List<Corso> corsi   = new LinkedList<Corso>();
        static List<Studente> studenti   = new LinkedList<Studente>();
        static Map<Integer,String> nomeCorsi = new HashMap<Integer,String>();
    public static void main(String[] args) {


        //PUNTO 1: memorizzazione squadre
        try {
            BufferedReader br = new BufferedReader(new FileReader("corsi.txt"));
            String line=br.readLine();
            while (line!= null){
                StringTokenizer tok = new StringTokenizer(line);
                // statistiche
                int cod=Integer.parseInt(tok.nextToken());
                String tipo=tok.nextToken();
                line                = br.readLine();
                String nome = line;
                line                = br.readLine();
                String docente = line;
                nomeCorsi.put(cod,nome);
                line= br.readLine();
                    if (tipo.equals("teoria")) {
                        tok = new StringTokenizer(line);
                        int aula=Integer.parseInt(tok.nextToken());
                        int ore=Integer.parseInt(tok.nextToken());
                        double oreLez=Double.parseDouble(tok.nextToken());
                        Corso c=new Teoria(cod,nome,docente,aula,ore,oreLez);
                        corsi.add(c);
                    } else {
                        String lab=line;
                        line = br.readLine();
                        String ass= line;
                        line = br.readLine();
                        int posti=Integer.parseInt(line);
                        Corso c=new Lab(cod,nome,docente,lab,ass,posti);
                        corsi.add(c);
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
            BufferedReader br = new BufferedReader(new FileReader("studenti.txt"));
            String line=br.readLine();
            while (line!= null){
                int mat=Integer.parseInt(line);
                String nome=br.readLine();
                line=br.readLine();
                Studente s=new Studente(mat, nome);
                studenti.add(s);
                while (line!= null && !line.equals("")){
                    StringTokenizer tok = new StringTokenizer(line);
                    int cod=Integer.parseInt(tok.nextToken());
                    String voto = tok.nextToken();
                    Esame e= new Esame(cod,voto);
                    s.addEsame(e);
                    line=br.readLine();
                }
                line=br.readLine();
            }
           br.close();
            }
        catch (IOException e) {
            System.err.println(e);
        }


        //PUNTO 3: stampa di tutti i corsi
        System.out.println("nome, codice, docente, tipo, aula, ore sett., ore/lez., lab., assistente, postazioni");
        for (Corso c : corsi)
            System.out.println(c);

        //PUNTO 4: stampa studenti
        for (Studente s : studenti)
          System.out.println(s);

        //PUNTO 5: stampe dell'esame con voto piu' alto
        System.out.println();
        int mat=Integer.parseInt(args[0]);
        for (Studente s : studenti)
        {
            if (s.getMat()==mat)
            {
                Esame maxe=s.votoMax();
                int codc=maxe.getCorso();
                System.out.println(s.getNome()+" "+nomeCorsi.get(codc)+" "+maxe.getVotoAsString());

            }
        }

    }
}
