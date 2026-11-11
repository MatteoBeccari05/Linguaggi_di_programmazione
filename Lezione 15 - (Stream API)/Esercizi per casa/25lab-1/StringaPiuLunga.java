import java.util.*;
import static java.util.Arrays.asList;

//Trova la lunghezza della stringa più lunga

public class StringaPiuLunga 
{
    public static void main(String[] args)
    {
        List<String> strings = asList("Lorem", "ipsum", "dolor", "sit", "amet,", "consectetur", "adipiscing", "elit.");
        Optional<Integer> risultato = stringa_piu_lunga(strings);
        System.out.println(risultato.orElse(0));
    }

    public static Optional<Integer> stringa_piu_lunga(List<String> strings)
    {
        return strings.stream().map(String::length).reduce(Math::max);
    }
}