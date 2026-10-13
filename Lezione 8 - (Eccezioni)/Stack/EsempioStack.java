public class EsempioStack 
{
    public static void main(String args[]) 
    {
        Stack sk = new Stack(100);
        try
        {
            sk.push("Pippo");
            sk.push("Pluto");
            System.out.println(sk.pop()); // ok: Pluto
            System.out.println(sk.pop()); // ok: Pippo
            System.out.println(sk.pop()); // underflow!
        }
        catch (StackOverflowException e)
        {
            System.out.println("Overflow!");
        }
        catch (StackUnderflowException e) 
        { 
            System.out.println("Underflow!"); 
        }
        catch (Exception e) // catturiamo comunque tutto
        { 
            System.out.println("Errore strano:" + e.getMessage()); 
        }
    }
}