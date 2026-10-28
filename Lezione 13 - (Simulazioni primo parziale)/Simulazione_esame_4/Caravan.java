public class Caravan extends Veicolo 
{
    int potenza;

    public Caravan(int codice, String marca, float lunghezza, float larghezza, int posti_letto, float costo, int potenza)
    {
        super(codice, marca, lunghezza, larghezza, posti_letto, costo);
        this.potenza = potenza;
    }

    @Override 
    public String toString()
    {
        return "caravan" + super.toString() + String.format("%10s %20s %20s %10.2f", "-", "-", potenza, getCosto());
    }


}
