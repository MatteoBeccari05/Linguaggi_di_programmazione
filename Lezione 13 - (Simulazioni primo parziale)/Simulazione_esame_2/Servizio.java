public class Servizio 
{
    private double ore;
    private Dipendente dipendente;

    public Servizio(double ore, Dipendente dipendente) 
    {
        this.ore = ore;
        this.dipendente = dipendente;
    }

    public double getOre() 
    {
        return ore;
    }

    public Dipendente getDipendente() 
    {
        return dipendente;
    }
}