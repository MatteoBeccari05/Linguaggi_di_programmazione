
import java.util.*;

public class Partita extends Evento {

    private String sport;

    public Partita(int c, String n, int p, int g, int m, int a, int o, int mm, String s, float pr, String sport) {
        super(c, n, p, g, m, a, o, mm, pr, s);
        this.sport = sport;
    }

    public String toString() {
        // tipo, nome, codice, struttura, data, prezzo, numero posti, durata, sport
        return "partita \t" + super.toString() + "\t-\t" + sport;
    }

}
