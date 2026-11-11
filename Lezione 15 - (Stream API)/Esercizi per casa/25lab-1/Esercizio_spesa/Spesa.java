public class Spesa 
{
    private double importo;
    private String tipologia;

    public Spesa(double importo, String tipologia) 
    {
        this.importo = importo;
        this.tipologia = tipologia;
    }

    public double getImporto() 
    {
        return importo;
    }

    public String getTipologia() 
    {
        return tipologia;
    }

    public String toString() 
    {
        return "Spesa [importo=" + importo + ", tipologia=" + tipologia + "]";
    }
}