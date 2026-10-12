public class Esercizio
{
    public static void main(String[] args) 
    {
        int array[];

        if (args.length==0)
        {
            System.out.println("Nessun argomento");
        } 
        else if(args.length == 2)
        {
            array = new int[2];
            for (int i=0; i<args.length; i++)
            {
                array[i] = Integer.parseInt(args[i]);
            }   
            
            System.out.println("Somma: " + somma(array[0], array[1]));
        }  
        else
        {
            System.out.println("Numero argomenti errato");
        }
    }

    static int somma(int a, int b )
    {
        return a + b;
    }
}