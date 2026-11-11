import java.util.*;
import java.util.stream.Collectors;
import static java.util.Arrays.asList;

//Dividi ogni numero di una lista di interi per 2 (ignorando il resto) e raccogli in un set.

public class Divisione 
{
    public static void main(String[] args)
    {
        List<Integer> numbers = asList(1, 2, 3, 4, 5);

        Set<Integer> risultato = divisione(numbers);
        System.out.println(risultato);
    }

    public static Set<Integer> divisione(List<Integer> numbers) 
    {
        return numbers.stream().map(n -> n / 2).collect(Collectors.toSet());
    }

}