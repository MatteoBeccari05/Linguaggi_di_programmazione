public class ConfrontoStringhe 
{
    public static void main(String[] args) 
    {
        System.out.println("\n--- CONFRONTO TRA STRINGHE ---");
        String s1 = new String("ciao");
        String s2 = new String("ciao");
        System.out.println("Uso di == (confronta i riferimenti): " + (s1 == s2)); // false
        System.out.println("Uso di equals (confronta il contenuto): " + s1.equals(s2)); // true
    }
}
