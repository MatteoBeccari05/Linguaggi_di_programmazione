public class Tennis extends Campo
{
    protected float temp;
    protected String terreno;

    public Tennis(int codice, String nome, float larghezza, float lunghezza, float costo, float temp, String terreno)
    {
        super(codice, nome, larghezza, lunghezza, costo);
        this.temp = temp;
        this.terreno = terreno;
    }

    @Override
    public String toString()
    {
        return String.format("%7s ", "tennis") + super.toString() + String.format(" %6.2f %12s %8s %8s %6.2f", temp, terreno, "-", "-", costo);
    }
}