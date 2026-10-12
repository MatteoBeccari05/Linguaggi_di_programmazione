public class Esempio 
{
    public static void main(String[] args) 
    {
        int n;
        Counter c1, c2;

        // Invocazione dei costruttori overloaded
        c1 = new Counter();  /* Viene invocato il costruttore senza parametri (val = 0) */
        c2 = new Counter(5); /* Viene invocato il costruttore con parametro (val = 5) */

        // Invocazione dei metodi inc() overloaded su c1
        c1.inc();  /* Viene invocata la prima versione, incrementa di 1 */
        n = c1.getValue();
        System.out.print("C1 Primo incremento: ");
        System.out.print(n);
        System.out.println();

        c1.inc(3); /* Viene invocata la seconda versione, incrementa di 3 */
        n = c1.getValue();
        System.out.print("C1 Secondo incremento: ");
        System.out.print(n);
        System.out.println();

        c2.inc();
        n = c2.getValue();
        System.out.print("C2 Primo incremento: ");
        System.out.print(n);
        System.out.println();

        c2.inc(3);
        n = c2.getValue();
        System.out.print("C2 Secondo incremento: ");
        System.out.print(n);
        System.out.println();
    }
}