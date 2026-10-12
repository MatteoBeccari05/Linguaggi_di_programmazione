public class Counter 
{
    protected int val;

    public Counter(int v) 
    {
        System.out.println("Counter: costruttore");
        val = v;
    }

    public void reset() 
    {
        val = 0;
    }

    public void inc()
    {
        val++;
    }

    public int getValue() 
    {
        return val;
    }

    public String toString() 
    {
        return "Sono un contatore di valore: " + val;
    }
}