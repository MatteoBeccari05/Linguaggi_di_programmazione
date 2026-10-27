public class Progetto
{
    protected int codice;
    protected String titolo;
    protected String nome_cognome;
    protected String organizzatore;
    protected double importo;

    public Progetto(int codice, String titolo, String nome_cognome, String organizzatore, double importo)
    {
        this.codice = codice;
        this.titolo = titolo;
        this.nome_cognome = nome_cognome;
        this.organizzatore = organizzatore;
        this.importo = importo;
    }

    @Override 
    public String toString()
    {
        return String.format("%-10d %-20s %-20s %-20s", codice, titolo, nome_cognome, organizzatore);
    }

    public double getImporto()
    {
        return this.importo;
    }

    public String getTitolo()
    {
        return titolo;
    }


    public int getCode()
    {
        return codice;
    }
}