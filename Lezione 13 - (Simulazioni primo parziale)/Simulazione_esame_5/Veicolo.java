public abstract class Veicolo
{
    protected int codice;
    protected String targa;
    protected String marca;
    protected String modello;
    protected double costo;

    public Veicolo(int codice, String targa, String marca, String modello, double costo)
    {
        this.codice = codice;
        this.targa = targa;
        this.marca = marca;
        this.modello = modello;
        this.costo = costo;
    }

    public String getTarga()
    {
        return this.targa;
    }

    public int getCodice()
    {
        return this.codice;
    }

    @Override
    public String toString()
    {
        return String.format("%20s %6d %12s %12s %10.2f", targa, codice, modello, marca, costo);
    }
}