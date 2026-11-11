import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main 
{
    public static void main(String[] args) 
    {
        // Creazione di una lista di persone di esempio
        List<Persona> persone = Arrays.asList(
            new Persona("Mario", "Rossi", 30, Arrays.asList("calcio", "lettura")),
            new Persona("Luigi", "Verdi", 17, Arrays.asList("videogiochi", "calcio")),
            new Persona("Giulia", "Bianchi", 25, Arrays.asList("lettura", "viaggi")),
            new Persona("Anna", "Neri", 22, Arrays.asList("calcio", "musica")),
            new Persona("Paolo", "Gialli", 40, Arrays.asList("lettura", "cucina"))
        );

        // 1. Raggruppamento base come nell'esercizio precedente
        Map<String, List<Persona>> personePerPassione = persone.stream()
            .filter(p -> p.getEta() >= 18)                                // Filtra i maggiorenni
            .sorted(Comparator.comparing(Persona::getEta))                // Ordina per età crescente
            .collect(Collectors.groupingBy(p -> p.getPassioni().get(0))); // Raggruppa per la prima passione

        // 2. Iterazione sulla mappa per il calcolo delle statistiche e la stampa elegante
        personePerPassione.forEach((passione, personeConPassione) -> {
            
            // Calcolo dell'età media per la passione corrente utilizzando un nuovo stream sulla lista raggruppata
            double etaMedia = personeConPassione.stream()
                .mapToInt(Persona::getEta) // Converte lo stream in un IntStream prendendo l'età di ogni persona
                .average()                 // Calcola l'età media
                .orElse(0.0);              // Restituisce 0.0 nel caso in cui la lista fosse vuota

            // Personalizzazione della stampa (Output formattato elegantemente)
            System.out.println("========================================");
            System.out.println(" PASSIONE: " + passione.toUpperCase());
            System.out.println("========================================");
            System.out.println(" 👥 Numero iscritti: " + personeConPassione.size());
            System.out.printf(" 📊 Età media: %.1f anni\n", etaMedia);
            System.out.println(" 📋 Elenco persone:");
            
            // Stampa dettagliata dei membri
            personeConPassione.forEach(p -> 
                System.out.println("    - " + p.getNome() + " " + p.getCognome() + " (Età: " + p.getEta() + ")")
            );
            System.out.println("\n");
        });
    }
}