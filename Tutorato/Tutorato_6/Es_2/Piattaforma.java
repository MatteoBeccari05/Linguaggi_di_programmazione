import java.util.ArrayList;
import java.util.List;

public class Piattaforma 
{
    private List<Abbonato> abbonati;

    public Piattaforma() 
    {
        this.abbonati = new ArrayList<Abbonato>();
    }

    public Piattaforma(List<Abbonato> abbonati) 
    {
        this.abbonati = abbonati;
    }

    public void addAbbonato(Abbonato abbonato) 
    {
        abbonati.add(abbonato);
    }

    public void addAbbonato(String nome, String email) 
    {
        Abbonato abbonato = new Abbonato(nome, email);
        abbonati.add(abbonato);
    }

    public void rimuoviAbbonato(Abbonato abbonato) 
    {
        abbonati.remove(abbonato);
    }

    public void comunicaPremio(String premio) 
    {
        abbonati.stream().filter(abbonato -> abbonato.getAnnoAbbonamento() > 2).forEach(abbonato -> abbonato.riceviEmail("Complimenti " + abbonato.getNome() + ", Hai vinto " + premio));
    }

    public double numeroMedioAnniAbbonato() 
    {
        return abbonati.stream().mapToInt(Abbonato::getAnnoAbbonamento).average().orElse(0.0);
    }

    public void aggiungiAnno() 
    {
        abbonati.forEach(Abbonato::aggiungiAnnoAbbonamento);
    }

    public void comunicaMessaggio(Abbonato abbonato, String messaggio) 
    {
        abbonati.stream().filter(a -> a.equals(abbonato)).forEach(a -> a.riceviEmail(messaggio));
    }
}
