public class Main 
{
    public static void main(String[] args) 
    {
        BiCounter bc = new BiCounter();
        bc.inc();
        bc.inc();
        System.out.println(bc.getValue());
        bc.dec();
        System.out.println(bc.getValue());
    }
}
