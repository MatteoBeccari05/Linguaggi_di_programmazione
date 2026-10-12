package Lezione_1;
import java.util.Scanner;

public class lettura 
{
    public static void main(String args[])
    {
        int numero;
        Scanner lettore = new Scanner(System.in);
        
        System.out.print("Inserire numero: ");

        numero = lettore.nextInt();
        
        System.out.println("Hai inserito il numero: " + numero);

        lettore.close();
    }
}