public class Main 
{
    public static void main(String[] args) 
    {
        // Esempio 1: Creazione tramite il costruttore di default (soldi = 0)
        System.out.println("--- Esempio 1 ---");
        Deposito d1 = new Deposito();
        d1.print(); 
        
        // Esempio 2: Creazione tramite il costruttore con parametro
        System.out.println("\n--- Esempio 2 ---");
        // Nota: la 'f' finale indica che il numero è di tipo float
        Deposito d2 = new Deposito(150.50f); 
        d2.print();
        
        // Esempio 3: Richiamo esplicito e implicito del metodo toString()
        System.out.println("\n--- Esempio 3 ---");
        // Quando passi l'oggetto a println, Java chiama automaticamente toString()
        System.out.println(d2); 
        
        // Puoi anche usare toString() per concatenare l'output a un'altra stringa
        String messaggio = "Il saldo attuale è -> " + d2.toString();
        System.out.println(messaggio);
    }
}