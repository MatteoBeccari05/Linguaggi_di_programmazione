import java.util.*;

public class EsList 
{
    // Metodo statico accessorio per scambiare gli elementi nelle posizioni i e j
    static void swap(List a, int i, int j) 
    {
        Object tmp = a.get(i);   // Salva temporaneamente l'elemento in posizione i
        a.set(i, a.get(j));      // Sostituisce l'elemento in posizione i con quello in posizione j
        a.set(j, tmp);           // Mette nella posizione j l'elemento salvato in tmp
    }

    public static void main(String args[]) 
    {
        // Scelta dell'implementazione: ArrayList (oppure new LinkedList();)
        List list = new ArrayList();

        // Aggiunge in coda (append) ogni parola passata da riga di comando
        for (int i = 0; i < args.length; i++) 
        {
            list.add(args[i]);
        }

        // Stampa la lista prima dello scambio
        System.out.println(list);

        // Scambia gli elementi di indice 2 e 3 (cioè il 3° e il 4° elemento, poiché gli indici partono da 0)
        swap(list, 2, 3);

        // Stampa la lista dopo lo scambio
        System.out.println(list);
    }
}