public class Furgone extends Veicolo
{
    private String categoria;
    private int num_posti;
    private boolean vano_carico;


    public Furgone(int codice, String targa, String marca, String modello, double costo, String categoria, int num_posti, boolean vano_carico)
    {
        super(codice, targa, marca, modello, costo);
        this.categoria = categoria;
        this.num_posti = num_posti;
        this.vano_carico = vano_carico;
    }

    @Override 
    public String toString()
    {
        return "commerciale" + super.toString() + String.format("%10s %10s %20s %20d %20b",  "-", "-", categoria, num_posti, vano_carico);
    }
}