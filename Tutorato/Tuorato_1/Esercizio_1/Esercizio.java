public class Esercizio
{
    public static void main(String[] args) 
    {
        CoppiaDiNumeri cn;
        if (args.length==0)
        {
            System.out.println("Nessun argomento");
        } 
        else if(args.length == 2)
        {
            cn = new CoppiaDiNumeri(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
            
            System.out.println("Somma: " + cn.somma());
            System.out.println("Prodotto: " + cn.prodotto());
        }  
        else
        {
            System.out.println("Numero argomenti errato");
        }
    }
}
