import java.util.*;

public class ContaFrequenzaOrdModerno 
{
    public static void main(String[] args) 
    {
        // Valori di default se non vengono passati argomenti da riga di comando
        if (args.length == 0) 
        {
            args = new String[]{"cane", "gatto", "cane", "gatto", "gatto", "cane", "pesce"};
        }

        // SortedMap tipizzata con TreeMap per garantire l'ordinamento alfabetico delle chiavi
        SortedMap<String, Integer> m = new TreeMap<String, Integer>();

        for (String parola : args) 
        {
            Integer freq = m.get(parola);
            
            // Se freq è null mette 1, altrimenti incrementa freq + 1
            m.put(parola, (freq == null ? 1 : freq + 1));
        }

        System.out.println(m.size() + " parole distinte:");
        System.out.println(m);
    }
}