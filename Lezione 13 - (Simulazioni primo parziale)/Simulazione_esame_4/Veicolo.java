import java.util.LinkedList;
import java.util.List;

public class Veicolo
{
    protected int codice;
    protected String marca;
    protected float lunghezza;
    protected float larghezza;
    protected float costo;
    protected int posti_letto;
    List<Noleggio> noleggi;

    public Veicolo(int codice, String marca, float lunghezza, float larghezza, int posti_letto, float costo)
    {
        this.codice = codice;
        this.marca = marca;
        this.lunghezza = lunghezza;
        this.larghezza = larghezza;
        this.costo = costo;
        this.posti_letto = posti_letto;
        noleggi = new LinkedList<>();
    }

    @Override 
    public String toString()
    {
        return String.format("%10d %20s %20.2f %20.2f %5d", codice, marca, larghezza, lunghezza, posti_letto);
    }

    public float getCosto()
    {
        return costo;
    }

    public void addPrenotazione(Noleggio n)
    {
        noleggi.add(n);	
    }	

    public float incasso()
    {
        int giorni=0;
        for (Noleggio n : noleggi)
        {
            giorni = giorni + n.getGiorni();
        }
        return giorni*costo;
    }

    
	public int getCod()
  	{
		return codice;
	}
}