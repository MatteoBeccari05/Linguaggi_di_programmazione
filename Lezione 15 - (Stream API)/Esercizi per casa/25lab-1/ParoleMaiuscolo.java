import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Si crei una nuova lista con le parole della lista parole con tutte le lettere maiuscole utilizzando la notazione ::

public class ParoleMaiuscolo 
{
    public static void main(String args[]) 
    {
        List<String> parole = Arrays.asList("luna", "stitch", "miguel", "speedy");
        List<String> paroleMaiuscole = parole.stream()
            .map(String::toUpperCase)      // Applica il reference method per trasformare ogni stringa in maiuscolo
            .collect(Collectors.toList()); // Raccoglie i nuovi valori formattati in una lista indipendente
            
        System.out.println("Parole maiuscole: " + paroleMaiuscole);
    }
}