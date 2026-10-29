public class Auto extends Veicolo
{
    private int cilindrata;
    private double capienza_bagagliaio;

    public Auto(int codice, String targa, String marca, String modello, double costo, int cilindrata, double capienza_bagagliaio)
    {
        super(codice, targa, marca, modello, costo);
        this.cilindrata = cilindrata;
        this.capienza_bagagliaio = capienza_bagagliaio;
    }

    @Override 
    public String toString()
    {
        return "automobile" + super.toString() + String.format("%10d %10.2f %20s %20s %20s",  cilindrata, capienza_bagagliaio, "-", "-", "-");
    }
}
