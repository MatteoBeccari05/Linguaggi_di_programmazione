public class Orologio
{
    private Counter ore, minuti;

    public Orologio()
    {
        ore = new Counter();
        minuti = new Counter();
    }

    public void Azzera()
    {
        ore.reset();
        minuti.reset();
    }

    public void tic()
    {
        minuti.inc();
        if(minuti.getValue() == 60)
        {
            minuti.reset();
            ore.inc();
        }
        if(ore.getValue() == 24)
        {
            ore.reset();
        }
    }

    public int getOre()
    {
        return ore.getValue();
    }

    public int getMinuti()
    {
        return minuti.getValue();
    }

}
