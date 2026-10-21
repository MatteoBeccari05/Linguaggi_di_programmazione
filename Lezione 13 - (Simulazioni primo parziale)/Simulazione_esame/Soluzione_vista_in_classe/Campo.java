public class Campo
{
    protected int codice;
    protected String nome;
    protected float larghezza, lunghezza, costo;
    protected int num_prenotazioni;

    public Campo(int codice, String nome, float larghezza, float lunghezza, float costo)
    {
        this.codice = codice;
        this.nome = nome;
        this.larghezza = larghezza;
        this.lunghezza = lunghezza;
        this.costo = costo;
        num_prenotazioni = 0;
    }

    public void addPrenotazione()
    {
        num_prenotazioni++;
    }

    public float IncassoTotale()
    {
        return num_prenotazioni * costo;
    }

    @Override
    public String toString()
    {
        return String.format("%18s %4d %6.2f %6.2f", nome, codice, larghezza, lunghezza);
    }
}