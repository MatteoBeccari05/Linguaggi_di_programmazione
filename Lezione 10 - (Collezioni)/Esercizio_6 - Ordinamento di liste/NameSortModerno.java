import java.util.*;

public class NameSortModerno 
{
    public static void main(String[] args) 
    {
        List<Persona> elencoPersone = Arrays.asList(
            new Persona("Eugenio", "Bennato"),
            new Persona("Roberto", "Benigni"),
            new Persona("Edoardo", "Bennato"),
            new Persona("Bruno", "Vespa")
        );

        // Ordinamento tramite Collections.sort
        Collections.sort(elencoPersone);

        System.out.println("Elenco persone ordinato: " + elencoPersone);
    }
}