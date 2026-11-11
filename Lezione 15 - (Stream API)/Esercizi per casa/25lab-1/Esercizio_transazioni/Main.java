import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main 
{
    public static void main(String[] args) 
    {
        // Inizializzazione della lista di transazioni
        List<Transazione> transazioni = Arrays.asList(
            new Transazione(LocalDate.of(2023, Month.NOVEMBER, 15), 100.0, "credito"),
            new Transazione(LocalDate.of(2023, Month.APRIL, 11), 200.0, "debito"),
            new Transazione(LocalDate.of(2023, Month.AUGUST, 9), 300.0, "credito"),
            new Transazione(LocalDate.of(2023, Month.OCTOBER, 2), 400.0, "debito"),
            new Transazione(LocalDate.of(2023, Month.NOVEMBER, 8), 500.0, "credito")
        );

        // Punto 1: filtrare le transazioni effettuate in un determinato mese dell'anno (Novembre)
        List<Transazione> transazioniNovembre = transazioni.stream()
            .filter(t -> t.getData().getMonth() == Month.NOVEMBER) // Controlla il mese della data e lascia passare solo quelle di Novembre
            .collect(Collectors.toList());                         // Raccoglie le transazioni filtrate in una nuova lista
            
        System.out.println("Transazioni di Novembre: " + transazioniNovembre);


        // Punto 2: Calcolare l'importo totale dei crediti e dei debiti separatamente
        double crediti = transazioni.stream()
            .filter(t -> t.getTipo().equals("credito")) // Isola solo le transazioni in entrata (credito)
            .map(t -> t.getImporto())                   // Estrae il valore dell'importo per ogni transazione
            .reduce(0.0, (a, b) -> a + b);              // Somma tutti gli importi partendo da 0.0

        double debiti = transazioni.stream()
            .filter(t -> t.getTipo().equals("debito"))  // Isola solo le transazioni in uscita (debito)
            .map(t -> t.getImporto())                   // Estrae il valore dell'importo
            .reduce(0.0, (a, b) -> a + b);              // Somma tutti i debiti
            
        System.out.println("Totale crediti: " + crediti);
        System.out.println("Totale debiti: " + debiti);


        // Punto 3: Trovare la transazione con l'importo più alto in valore assoluto (crediti e debiti)
        Optional<Transazione> maxCredito = transazioni.stream()
            .filter(t -> t.getTipo().equals("credito"))            // Filtra solo i crediti
            .max(Comparator.comparingDouble(t -> t.getImporto())); // Cerca l'elemento con l'importo massimo

        Optional<Transazione> maxDebito = transazioni.stream()
            .filter(t -> t.getTipo().equals("debito"))             // Filtra solo i debiti
            .max(Comparator.comparingDouble(t -> t.getImporto())); // Cerca l'elemento con l'importo massimo
            
        System.out.println("Transazione massima in credito: " + maxCredito.orElse(null));
        System.out.println("Transazione massima in debito: " + maxDebito.orElse(null));


        // Punto 4: Ordinare le transazioni in base alla data in ordine cronologico decrescente
        List<Transazione> transazioni_ordinate = transazioni.stream()
            .sorted((t1, t2) -> t2.getData().compareTo(t1.getData())) // Confronta le date scambiando t1 e t2 per ottenere l'ordine decrescente (dalla più recente alla più vecchia)
            .collect(Collectors.toList());                            // Raccoglie i risultati ordinati
            
        System.out.println("Transazioni ordinate per data (decrescente):");
        transazioni_ordinate.forEach(System.out::println);
    }
}