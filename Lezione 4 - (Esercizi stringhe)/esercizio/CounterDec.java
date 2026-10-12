public class CounterDec 
{
    Counter c;

    public CounterDec()
    {
        c = new Counter();
    }

    public CounterDec(int n)
    {
        c = new Counter(n);
    }

    public void reset() 
    { 
        c.reset();
    }

    public void dec()
    {
        int n = c.getValue();
        n--;
        c = new Counter(n);
    }

    public void inc()
    {
        c.inc();
    }

    public int getValue() 
    { 
        return c.getValue();
    }
}
