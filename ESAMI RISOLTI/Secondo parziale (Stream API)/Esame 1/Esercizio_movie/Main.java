import java.util.*;
import java.util.stream.*;

public class Main 
{
    public static void main(String[] args) 
    {
        List<Movie> movies = Arrays.asList(
            new Movie("Inception", "Christopher Nolan", "Sci-Fi", 2010, 148),
            new Movie("The Godfather", "Francis Ford Coppola", "Crime", 1972, 175),
            new Movie("Interstellar", "Christopher Nolan", "Sci-Fi", 2014, 169),
            new Movie("Pulp Fiction", "Quentin Tarantino", "Crime", 1994, 154),
            new Movie("The Dark Knight", "Christopher Nolan", "Action", 2008, 152),
            new Movie("Django Unchained", "Quentin Tarantino", "Western", 2012, 165),
            new Movie("Tenet", "Christopher Nolan", "Sci-Fi", 2020, 150)
        );

        // Calcola la durata media dei film per regista
        Map<String, Double> averageDurationByDirector =
            movies.stream()
                .collect(Collectors.groupingBy(
                    Movie::getDirector,
                    Collectors.averagingInt(Movie::getDuration)
                ));

        // Stampa il risultato
        averageDurationByDirector.forEach((director, avgDuration) ->
            System.out.println(director + " -> " + avgDuration + " minuti")
        );
    }
}