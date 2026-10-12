public class BiCounter extends Counter 
{
    public BiCounter()
    {
        super(1);
        System.out.println("Counter2: costruttore di default!");
    }
    
    public void dec() 
    {
        val--;
    }


    public String toString() 
    {
        return "Sono un contatore bidirezionale di valore: " + val;
    }
}
