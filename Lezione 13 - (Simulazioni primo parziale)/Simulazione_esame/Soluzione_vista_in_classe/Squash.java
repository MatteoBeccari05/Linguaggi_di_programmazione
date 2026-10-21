public class Squash extends Campo
{
    protected float altezza;
    protected int piano;

    public Squash(int codice, String nome, float larghezza, float lunghezza, float costo, float altezza, int piano)
    {
        super(codice, nome, larghezza, lunghezza, costo);
        this.altezza = altezza;
        this.piano = piano;
    }

    @Override
    public String toString()
    {
        return String.format("%7s ", "squash") + super.toString() + String.format(" %6s %12s %8.2f %8d %6.2f", "-", "-", altezza, piano, costo);
    }
}