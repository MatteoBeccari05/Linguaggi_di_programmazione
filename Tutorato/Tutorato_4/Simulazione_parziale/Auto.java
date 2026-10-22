public class Auto extends Veicolo 
{
    protected double capienzaBagagliaio;
    protected int cilindrata;
    protected String categoria;

    public Auto(int codice, String targa, String modello, String marca, double costoGiornaliero, double capienzaBagagliaio, int cilindrata, String categoria)
    {
        super(codice, targa, modello, marca, costoGiornaliero);
        this.capienzaBagagliaio = capienzaBagagliaio;
        this.cilindrata = cilindrata;
        this.categoria = categoria;
    }

    @Override 
    public String toString()
    {
        return String.format("%-10s %s %12.2f %10d %-12s %10s %10s %10s", "Auto", super.toString(), capienzaBagagliaio, cilindrata, categoria, "-", "-", "-");
    }
}
