import java.util.LinkedList;
import java.util.List;

public class Cliente 
{
    protected int codice;
    protected String nome;
    protected String cognome;
    protected String indirizzo;
    protected List<Noleggio> noleggi;

    public Cliente(int codice, String nome, String cognome, String indirizzo)
    {
        this.codice = codice;
        this.nome = nome;
        this.cognome = cognome;
        this.indirizzo = indirizzo;
        noleggi = new LinkedList<>();
    }

    public void AddNoleggio(Noleggio n)
    {
        noleggi.add(n);
    }

    public String toString()
    {
        return String.format("%10d %20s %20s %20s", codice, cognome, nome, indirizzo) + " " + noleggi;
    }

    
}
