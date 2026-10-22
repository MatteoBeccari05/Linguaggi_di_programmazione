
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
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
public class Autoconcessionaria {

    static List<Filiale> filiali = new LinkedList<>();
    static List<Automezzo> automezzi = new LinkedList<>();

    public static void main(String[] args) {

        //PUNTO 1: memorizzazione filiali
        try {
            BufferedReader br = new BufferedReader(new FileReader("filiali.txt"));
            String line = br.readLine();
            while (line != null) {
                int cod = Integer.parseInt(line);
                String nome = br.readLine();
                String indirizzo = br.readLine();
                int n_addetti = Integer.parseInt(br.readLine());

                br.readLine(); // linea vuota
                line = br.readLine();

                filiali.add(new Filiale(cod, n_addetti, nome, indirizzo));
            }
            br.close();
        } catch (IOException e) {
            System.err.println(e);
        } catch (Exception e) {
            System.err.println(e);
        }

//PUNTO 2: lettura di tutti gli automezzi

        try {
            BufferedReader br = new BufferedReader(new FileReader("automezzi.txt"));
            String line = br.readLine();
            while (line != null) {
                String tipo = line;
                String modello = br.readLine();
                String n_telaio = br.readLine();

                String dati_specifici = br.readLine();

                StringTokenizer tok = new StringTokenizer(br.readLine());
                int n_posti = Integer.parseInt(tok.nextToken());
                float cilindrata = Float.parseFloat(tok.nextToken());
                int cavalli = Integer.parseInt(tok.nextToken());

                List<Filiale> filiali_passate = new ArrayList<>();
                Filiale filiale_attuale = null; // Solo per inizializzazione
                tok = new StringTokenizer(br.readLine());
                while (tok.hasMoreTokens()) {
                    int codice_filiale = Integer.parseInt(tok.nextToken());
                    if (tok.hasMoreTokens()) {
                        Filiale f = trovaFiliale(codice_filiale);
                        filiali_passate.add(f);
                    } else { // ultima filiale
                        filiale_attuale = trovaFiliale(codice_filiale);
                    }
                }

                Automezzo a;
                tok = new StringTokenizer(dati_specifici);
                if (tipo.equals("automobile")) {
                    String tipologia = tok.nextToken();
                    int n_porte = Integer.parseInt(tok.nextToken());
                    a = new Automobile(tipologia, n_porte, modello, n_telaio, n_posti, cavalli, filiale_attuale, cilindrata, filiali_passate);
                } else {
                    int n_assi = Integer.parseInt(tok.nextToken());
                    boolean cassone = Boolean.parseBoolean(tok.nextToken());
                    a = new VeicoloCommerciale(n_assi, cassone, modello, n_telaio, n_posti, cavalli, filiale_attuale, cilindrata, filiali_passate);
                }

                a.getFiliale_attuale().addAutomezzo(a);
                automezzi.add(a);
                line = br.readLine();
            }
            br.close();
        } catch (IOException e) {
            System.err.println(e);
        } catch (Exception e) {
            System.err.println(e);
        }

        //PUNTO 3: stampa di tutti gli automezzi
        System.out.println("\ntipo\tmodello\t\tn. telaio\t\tn. posti\tcilindrata\tpotenza\ttipologia\tn. porte\tn. assi\tcassone");
        for (Automezzo a : automezzi) {
            System.out.println(a);
        }

        //PUNTO 4: storico concessionarie degli automezzi
        System.out.println("Stampa filiali per ogni automezzo\n");
        for (Automezzo a : automezzi) {
            System.out.println(a.getModello() + " " + a.getN_telaio());
            System.out.println("Filiale Attuale: " + a.getFiliale_attuale().getNome());
            for (Filiale f : a.getFiliali_passate())
                System.out.println("\t" + f.getNome());
        }

        //PUNTO 5: stampa del numero di mezzi in magazzino di ogni filiale
        for (Filiale f : filiali) {
            System.out.println(f);
            System.out.println("Numero mezzi in magazzino: " + f.getAutomezzi().size());
        }
    }//main

    private static Filiale trovaFiliale(int codice_filiale) {
        Filiale f = null;
        for (Filiale e : filiali) {
            if (e.getCodice() == codice_filiale) {
                return e;
            }
        }
        return f;
    }

}
