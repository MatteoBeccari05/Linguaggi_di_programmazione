class Calcolatrice 
{
    int numero1;
    int numero2;
    public Calcolatrice(int n1, int n2)
    {
        numero1 = n1;
        numero2 = n2;
    }

    public int somma()
    {
        return numero1 + numero2;
    }
    
}


public class somma 
{
    public static void main(String[] args) 
    {
        Calcolatrice c = new Calcolatrice(3, 6);
        int risultato = c.somma();
        System.out.println(risultato);
    }
}