import java.util.*;

public class ContaFrequenzaModerno 
{
    public static void main(String[] args) 
    {
        // Valori di default se non vengono passati argomenti da riga di comando
        if (args.length == 0)
        {
            args = new String[]{"cane", "gatto", "cane", "gatto", "gatto", "cane", "pesce"};
        }

        // Map tipizzata: chiave di tipo String (la parola), valore di tipo Integer (la frequenza)
        Map<String, Integer> m = new HashMap<String, Integer>();

        for (String parola : args) 
        {
            Integer freq = m.get(parola);
            
            // Se freq è null mette 1, altrimenti incrementa freq + 1 sfruttando l'autoboxing
            m.put(parola, (freq == null ? 1 : freq + 1));
        }

        System.out.println(m.size() + " parole distinte: " + m);
    }
}