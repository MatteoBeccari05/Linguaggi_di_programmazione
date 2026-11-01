public class Studente extends Partecipante
{
    protected String nomeCorso;
    protected String nomeUniversita;
    protected int annoCorso;

    public Studente(int codice, String nome, String cognome, String tipo, String nomeCorso, String nomeUniversita, int annoCorso) 
    {
        super(codice, nome, cognome, tipo);
        this.nomeCorso = nomeCorso;
        this.nomeUniversita = nomeUniversita;
        this.annoCorso = annoCorso;
    }

    public String getUni()
    {
        return nomeUniversita;
    }

    @Override
    public String toString()
    {
        return "studente" + super.toString() + String.format("%20s %20s %10d %20s %20s %20s", nomeCorso, nomeUniversita, annoCorso, "-", "-", "-");
    }
}
