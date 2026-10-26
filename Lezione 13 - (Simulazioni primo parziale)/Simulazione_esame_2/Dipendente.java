public class Dipendente
{
    protected int codice;
    protected String nome;
    protected double costo_orario;

    public Dipendente(int codice, String nome, double costo_orario)
    {
        this.codice = codice;
        this.nome = nome;
        this.costo_orario = costo_orario;
    }

    public double getCosto()
    {
        return costo_orario;
    }

    public String getNome()
    {
        return nome;
    }

    @Override 
    public String toString()
    {
        return String.format("%-5d %-20s", codice, nome);
    }
}