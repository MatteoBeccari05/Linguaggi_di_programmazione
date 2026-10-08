public class Film
{
    protected String codice;
    protected String titolo;
    protected float penale_giornaliera;

    public Film(String codice, String titolo, float penale_giornaliera)
    {
        this.codice = codice;
        this.titolo = titolo;
        this.penale_giornaliera = penale_giornaliera;
    }

    public float CalcolaPenale(int ritardo)
    {
        return penale_giornaliera * ritardo;
    }

    public String ToString()
    {
        return "Codice: " + codice + ", Titolo: " + titolo + ", Penale: " + penale_giornaliera;
    }

    public String getCodice()
    {
        return codice;
    }

    public String getTitolo()
    {
        return titolo;
    }
}