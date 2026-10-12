/* To execute: 
javac .\ArrayStringhe.java 
java ArrayStringhe 10 20 
*/

public class ArrayStringhe 
{
    public static void main(String[] args) 
    {
        if (args.length==0)
        {
            System.out.println("Nessun argomento");
        } 
        else
        {
            for (int i=0; i<args.length; i++)
            {
                System.out.println("argomento " + i + ": " + args[i]);
            }       
        }  
    }
}
