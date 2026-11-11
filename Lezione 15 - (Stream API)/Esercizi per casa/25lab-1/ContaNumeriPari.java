import java.util.Arrays;
import java.util.List;

// Si scriva uno stream che permetta di contare il numero di elementi pari.

public class ContaNumeriPari 
{
    public static void main(String args[]) 
    {
        List<Integer> numeri = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        long risultato = numeri.stream()
            .filter(n -> n % 2 == 0) // Isola unicamente i numeri pari
            .count();                // Esegue il conteggio totale degli elementi che soddisfano il filtro
            
        System.out.println("Ci sono " + risultato + " numeri pari");
    }
}