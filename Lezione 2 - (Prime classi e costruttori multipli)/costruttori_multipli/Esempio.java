public class Esempio 
{
    public static void main(String[] args) 
    {
        int n;
        Counter c1 = new Counter(7);
        c1.inc();
        n = c1.getValue();
        System.out.println(n);

        Counter c2 = new Counter();
        c2.inc();
        n = c2.getValue();
        System.out.println(n);
    }
}