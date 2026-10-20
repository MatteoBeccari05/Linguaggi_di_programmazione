import java.util.*;

public class ContaFrequenza 
{
    public static void main(String args[]) 
    {
        // Creazione di una Map (usiamo HashMap come implementazione standard non ordinata a tempo costante)
        Map m = new HashMap();

        for (int i = 0; i < args.length; i++) 
        {
            // Recupera la frequenza attuale associata alla parola (chiave)
            Integer freq = (Integer) m.get(args[i]);
            
            // Se la frequenza è null (prima volta che compare la parola), inserisce 1, altrimenti incrementa di 1
            // Nota: l'operatore "new Integer(...)" e il boxing avvengono automaticamente in Java moderno
            m.put(args[i], (freq == null ? new Integer(1) : new Integer(freq.intValue() + 1)));
        }

        System.out.print(m.size() + " parole distinte: ");
        System.out.println(m);
    }
}