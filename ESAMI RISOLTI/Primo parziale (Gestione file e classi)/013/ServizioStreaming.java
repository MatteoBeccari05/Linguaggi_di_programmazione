
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Riccardo
 */
public class ServizioStreaming {
    
    static List<Spettacolo> spettacoli = new LinkedList<Spettacolo>();
    static List<Persona> visualizzazioni = new LinkedList<Persona>();
    
    public static void main(String[] args) {

        //PUNTO 1: memorizzazione spettacoli
        try {
            BufferedReader br = new BufferedReader(new FileReader("spettacoli.txt"));
            String line = br.readLine();
            while (line != null) {
                String titolo = line;
                line = br.readLine();
                StringTokenizer tok = new StringTokenizer(line);
                int cod = Integer.parseInt(tok.nextToken());
                String tipo = tok.nextToken();
                String dato = br.readLine();
                String produttore = br.readLine();
                int anno = Integer.parseInt(br.readLine());

                if (tipo.equals("film")) {
                    Spettacolo e = new Film(titolo, cod, dato, produttore, anno);
                    spettacoli.add(e);
                } else {
                    tok = new StringTokenizer(dato);
                    int stagione = Integer.parseInt(tok.nextToken());
                    int puntate = Integer.parseInt(tok.nextToken());
                    Spettacolo e = new Serie(titolo, cod, stagione, puntate, produttore, anno);
                    spettacoli.add(e);
                }
                line = br.readLine();
            }
            br.close();
        } catch (IOException e) {
            System.err.println(e);
        } catch (Exception e) {
            System.err.println(e);
        }
        //PUNTO 2: lettura di tutte le visualizzazioni

        try {
            BufferedReader br = new BufferedReader(new FileReader("visualizzazioni.txt"));
            String line = br.readLine();
            while (line != null) {
                StringTokenizer tok = new StringTokenizer(line);
                int codice_persona = Integer.parseInt(tok.nextToken());
                String nome = tok.nextToken();
                String cognome = tok.nextToken();
                Persona p = new Persona(codice_persona, nome, cognome);
                tok = new StringTokenizer(br.readLine());
                while (tok.hasMoreTokens()) {
                    int codice_spettacolo = Integer.parseInt(tok.nextToken());
                    Spettacolo s = trovaSpettacolo(codice_spettacolo);
                    p.addVisualizzazione(s);
                }
                visualizzazioni.add(p);
                line = br.readLine();
            }
            br.close();
        } catch (IOException e) {
            System.err.println(e);
        } catch (Exception e) {
            System.err.println(e);
        }

        //PUNTO 3: stampa di tutti gli spettacoli
        System.out.println("\ntipo\ttitolo\tcodice\tstagione\tn. puntate\tdurata\tanno\tproduttore\n");
        for (Spettacolo s : spettacoli) {
            System.out.println(s);
        }

        //PUNTO 4: conteggio ricavi per per evento
        System.out.println("Stampa spettacoli per ogni iscritto\n");
        for (Persona p : visualizzazioni) {
            System.out.println(p.getNome() + " " + p.getCognome());
            for (Spettacolo s : p.getVisti())
                System.out.println("\t" + s.getTitolo() + " - " + 
                        (s.getClass().equals(Film.class) ? "Film" : "SerieTV"));
        }

        //PUNTO 5: stampa del numerod i spettacoli visti da ciascun iscritto
        for (Persona p : visualizzazioni) {
            System.out.println(p.getNome() + " " + p.getCognome() + ": " + 
                    p.getVisti().size());
        }
    }//main

    private static Spettacolo trovaSpettacolo(int codice_spettacolo) {
        Spettacolo s = null;
        for (Spettacolo e : spettacoli) {
            if (e.getCodice() == codice_spettacolo) {
                s = e;
            }
        }
        return s;
    }
    
}
