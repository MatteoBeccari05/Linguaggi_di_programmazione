public class Noleggio 
{
    private String veicolo;
    private int giorni;
    private double costo;

    public Noleggio(String veicolo, int giorni, double costo)
    {
        this.veicolo = veicolo;
        this.giorni = giorni;
        this.costo = costo;
    }

    public double getCostoTotale()
    {
        return this.costo * this.giorni;
    }

    public String toString()
    {
        return "(" + veicolo + ", " + giorni + ")";
    }
}
