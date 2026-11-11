import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// Trova i primi 5 numeri divisibili per 17 generati da un flusso infinito

public class Primi5NumeriDiv17 
{
    public static void main(String args[]) 
    {
        IntStream numbers = new Random().ints().map(Math::abs);
        List<Integer> risultato = exercise_4(numbers);
        System.out.println(risultato);
    }

    public static List<Integer> exercise_4(IntStream numbers)
    {
        return numbers.filter(n -> n % 17 == 0).limit(5).mapToObj(n -> n).collect(Collectors.toList());
    }
}