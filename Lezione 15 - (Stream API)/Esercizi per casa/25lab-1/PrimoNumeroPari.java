import java.util.Arrays;
import java.util.List;
import java.util.Optional;

// Si scriva uno stream che permette di selezionare il primo numero pari.

public class PrimoNumeroPari 
{
    public static void main(String args[]) 
    {
        List<Integer> numeri = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Optional<Integer> risultato = numeri.stream()
            .filter(n -> n % 2 == 0) // Controlla la condizione e lascia passare solo i numeri pari (resto zero)
            .findFirst();            // Interrompe l'elaborazione appena trova il primo elemento utile
            
        if (risultato.isPresent()) 
        {
            System.out.println("Il primo numero pari è: " + risultato.get());
        }
    }
}