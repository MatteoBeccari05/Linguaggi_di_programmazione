import java.util.*;

public class EsListIteratorModerno 
{
    public static void main(String[] args) 
    {
        // Valori di default se non vengono passati argomenti da riga di comando
        if (args.length == 0) 
        {
            args = new String[]{"cane", "gatto", "cane", "canarino"};
        }

        // Dichiarazione della lista tipizzata con Generics
        List<String> l = new ArrayList<String>();

        // Popolamento della lista
        for (String parola : args) 
        {
            l.add(parola);
        }

        System.out.println("Lista originale inserita: " + l);
        System.out.print("Stampa a ritroso con ListIterator: ");

        // Iteratore di lista inizializzato all'indice finale (l.size())
        ListIterator<String> i = l.listIterator(l.size());

        // Scansione all'indietro finché c'è un elemento precedente
        while (i.hasPrevious()) 
        {
            String parolaInversa = i.previous();
            System.out.print(parolaInversa + " ");
        }
        System.out.println();
    }
}