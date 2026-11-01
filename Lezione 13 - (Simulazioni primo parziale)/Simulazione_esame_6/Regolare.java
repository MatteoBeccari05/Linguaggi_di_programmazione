public class Regolare extends Partecipante
{
    protected String enteAppartenenza;
    protected int numDipendenti;
    protected boolean accademico;

    public Regolare(int codice, String nome, String cognome, String tipo, String enteAppartenenza, int numDipendenti, boolean accademico) 
    {
        super(codice, nome, cognome, tipo);
        this.enteAppartenenza = enteAppartenenza;
        this.numDipendenti = numDipendenti;
        this.accademico = accademico;
    }

    public String getEnte()
    {
        return enteAppartenenza;
    }

    @Override
    public String toString()
    {
        return "regolare" + super.toString() + String.format("%20s %20s %10s %20s %20d %20b", "-", "-", "-", enteAppartenenza, numDipendenti, accademico);
    }
}
