public class Main 
{
    public static void main(String[] args) 
    {
        int n;
        Counter c1;
        c1 = new CentoCounter();   //otteniamo 100 tramite la classe centoCounter
        for (int i = 0; i < 150; i++)
        {
            c1.inc();
        }
            
        n = c1.getValue();
        System.out.println("Valore: " + n);
    }
}
