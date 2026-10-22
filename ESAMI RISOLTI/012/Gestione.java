
import java.io.*;
import java.util.*;

public class Gestione {

    static List<Evento> eventi = new LinkedList<Evento>();

    public static void main(String[] args) {

        //PUNTO 1: memorizzazione eventi
        try {
            BufferedReader br = new BufferedReader(new FileReader("eventi.txt"));
            String line = br.readLine();
            while (line != null) {
                String nome_evento = line;
                line = br.readLine();
                StringTokenizer tok = new StringTokenizer(line);
                // statistiche
                int cod = Integer.parseInt(tok.nextToken());
                String tipo = tok.nextToken();
                int posti = Integer.parseInt(tok.nextToken());
                String dato = br.readLine();
                String struttura = br.readLine();
                line = br.readLine();
                tok = new StringTokenizer(line);
                int giorno = Integer.parseInt(tok.nextToken());
                int mese = Integer.parseInt(tok.nextToken());
                int anno = Integer.parseInt(tok.nextToken());
                int ora = Integer.parseInt(tok.nextToken());
                int minuti = Integer.parseInt(tok.nextToken());
                float prezzo = Float.parseFloat(br.readLine());

                if (tipo.equals("partita")) {
                    Evento e = new Partita(cod, nome_evento, posti, giorno, mese, anno, ora, minuti, struttura, prezzo, dato);
                    eventi.add(e);
                } else {
                    int durata = Integer.parseInt(dato);
                    Evento e = new Concerto(cod, nome_evento, posti, giorno, mese, anno, ora, minuti, struttura, prezzo, durata);
                    eventi.add(e);
                }
                line = br.readLine();
            }
            br.close();
        } catch (IOException e) {
            System.err.println(e);
        } catch (Exception e) {
            System.err.println(e);
        }
        //PUNTO 2: lettura di tutte le prenotazioni

        try {
            BufferedReader br = new BufferedReader(new FileReader("prenotazioni.txt"));
            String line = br.readLine();
            while (line != null) {
                StringTokenizer tok = new StringTokenizer(line);
                // statistiche
                int codice_prenotazione = Integer.parseInt(tok.nextToken());
                String nome = tok.nextToken();
                String cognome = tok.nextToken();
                int posto = Integer.parseInt(tok.nextToken());
                boolean dip = Boolean.parseBoolean(tok.nextToken());
                Prenotazione p = new Prenotazione(nome, cognome, posto, dip);
                trovaEvento(codice_prenotazione).addPrenotazione(p);
                line = br.readLine();
            }
            br.close();
        } catch (IOException e) {
            System.err.println(e);
        } catch (Exception e) {
            System.err.println(e);
        }

        //PUNTO 3: stampa di tutti gli eventi
        System.out.println("\ntipo ev\tnome\tcodice\tstruttura\t\tdata\tprezzo\tn. posti\tdurata\tsport\n");
        for (Evento e : eventi) {
            System.out.println(e);
        }

        //PUNTO 4: conteggio ricavi per per evento
        System.out.println("Ricavi per evento\n");
        for (Evento e : eventi) {
            System.out.println(e.getNome() + "\t" + (e.nPrenotazioni() * e.getPrezzo()));
        }

        //PUNTO 5: stampe delle prenotazioni degli eventi passati
        for (Evento e : eventi) {

            if (eventoPassato(e)) {
                System.out.println("Prentazioni dell'evento " + e.getNome());
                for (Prenotazione p : e.getPrenotazioni()) {
                    System.out.println(p);
                }
            }
        }
    }//main

    private static Evento trovaEvento(int codice) {
        Evento ev = null;
        for (Evento e : eventi) {
            if (e.getCodice() == codice) {
                ev = e;
            }
        }
        return ev;
    }

    private static boolean eventoPassato(Evento e) {
        if (e.getAnno() < 2016) {
            return true;
        }
        if (e.getMese() < 9) {
            return true;
        }
        if (e.getMese() == 9 && e.getGiorno() < 14) {
            return true;
        }
        return false;
    }
}
