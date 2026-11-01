import java.util.LinkedList;
import java.util.List;

public class Conferenza 
{
    protected String nome;
    protected String luogo;
    protected List<Partecipazione> partecipazioni;

    public Conferenza(String nome, String luogo)
    {
        this.nome = nome;
        this.luogo = luogo;
        partecipazioni = new LinkedList<>();
    }

    public int getTotale()
    {
        int totale = 0;
        for(Partecipazione p : partecipazioni)
        {
            totale += p.getSpesa();
        }
        return totale;
    }

    public void addPartecipazione(Partecipazione p)
    {
        partecipazioni.add(p);
    }

    public String toString()
    {
        return String.format("\n%s\n%s\n%d%10d", nome, luogo, getTotale(), partecipazioni.size()) + "\n" + partecipazioni;
    }

}
