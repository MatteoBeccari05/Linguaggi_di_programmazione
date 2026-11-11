import java.util.List;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;

public class Esempio1_MappaturaFiltri 
{
    public static void main(String[] args) 
    {
        List<String> strings = List.of("one", "two", "three", "four");
        
        System.out.println("--- 1. Mappatura (Map) ---");
        System.out.println("Trasformo le stringhe nella loro lunghezza creando una nuova lista.");
        List<Integer> lengths = strings.stream()
            .map(String::length)
            .collect(Collectors.toList());
        System.out.println("Lunghezze: " + lengths);

        System.out.println("\n--- 2. Filtraggio (Filter) ---");
        System.out.println("Filtro solo le stringhe con lunghezza esattamente pari a 3 e le conto.");
        long count = strings.stream()
            .map(String::length)
            .filter(length -> length == 3)
            .count();
        System.out.println("Numero di stringhe lunghe 3 caratteri: " + count);

        System.out.println("\n--- 3. Statistiche (IntSummaryStatistics) ---");
        System.out.println("Uso mapToInt per creare uno stream numerico specializzato e ottenere statistiche complete.");
        IntSummaryStatistics stats = strings.stream()
            .mapToInt(String::length)
            .summaryStatistics();
        System.out.println("Statistiche: " + stats);
    }
}