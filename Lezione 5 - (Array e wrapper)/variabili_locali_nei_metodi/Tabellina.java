import java.util.*;

public class Tabellina 
{
    public static void main(String[] args) 
    {
        int num = 0;  //deve essere inizializzata a 0
        Scanner console = new Scanner(System.in);
        while (num<=0) 
        {
            System.out.print("Dammi un numero >0: ");
            num = console.nextInt();
        }
        console.close();
        
        for (int i = 1; i <= 10; i++)
        {
            System.out.println(i * num);
        }
    }
}