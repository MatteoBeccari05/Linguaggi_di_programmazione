public class Soluzione2 
{
    public static void main(String args[]) 
    {
        int a = 0;
        String s = args[0];
        try 
        {
            a = Integer.parseInt(s);
            System.out.println("Il numero passato è: " + a);
        }
        catch (Exception ex) 
        {
            System.out.println("La stringa passata non contiene un numero!");
            a = 0;
        }
    }
}