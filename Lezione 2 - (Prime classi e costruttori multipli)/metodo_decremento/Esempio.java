public class Esempio 
{
    public static void main(String[] args) 
    {
        int n;
        Counter c3 = new Counter();
        c3.reset();
        c3.inc();
        c3.inc();
        n = c3.getValue();
        System.out.println(n);
        c3.dec();
        n = c3.getValue();
        System.out.println(n);
    }
}