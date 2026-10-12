public class Counter 
{
    protected int val;
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
}