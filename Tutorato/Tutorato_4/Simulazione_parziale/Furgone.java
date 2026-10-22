public class Furgone extends Veicolo 
{
    protected boolean rimorchio;
    protected int numPosti;
    protected boolean vanoCarico;

    public Furgone(int codice, String targa, String modello, String marca, double costoGiornaliero, boolean rimorchio, int numPosti, boolean vanoCarico) 
    {
        super(codice, targa, modello, marca, costoGiornaliero);
        this.rimorchio = rimorchio;
        this.numPosti = numPosti;
        this.vanoCarico = vanoCarico;
    }

    @Override 
    public String toString()
    {
        return String.format("%-10s %s %12s %10s %-12s %10b %10d %10b", "Furgone", super.toString(), "-", "-", "-", rimorchio, numPosti, vanoCarico);
    }
}
