public class Veicolo
{
    protected int codice;
    protected String targa;
    protected String modello;
    protected String marca;
    protected double costoGiornaliero;
    protected int noleggi;

    public Veicolo(int codice, String targa, String modello, String marca, double costoGiornaliero)
    {
        this.codice = codice;
        this.targa = targa;
        this.modello = modello;
        this.marca = marca;
        this.costoGiornaliero = costoGiornaliero;
        noleggi = 0;
    }

    public double getCosto()
    {
        return costoGiornaliero;
    }

    public int getNumNoleggi()
    {
        return this.noleggi;
    }

    public void addNoleggio()
    {
        this.noleggi++;
    }

    @Override
    public String toString()
    {
        return String.format("%-10s %6d %-12s %-12s %10.2f", targa, codice, modello, marca, costoGiornaliero);
    }
}