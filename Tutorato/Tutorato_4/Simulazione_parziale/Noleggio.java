public class Noleggio 
{
    protected int codiceVeicolo;
    protected int numGiorni;
    protected double costoGiornaliero;
    
    public Noleggio(int codiceVeicolo, int numGiorni, double costoGiornaliero)
    {
        this.codiceVeicolo = codiceVeicolo;
        this.numGiorni = numGiorni;
        this.costoGiornaliero = costoGiornaliero;
    }

    public double getTotale()
    {
        return numGiorni * costoGiornaliero;
    }
}
