import java.time.LocalDate;

public class Transazione 
{
    private LocalDate data;
    private double importo;
    private String tipo;

    public Transazione(LocalDate data, double importo, String tipo) 
    {
        this.data = data;
        this.importo = importo;
        this.tipo = tipo;
    }

    public LocalDate getData() 
    {
        return data;
    }

    public double getImporto() 
    {
        return importo;
    }

    public String getTipo() 
    {
        return tipo;
    }

    public String toString() 
    {
        return data + ", " + importo + ", " + tipo;
    }
}