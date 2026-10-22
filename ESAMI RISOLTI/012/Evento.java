
import java.util.*;

public class Evento {

    private int codice;
    private String nome;
    private int nPosti;
    private int giorno, mese, anno, ora, minuti;
    private String struttura;
    private float prezzo;
    private List<Prenotazione> prenotazioni;

    public Evento(int c, String n, int p, int g, int m, int a, int o, int mm, float pr, String s) {
        codice = c;
        nome = n;
        nPosti = p;
        giorno = g;
        mese = m;
        anno = a;
        ora = o;
        minuti = mm;
        struttura = s;
        prezzo = pr;
        prenotazioni = new LinkedList<Prenotazione>();
    }

    public void addPrenotazione(Prenotazione g) {
        prenotazioni.add(g);
    }

    public int nPrenotazioni() {
        return prenotazioni.size();
    }

    public int getCodice() {
        return codice;
    }

    public List<Prenotazione> getPrenotazioni() {
        return prenotazioni;
    }

    public String getNome() {
        return nome;
    }
    
    public float getPrezzo() {
        return prezzo;
    }

    public int getGiorno() {
        return giorno;
    }

    public int getMese() {
        return mese;
    }

    public int getAnno() {
        return anno;
    }

    public String toString() {
        return nome + "\t" + codice + "\t" + struttura + "\t" + 
                giorno + "/" + mese + "/" + anno + "," + ora + ":" + minuti + "\t" + prezzo;
    }
}
