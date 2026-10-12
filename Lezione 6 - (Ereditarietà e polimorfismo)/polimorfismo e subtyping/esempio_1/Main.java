public class Main 
{
    public static void main(String[] args) 
    {
        int n;
        Counter c1;
        c1 = new BiCounter(); // Era c1 = new Counter()
        for (int i = 0; i < 150; i++)
        {
            c1.inc();
        }
            
        n = c1.getValue();
        System.out.println("Valore: " + n);
    }
}

//ma non possiamo fare c1.dec() perché c1 è di tipo Counter e il metodo dec() non è definito in Counter, ma solo in BiCounter.
