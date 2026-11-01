public class Partecipazione 
{
    private Partecipante p;
    private int spesa;

    public Partecipazione(Partecipante p, int spesa)
    {
        this.p = p;
        this.spesa = spesa;
    }

    public int getSpesa()
    {
        return spesa;
    }

    public String toString()
    {
        return p.getCognome() + ", " + spesa;
    }
}
