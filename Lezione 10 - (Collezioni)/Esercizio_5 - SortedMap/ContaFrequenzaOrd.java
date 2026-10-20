import java.util.*;

public class ContaFrequenzaOrd 
{
    public static void main(String args[]) 
    {
        // Creazione di una SortedMap implementata con TreeMap (tabella ordinata per chiave)
        SortedMap m = new TreeMap();

        for (int i = 0; i < args.length; i++) 
        {
            // Recupera la frequenza attuale associata alla parola
            Integer freq = (Integer) m.get(args[i]);
            
            // Inserisce 1 se è la prima occorrenza, altrimenti incrementa il valore esistente
            m.put(args[i], (freq == null ? new Integer(1) : new Integer(freq.intValue() + 1)));
        }

        System.out.println(m.size() + " parole distinte:");
        System.out.println(m);
    }
}