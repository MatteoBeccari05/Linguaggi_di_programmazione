public class Orologio
{
    private Counter[] counter;   //[0] minuti - [1] ore

    public Orologio()
    {
        counter = new Counter[2];
        counter[0] = new Counter();
        counter[1] = new Counter();
    }

    public void Azzera()
    {
        for(int i = 0; i < counter.length; i++)
        {
            counter[i].reset();
        }
    }

    public void tic()
    {
        counter[0].inc();
        if(counter[0].getValue() == 60)
        {
            counter[0].reset();
            counter[1].inc();
        }
        if(counter[1].getValue() == 24)
        {
            counter[1].reset();
        }
    }

    public int getOre()
    {
        return counter[1].getValue();
    }

    public int getMinuti()
    {
        return counter[0].getValue();
    }

}
