import java.util.*;

public class EsListIterator 
{
    public static void main(String args[]) 
    {
        // Creazione di una lista (usiamo ArrayList come implementazione standard)
        List l = new ArrayList();

        // Inserimento degli elementi passati da riga di comando nella lista
        for (int i = 0; i < args.length; i++) 
        {
            l.add(args[i]);
        }

        // Otteniamo un ListIterator posizionato alla fine della lista (l.size())
        // Per poter usare l'iterazione a ritroso (hasPrevious), bisogna iniziare dalla fine!
        for (ListIterator i = l.listIterator(l.size()); i.hasPrevious(); ) 
        {
            System.out.print(i.previous() + " ");
        }
        System.out.println();
    }
}