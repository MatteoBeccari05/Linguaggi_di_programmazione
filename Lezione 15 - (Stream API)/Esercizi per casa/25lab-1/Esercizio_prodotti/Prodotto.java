public class Prodotto 
{
    private String nome, categoria;
    private double prezzo;

    public Prodotto(String nome, double prezzo, String categoria) 
    {
        this.nome = nome;
        this.prezzo = prezzo;
        this.categoria = categoria;
    }

    public String getNome() 
    {
        return nome;
    }

    public double getPrezzo() 
    {
        return prezzo;
    }

    public String getCategoria() 
    {
        return categoria;
    }

    public String toString() 
    {
        return nome + ", " + prezzo + ", " + categoria;
    }
}