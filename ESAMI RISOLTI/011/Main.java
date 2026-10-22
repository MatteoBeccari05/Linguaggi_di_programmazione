import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

public class Main {
    private Map<Integer, Iscritto> iscrittiMap;

    public Main() {
        this.iscrittiMap = new LinkedHashMap<>();
    }

    // Lettura del file iscritti.txt (Punto 1)
    public void leggiIscritti(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String nomeCognome;
            while ((nomeCognome = br.readLine()) != null) {
                nomeCognome = nomeCognome.trim();
                if (nomeCognome.isEmpty()) continue;

                String riga2 = br.readLine();
                if (riga2 == null) break;
                String[] parti2 = riga2.trim().split("\\s+");
                int codice = Integer.parseInt(parti2[0]);
                String tipo = parti2[1];
                int eta = Integer.parseInt(parti2[2]);

                String riga3 = br.readLine().trim();
                String indirizzo = br.readLine().trim();

                if (tipo.equalsIgnoreCase("docente")) {
                    Docente d = new Docente(codice, nomeCognome, eta, indirizzo, riga3);
                    iscrittiMap.put(codice, d);
                } else if (tipo.equalsIgnoreCase("studente")) {
                    double votoMedio = Double.parseDouble(riga3);
                    Studente s = new Studente(codice, nomeCognome, eta, indirizzo, votoMedio);
                    iscrittiMap.put(codice, s);
                }
            }
        } catch (IOException e) {
            System.err.println("Errore di lettura nel file " + filename + ": " + e.getMessage());
        }
    }

    // Lettura del file contatti.txt (Punto 2)
    public void leggiContatti(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()) continue;

                String[] parti = line.split("\\s+");
                int codiceOrigine = Integer.parseInt(parti[0]);
                Iscritto origine = iscrittiMap.get(codiceOrigine);

                if (origine != null) {
                    for (int i = 1; i < parti.length; i++) {
                        int codiceDest = Integer.parseInt(parti[i]);
                        Iscritto destinazione = iscrittiMap.get(codiceDest);
                        if (destinazione != null) {
                            origine.addContatto(destinazione);
                        }
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Errore di lettura nel file " + filename + ": " + e.getMessage());
        }
    }

    // Stampa tabella di tutti gli iscritti (Punto 3)
    public void stampaTabellaIscritti() {
        System.out.printf("%-10s %-20s %-8s %-6s %-22s %-8s %-30s%n",
                "tipo", "nome e cognome", "codice", "età", "corso principale", "media", "indirizzo");

        for (Iscritto i : iscrittiMap.values()) {
            String corso = "-";
            String media = "-";

            if (i instanceof Docente) {
                corso = ((Docente) i).getCorsoPrincipale();
            } else if (i instanceof Studente) {
                media = String.format(Locale.US, "%.1f", ((Studente) i).getVotoMedio());
            }

            System.out.printf("%-10s %-20s %-8d %-6d %-22s %-8s %-30s%n",
                    i.getTipo(),
                    i.getNomeCognome(),
                    i.getCodice(),
                    i.getEta(),
                    corso,
                    media,
                    i.getIndirizzo());
        }
    }

    // Stampa media età contatti per ciascun docente (Punto 4)
    public void stampaMediaEtaContattiDocenti() {
        for (Iscritto i : iscrittiMap.values()) {
            if (i instanceof Docente) {
                Docente d = (Docente) i;
                System.out.printf("Docente: %s | Media età contatti: %.2f%n",
                        d.getNomeCognome(), d.getMediaEtaContatti());
            }
        }
    }

    // Stampa numero contatti per ciascuno studente (Punto 5)
    public void stampaNumeroContattiStudenti() {
        for (Iscritto i : iscrittiMap.values()) {
            if (i instanceof Studente) {
                Studente s = (Studente) i;
                System.out.printf("Studente: %s | Numero contatti: %d%n",
                        s.getNomeCognome(), s.getNumeroContatti());
            }
        }
    }

    public static void main(String[] args) {
        Main app = new Main();
        app.leggiIscritti("iscritti.txt");
        app.leggiContatti("contatti.txt");

        System.out.println("=== TABELLA ISCRITTI ===");
        app.stampaTabellaIscritti();

        System.out.println("\n=== MEDIA ETÀ CONTATTI DOCENTI ===");
        app.stampaMediaEtaContattiDocenti();

        System.out.println("\n=== NUMERO CONTATTI STUDENTI ===");
        app.stampaNumeroContattiStudenti();
    }
}