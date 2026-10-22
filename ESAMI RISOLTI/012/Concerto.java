
import java.util.*;

public class Concerto extends Evento {

    private int durata;

    public Concerto(int c, String n, int p, int g, int m, int a, int o, int mm, String s, float pr, int durata) {
        super(c, n, p, g, m, a, o, mm, pr, s);
        this.durata = durata;
    }

    public String toString() {
        // tipo, nome, codice, struttura, data, prezzo, numero posti, durata, sport
        return "concerto\t" + super.toString() + "\t" + durata + "\t-";
    }
}
