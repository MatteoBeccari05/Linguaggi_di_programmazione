public class Impegno 
{
    Progetto p;
    protected double orario;

    public Impegno(Progetto p, double orario)
    {
        this.p = p;
        this.orario = orario;
    }

    public double getOre()
    {
        return orario;
    }

    public Progetto getProgetto()
    {
        return p;
    }

    @Override 
    public String toString()
    {
        return "(" + p.getCode() + ", " + orario + ")"; 
    }



}
