public class Oggetti 
{
    public static void main(String[] args) 
    {
        System.out.println("\n--- STAMPA DI OGGETTI (Metodo toString) ---");
        // Creazione e stampa di un oggetto personalizzato
        Counter c = new Counter(10);
        // Usa il metodo toString() ridefinito nella classe Counter
        System.out.println(c.toString()); 
    }
}