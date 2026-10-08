import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserire una stringa: ");
        String input = scanner.nextLine().trim();
        System.out.print("Inserire seconda stringa: ");
        String input2 = scanner.nextLine().trim();
        System.out.println( "Stringa 1: " + input + " - Lunghezza: " + lunghezza(input));
        System.out.println( "Stringa 2: " + input2 + " - Lunghezza: " + lunghezza(input2));

        String stringaConcatenata = input + " " + input2;
        System.out.println( "Stringa concatenata: " + stringaConcatenata + " - Lunghezza: " + lunghezza(stringaConcatenata));
        scanner.close();
    }

    static int lunghezza(String str) 
    {
        return str.length();
    }
}