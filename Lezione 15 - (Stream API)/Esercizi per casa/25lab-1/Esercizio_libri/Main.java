import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main 
{
    public static void main(String[] args) 
    {
        // Inizializzazione della lista di libri
        List<Book> books = Arrays.asList(
            new Book("La divina commedia", "Dante Alighieri", 1304, 40),
            new Book("I promessi sposi", "Alessandro Manzoni", 1827, 20),
            new Book("Big Brother", "George Orwell", 1984, 30),
            new Book("Infinite Jest", "David Wallace", 2011, 50)
        );

        // Punto 1: Filtrare i libri pubblicati dopo il 2010
        List<Book> recentBooks = books.stream()
            .filter(b -> b.getPublicationYear() > 2010) // Mantiene solo gli elementi con anno di pubblicazione maggiore di 2010
            .collect(Collectors.toList());              // Raccoglie i libri filtrati in una lista
            
        System.out.println("Libri recenti (> 2010): " + recentBooks);


        // Punto 2: Ordinare la lista di libri in ordine crescente di prezzo
        List<Book> sortedBooks = books.stream()
            .sorted(Comparator.comparingDouble(Book::getPrice)) // Usa il prezzo come chiave di confronto per ordinare gli elementi dal più economico al più costoso
            .collect(Collectors.toList());                      // Salva il risultato ordinato in una nuova lista
            
        System.out.println("\nLibri ordinati per prezzo crescente:\n" + sortedBooks);


        // Punto 3: Creare una lista dei libri scritti da un autore specifico
        List<Book> authorBooks = books.stream()
            .filter(b -> b.getAuthor().equals("Alessandro Manzoni")) // Filtra lo stream trattenendo solo i libri dove l'autore corrisponde a quello cercato
            .collect(Collectors.toList());
            
        System.out.println("\nLibri di Alessandro Manzoni: " + authorBooks);


        // Punto 4: Calcolare la media dei prezzi di tutti i libri
        double averageBooks = books.stream()
            .mapToDouble(Book::getPrice) // Estrae il prezzo da ogni libro trasformando lo stream in un DoubleStream
            .average()                   // Calcola la media aritmetica dei prezzi
            .orElse(0.0);                // Valore di default in caso di lista vuota
            
        System.out.println("\nPrezzo medio dei libri: $" + averageBooks);


        // Punto 5: Trovare il libro con il prezzo più alto
        Optional<Book> maxBook = books.stream()
            .max(Comparator.comparingDouble(b -> b.getPrice())); // Trova l'elemento col valore massimo basandosi sul prezzo
            
        System.out.println("\nLibro più costoso: " + maxBook.orElse(null));


        // Punto 6: Controllare se c'è almeno un libro che costa più di 30 euro
        boolean overBook = books.stream()
            .anyMatch(b -> b.getPrice() > 30); // anyMatch restituisce true appena trova anche un solo elemento che soddisfa la condizione
            
        System.out.println("\nC'è almeno un libro che costa più di 30$? " + overBook);


        // Punto 7: Stampare i libri ordinati per anno di pubblicazione in ordine decrescente
        List<Book> sortedBooks2 = books.stream()
            .sorted(Comparator.comparingDouble(Book::getPublicationYear).reversed()) // Il .reversed() inverte l'ordinamento naturale (da crescente a decrescente)
            .collect(Collectors.toList());                                           // Raccoglie i libri ordinati dal più recente al più antico
            
        System.out.println("\nLibri ordinati per anno decrescente:\n" + sortedBooks2);
    }
}