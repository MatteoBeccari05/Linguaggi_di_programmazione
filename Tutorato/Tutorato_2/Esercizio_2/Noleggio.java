public class Noleggio 
{
    private Film film;
    private int ritardo;
    private String nome_cliente;

    public Noleggio(Film film, int ritardo, String nome_cliente)
    {
        this.film = film;
        this.ritardo = ritardo;
        this.nome_cliente = nome_cliente;
    }
    
    public float CalcolaPenale()
    {
        return film.CalcolaPenale(ritardo);
    }

    public String ToString() 
    {
        return String.format("%-18s | %-10s | %-30s | %-8d | %-9.2f", 
            this.nome_cliente, 
            this.film.getCodice(), 
            this.film.getTitolo(), 
            this.ritardo, 
            this.CalcolaPenale()
        );
    }
}

