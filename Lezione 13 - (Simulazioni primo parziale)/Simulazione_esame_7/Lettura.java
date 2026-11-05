public class Lettura 
{
    private int codice_cliente;
    private double metri_cubi;

    public Lettura(int codice_cliente, double metri_cubi)
    {
        this.codice_cliente = codice_cliente;
        this.metri_cubi = metri_cubi;
    }

    public double getMQ()
    {
        return metri_cubi;
    }

}
