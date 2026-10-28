public class Roulotte extends Veicolo
{
    int peso;
    String veranda;

    public Roulotte(int codice, String marca, float lunghezza, float larghezza, int posti_letto, float costo, int peso, String veranda)
    {
        super(codice, marca, lunghezza, larghezza, posti_letto, costo);
        this.veranda = veranda;
        this.peso = peso;
    }

    @Override 
    public String toString()
    {
        return "roulotte" + super.toString() + String.format("%10d %20s %20s %10.2f", peso, veranda, "-", getCosto());
    }

} 
    

