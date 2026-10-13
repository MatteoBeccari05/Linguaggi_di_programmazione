public class Main1 
{
    public static void main(String[] args) 
    {
        String s = "xyz";
        int a = 0;
        try
        {
            a = Integer.parseInt(s);
            a = a + 5; // Non viene eseguita!
        }
        catch (Exception ex)
        {
            a = 0;
            System.out.println("Errore: " + ex.getMessage());
        }
        // dopo il catch il flusso riprende qui sotto
        a = a + 2; // a vale 2 e non 7!
        System.out.println("a = " + a);
    }
}