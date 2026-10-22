import java.util.ArrayList;
import java.util.List;

public class Cliente 
{
    protected String nome;
    protected  List<Noleggio> noleggi;

    public Cliente(String nome)
    {
        this.nome = nome;
        noleggi = new ArrayList<Noleggio>();
    }

    public void addNoleggio(Noleggio n)
    {
        noleggi.add(n);
    }

    public double getCostoMaggiore()
    {
        double maxNoleggio = 0;
        for(Noleggio noleggio : noleggi)
        {
            if(maxNoleggio < noleggio.getTotale())
            {
                maxNoleggio = noleggio.getTotale();
            }
        }

        return maxNoleggio;
    }

    public String toString()
    {
        return String.format("%-25s %22.2f %15d", nome, getCostoMaggiore(), noleggi.size());
    }
}
