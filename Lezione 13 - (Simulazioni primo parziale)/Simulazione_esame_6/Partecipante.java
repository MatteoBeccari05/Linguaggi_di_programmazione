public class Partecipante 
{
    protected int codice;
    protected String nome;
    protected String cognome;
    protected String tipo;

    public Partecipante(int codice, String nome, String cognome, String tipo) 
    {
        this.codice = codice;
        this.nome = nome;
        this.cognome = cognome;
        this.tipo = tipo;
    }

    public int getCodice()
    {
        return codice;
    }

    public String getCognome()
    {
        return cognome;
    }

    public String getTipo()
    {
        return tipo;
    }

    @Override 
    public String toString()
    {
        return String.format("%10d %20s %20s", codice, nome, cognome);
    }
}
