import java.util.*;

public class EsListModerno 
{
    // Metodo generico <E> per scambiare due elementi in qualsiasi List<E>
    static <E> void swap(List<E> a, int i, int j) 
    {
        E tmp = a.get(i);
        a.set(i, a.get(j));
        a.set(j, tmp);
    }

    public static void main(String[] args) 
    {
        // Valori di default se non vengono passati argomenti da riga di comando
        if (args.length == 0) 
        {
            args = new String[]{"cane", "gatto", "pappagallo", "canarino", "cane", "canarino", "pescerosso"};
        }

        // Uso di ArrayList tipizzata con <String>
        List<String> list = new ArrayList<String>();

        for (String parola : args) 
        {
            list.add(parola);
        }

        System.out.println("Prima dello scambio: " + list);

        // Scambio degli elementi di indice 2 e 3 (3° e 4° elemento)
        swap(list, 2, 3);

        System.out.println("Dopo lo scambio:     " + list);
    }
}