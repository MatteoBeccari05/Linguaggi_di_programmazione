class NaturalNumber<T extends Integer> 
{
    private T n;

    public NaturalNumber(T n) 
    { 
        this.n = n; 
    }

    public boolean isEven() 
    {
        // Possiamo chiamare intValue() perché sappiamo che T estende Integer
        return n.intValue() % 2 == 0;
    }

    public T getValue() 
    {
        return n;
    }
}