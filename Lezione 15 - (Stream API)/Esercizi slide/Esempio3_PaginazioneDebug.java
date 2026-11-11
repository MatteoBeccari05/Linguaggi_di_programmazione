import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Esempio3_PaginazioneDebug 
{
    public static void main(String[] args) 
    {
        
        System.out.println("--- 1. Paginazione (Skip e Limit) ---");
        System.out.println("Prendo una lista da 1 a 9, salto i primi 2 elementi, e prendo solo i successivi 5.");
        List<Integer> ints = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> resultInts = ints.stream()
            .skip(2)
            .limit(5)
            .collect(Collectors.toList());
        System.out.println("Risultato (dovrebbe essere [3, 4, 5, 6, 7]): " + resultInts);

        System.out.println("\n--- 2. Concatenazione ---");
        System.out.println("Unisco due liste usando Stream.concat().");
        List<Integer> list0 = List.of(1, 2, 3);
        List<Integer> list1 = List.of(4, 5, 6);
        List<Integer> concat = Stream.concat(list0.stream(), list1.stream())
            .collect(Collectors.toList());
        System.out.println("Lista concatenata: " + concat);

        System.out.println("\n--- 3. Debugging (Peek) ---");
        System.out.println("Uso peek per vedere i passaggi intermedi: filtra la lettera 't' e converte in maiuscolo.");
        List<String> strings = List.of("one", "two", "three", "four");
        List<String> resultStrings = strings.stream()
            .peek(s -> System.out.println("  Inizio elaborazione: " + s))
            .filter(s -> s.startsWith("t"))
            .peek(s -> System.out.println("  Superato il filtro (inizia per t): " + s))
            .map(String::toUpperCase)
            .peek(s -> System.out.println("  Mappato in maiuscolo: " + s))
            .collect(Collectors.toList());
        System.out.println("Risultato finale del flusso: " + resultStrings);
    }
}