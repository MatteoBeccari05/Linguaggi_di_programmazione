class Node 
{
    private final String name;

    public Node(String name) 
    {
        this.name = name;
    }

    public String name() 
    {
        return name;
    }

    @Override
    public String toString() 
    {
        return name;
    }
}

