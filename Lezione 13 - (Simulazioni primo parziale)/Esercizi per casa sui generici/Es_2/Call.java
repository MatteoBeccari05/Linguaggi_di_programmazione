public class Call 
{
    private String sender;
    private String receiver;
    private int start;
    private int stop;

    public Call(String sender, String receiver, int start, int stop) 
    {
        this.sender = sender;
        this.receiver = receiver;
        this.start = start;
        this.stop = stop;
    }

    public int getDuration() 
    {
        return stop - start;
    }
}