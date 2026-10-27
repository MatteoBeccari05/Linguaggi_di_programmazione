import java.util.LinkedList;
import java.util.List;

public class Ricercatore 
{
    protected String nome;
    protected String cognome;
    List<Impegno> progetti;

    public Ricercatore(String nome, String cognome)
    {
        this.nome = nome;
        this.cognome = cognome;
        progetti = new LinkedList<>();
    }

    public double getOreTotali()
    {
        double ore = 0;
        for(Impegno i : progetti)
        {
            ore += i.getOre();
        }
        return ore;
    }

    @Override 
    public String toString()
    {
        return String.format("%20s %20s %10.1f", nome, cognome, getOreTotali()) + " " + progetti; 
    }

    public Impegno getMax()
    {
        double max = 0;
        Impegno impegno = null;
        for (Impegno i:progetti)
        {
            if (i.getOre() > max)
            {
                max = i.getOre();
                impegno = i;
            }
        }
        return impegno;
    }

    public void addProgetto(Progetto p, double ore)
    {
        progetti.add(new Impegno(p,ore));
    }

    public int getNum()
    {
        return progetti.size();
    }

    public String getCognome()
    {
        return cognome;
    }

        public String getNome()
    {
        return nome;
    }
    
}
