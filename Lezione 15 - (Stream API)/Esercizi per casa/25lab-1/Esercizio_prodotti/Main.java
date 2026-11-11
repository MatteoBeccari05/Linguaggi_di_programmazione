import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main 
{
    public static void main(String[] args) 
    {
        // Inizializzazione della lista di prodotti
        List<Prodotto> prodotti = Arrays.asList(
            new Prodotto("Tastiera", 50.0, "informatica"),
            new Prodotto("Pallone", 12.0, "sport"),
            new Prodotto("Quaderni", 5.0, "scuola"),
            new Prodotto("Mouse", 25.0, "informatica"),
            new Prodotto("Scarpe", 80.0, "abbigliamento")
        );

        // Punto 1: Filtrare i prodotti di una categoria specifica e con un prezzo superiore ad una certa soglia
        List<Prodotto> prodottiFiltrati = prodotti.stream()
            .filter(p -> p.getCategoria().equals("informatica") && p.getPrezzo() > 30) // Applica un doppio filtro logico su categoria e prezzo
            .collect(Collectors.toList());                                             // Materializza i risultati validi in una lista
            
        System.out.println("Prodotti informatica > 30 euro: " + prodottiFiltrati);


        // Punto 2: Trovare il prodotto più caro di ogni categoria
        Map<String, Optional<Prodotto>> prodottoPiuCaroPerCategoria = prodotti.stream()
            .collect(Collectors.groupingBy(
                Prodotto::getCategoria,                                           // Raggruppa gli elementi usando la categoria come chiave della mappa
                Collectors.maxBy(Comparator.comparingDouble(Prodotto::getPrezzo)) // Per ogni gruppo, cerca l'elemento con il prezzo massimo
            ));
            
        System.out.println("\nProdotto più caro per categoria:");
        prodottoPiuCaroPerCategoria.forEach((categoria, prodotto) -> 
            System.out.println(categoria + " : " + prodotto.orElse(null))
        );


        // Punto 3: Calcolare il prezzo medio di tutti i prodotti
        double media = prodotti.stream()
            .mapToDouble(Prodotto::getPrezzo) // Converte lo Stream di oggetti in un DoubleStream isolando solo il prezzo
            .average()                        // Esegue il calcolo della media matematica di tutti i valori nel DoubleStream
            .orElse(0.0);                     // Fornisce un valore di default (0.0) nel caso in cui lo stream fosse vuoto
            
        System.out.println("\nPrezzo medio di tutti i prodotti: " + media);


        // Punto 4: Creare una mappa dove la chiave è la categoria e il valore è una lista dei nomi dei prodotti in quella categoria
        Map<String, List<String>> prodottiPerCategorie = prodotti.stream()
            .collect(Collectors.groupingBy(
                Prodotto::getCategoria,                                    // Raggruppa per categoria (Chiave)
                Collectors.mapping(Prodotto::getNome, Collectors.toList()) // Estrae solo il nome del prodotto e lo raccoglie in una Lista (Valore associato alla chiave)
            ));
            
        System.out.println("\nNomi prodotti raggruppati per categoria:");
        prodottiPerCategorie.forEach((categoria, nomi) -> 
            System.out.println(categoria + " : " + nomi)
        );
    }
}