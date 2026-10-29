import java.util.LinkedList;
import java.util.List;

public class Cliente 
{
    private String nomeCognome;
    private List<Noleggio> noleggi;

    public Cliente(String nomeCognome)
    {
        this.nomeCognome = nomeCognome;
        noleggi = new LinkedList<>();
    }

    public double getTotale()
    {
        double tot = 0;
        for(Noleggio n : noleggi)
        {
            tot += n.getCostoTotale();
        }
        return tot;
    }

    public void addNoleggio(String targa, int giorni,double costo)
    {
        Noleggio n = new Noleggio(targa, giorni, costo);
        noleggi.add(n);
    }

    public String toString()
    {
        return nomeCognome + "\t" + this.getTotale() + "\t" + noleggi.size() + "\t" + noleggi;
    }
}
