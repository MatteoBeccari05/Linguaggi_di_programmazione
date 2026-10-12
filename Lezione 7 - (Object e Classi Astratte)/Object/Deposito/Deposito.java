public class Deposito 
{
    float soldi;

    public Deposito() 
    {
        soldi = 0;
    }

    public Deposito(float s) 
    {
        soldi = s;
    }

    public String toString() 
    { 
        return "Soldi: " + soldi;
    }

    public void print() 
    {
        System.out.println(this);
    }
}

//System.out.println() richiede un oggetto come parametro
//Usiamo quindi this per indicare che vogliamo scrivere a video l’oggetto corrente