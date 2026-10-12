public class Counter 
{
    private int val;

    // Overloading dei costruttori
    public Counter() 
    { 
        val = 0; 
    }

    public Counter(int n) 
    {
        val = n; 
    }

    public void reset() 
    {
        val = 0; 
    }

    // Overloading del metodo inc()
    public void inc() 
    {
        val++; 
    }

    public void inc(int n) 
    {
        val = val + n; 
    }

    public int getValue() 
    {
        return val;
    }
}