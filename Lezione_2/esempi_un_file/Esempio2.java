package Lezione_2.esempi_un_file;
//esempio counter con costruttore creato da noi 
class Counter 
{
    public Counter(int n)
    {
        val = n;
    }
    private int val;
    public void reset() { val = 0; }
    public void inc(){ val++; }
    public int getValue() { return val;}
}

public class Esempio2
{
    public static void main(String[] args) 
    {
        int n;
        Counter c1;
        c1 = new Counter(7);
        c1.inc();
        n = c1.getValue();
        System.out.print("Numero: ");
        System.out.println(n);
    }
}



