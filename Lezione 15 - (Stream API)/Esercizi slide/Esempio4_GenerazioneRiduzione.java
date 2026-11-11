import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Esempio4_GenerazioneRiduzione 
{
    public static void main(String[] args) 
    {
        System.out.println("--- 1. Generazione da operatore unario (Iterate) ---");
        System.out.println("Creo un flusso che aggiunge un '+' ad ogni iterazione, finché la lunghezza è <= 5.");
        Stream<String> iterated = Stream.iterate("+", s -> s.length() <= 5, s -> s + "+");
        iterated.forEach(System.out::println);

        System.out.println("\n--- 2. Generazione con Random ---");
        System.out.println("Genero 10 numeri casuali interi compresi tra 0 e 5.");
        Random random = new Random(314L); // Uso un seed per ottenere sempre gli stessi numeri
        List<Integer> randomInts = random.ints(10, 0, 6)
            .boxed() // Converte l'IntStream in Stream<Integer>
            .collect(Collectors.toList());
        System.out.println("Numeri generati: " + randomInts);

        System.out.println("\n--- 3. Riduzione con identità ---");
        System.out.println("Sommo 4 valori usando reduce con valore iniziale (identità) a 0.");
        Stream<Integer> streamZeri = Stream.of(0, 0, 0, 0);
        int sum = streamZeri.reduce(0, (a, b) -> a + b);
        System.out.println("Somma (0+0+0+0): " + sum);

        System.out.println("\n--- 4. Riduzione senza identità (Max custom) ---");
        System.out.println("Trovo il valore massimo in un flusso, restituendo un Optional.");
        Stream<Integer> numbers = Stream.of(2, 8, 1, 5, 3);
        Optional<Integer> maxOpt = numbers.reduce((i1, i2) -> i1 > i2 ? i1 : i2);
        
        // Verifica in modo sicuro se l'optional contiene un valore
        if (maxOpt.isPresent()) 
        {
            System.out.println("Valore massimo trovato: " + maxOpt.orElseThrow());
        }
    }
}