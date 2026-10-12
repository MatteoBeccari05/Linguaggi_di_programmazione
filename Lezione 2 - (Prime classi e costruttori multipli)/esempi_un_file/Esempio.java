package Lezione_2.esempi_un_file;
//esempio counter con costruttore di default
class Counter 
{
    public Counter()
    {
        val = 0;
    }
    private int val;
    public void reset() { val = 0; }
    public void inc(){ val++; }
    public int getValue() { return val;}
    public void copy(Counter x) { val = x.val;}
    public boolean equals(Counter x){return val == x.val;}

}

public class Esempio 
{
    public static void main(String[] args) 
    {
        int n;
        Counter c1, c2;
        Boolean b1, b2;
        c1 = new Counter();
        c2 = new Counter();
        c1.inc();
        b1 = c1.equals(c2);
        System.out.println(b1);
        c1.copy(c2);
        b2 = c1.equals(c2);
        System.out.println(b2);
        n = c1.getValue();
        System.out.print("Numero: ");
        System.out.println(n);
        n = c2.getValue();
        System.out.print("Numero: ");
        System.out.println(n);
    }
}



