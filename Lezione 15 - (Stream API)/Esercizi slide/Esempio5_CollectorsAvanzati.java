import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Esempio5_CollectorsAvanzati 
{
    public static void main(String[] args) 
    {
        List<String> strings = List.of("one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve");

        System.out.println("--- 1. Joining ---");
        System.out.println("Unisco i numeri da 0 a 9 in una singola stringa formattata.");
        String joined = IntStream.range(0, 10)
            .boxed()
            .map(Object::toString)
            .collect(Collectors.joining(", ", "{", "}"));
        System.out.println("Risultato stringa unita: " + joined);

        System.out.println("\n--- 2. PartitioningBy ---");
        System.out.println("Suddivido le stringhe in due gruppi: lunghezza > 4 (true) e lunghezza <= 4 (false).");
        Map<Boolean, List<String>> partitioned = strings.stream()
            .collect(Collectors.partitioningBy(s -> s.length() > 4));
        partitioned.forEach((key, value) -> System.out.println(key + " -> " + value));

        System.out.println("\n--- 3. GroupingBy (Istogramma) ---");
        System.out.println("Raggruppo le stringhe per lunghezza (chiave) e conto quanti elementi ci sono (valore).");
        Map<Integer, Long> histogram = strings.stream()
            .collect(Collectors.groupingBy(String::length, Collectors.counting()));
        histogram.forEach((key, value) -> System.out.println("Lunghezza " + key + " :: Quantità " + value));

        System.out.println("\n--- 4. Estrazione del massimo da un istogramma ---");
        System.out.println("Cerco la entry nella mappa precedente con il valore (conteggio) più alto.");
        Map.Entry<Integer, Long> maxValue = histogram.entrySet().stream()
            .max(Map.Entry.comparingByValue())
            .orElseThrow();
        System.out.println("Il gruppo più numeroso ha lunghezza " + maxValue.getKey() + " con " + maxValue.getValue() + " elementi.");
    }
}