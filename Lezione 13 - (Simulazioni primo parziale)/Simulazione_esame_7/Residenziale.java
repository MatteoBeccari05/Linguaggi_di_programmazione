public class Residenziale extends Cliente
{
    private String nome_cognome;

    public Residenziale(int codice, String tipo_contratto, String indirizzo, String tipo, String nome_cognome)
    {
        super(codice, tipo_contratto, indirizzo, tipo);
        this.nome_cognome = nome_cognome;
    }

    public String getNome()
    {
        return nome_cognome;
    }

    @Override 
    public String toString()
    {
        return String.format("%10d %10s %20s %20s %20s %20s %20s", codice, tipo, nome_cognome, "-", indirizzo, tipo_contratto, "-");
    }
}
