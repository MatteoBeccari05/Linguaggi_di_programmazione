import java.util.*;

public class Socio 
{
    private String nome_cognome;
    private int codice, eta, categoria;
    protected List<Prenotazione> prenotazioni;

    public Socio(int codice, String nome_cognome, int eta, int categoria) 
    {
        this.codice = codice;
        this.nome_cognome = nome_cognome;
        this.eta = eta;
        this.categoria = categoria;
        prenotazioni = new LinkedList<Prenotazione>();
    }

    public void addPrenotazione(Prenotazione p) 
    {
        prenotazioni.add(p);
    }

@   Override
    public String toString() 
    {
        return String.format("%4d %28s %4d %4d %s", codice, nome_cognome, eta, categoria, prenotazioni);
    }
}
