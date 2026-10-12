public class EsempioWrapper {
    public static void main(String args[]) {
        
        // --- 1. Creazione ed estrazione ---
        int x = 35;
        // Crea un oggetto Integer incapsulando il valore primitivo
        Integer ix = new Integer(x); 
        
        // Estrae il valore primitivo dall'oggetto tramite il metodo selettore
        x = 2 * ix.intValue(); // x diventa 70
        
        
        // --- 2. Metodi di istanza vs Metodi statici (di servizio) ---
        // Conversione esplicita da Integer a String (usando il metodo sull'istanza)
        System.out.println("ix = " + ix.toString()); 
        
        // Conversione esplicita da int a String (usando il metodo statico della classe)
        System.out.println("x = " + Integer.toString(x)); 
        
        
        // --- 3. Due modi per convertire stringhe in interi ---
        // Metodo A: Creando un'istanza (comporta la creazione di un oggetto)
        Integer in = new Integer("23");
        int n1 = in.intValue();
        
        // Metodo B: Usando un metodo statico (più semplice, diretto e usato)
        int n2 = Integer.parseInt("23"); 
    }
}