public class Esercizio 
{
    public static void main(String args[])
    {
        Orologio or;
        or = new Orologio();
        or.Azzera();

        for(int i = 0; i < 130; i++)
        {
            or.tic();
        }
        
        System.out.println("ORE: " + or.getOre());
        System.out.println("MINUTI: " + or.getMinuti());
        or.Azzera();
    }
    
}
