public class Conto 
{
    private int saldo;

    public Conto() 
    {
        this(0);
    }

    public Conto(int ammontare) 
    {
        ingresso(ammontare);
    }

    public void ingresso(int ammontare) 
    {
        saldo += ammontare;
    }

    public void uscita(int ammontare) 
    {
        saldo -= ammontare;
    }

    public int getSaldo() 
    {
        return saldo;
    }

    public String toString() 
    {
        return "" + saldo;
    }
}