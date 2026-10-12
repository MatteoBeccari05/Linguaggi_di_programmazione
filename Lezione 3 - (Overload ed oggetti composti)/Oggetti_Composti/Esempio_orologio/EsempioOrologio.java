public class EsempioOrologio
{
    public static void main(String args[])
    {
        Orologio or;
        or = new Orologio();

        for(int i = 0; i < 130; i++)
        {
            or.tic();
        }
        
        System.out.print("ORE: ");
        System.out.println(or.getOre());
        System.out.print("MINUTI: ");
        System.out.println(or.getMinuti());
        or.Azzera();
    }
}