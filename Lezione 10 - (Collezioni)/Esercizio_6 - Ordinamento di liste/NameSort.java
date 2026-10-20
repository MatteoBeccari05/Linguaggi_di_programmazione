import java.util.*;

public class NameSort 
{
    public static void main(String args[]) 
    {
        // Creazione di un array di oggetti Persona
        Persona elencoPersone[] = {
            new Persona("Eugenio", "Bennato"),
            new Persona("Roberto", "Benigni"),
            new Persona("Edoardo", "Bennato"),
            new Persona("Bruno", "Vespa")
        };

        // Arrays.asList produce una List a partire dall'array dato (senza specificare un'implementazione esplicita)
        List l = Arrays.asList(elencoPersone);

        // Collections.sort ordina la lista in senso ascendente usando il compareTo definito nella classe Persona
        Collections.sort(l);

        // Stampa la lista ordinata
        System.out.println(l);
    }
}