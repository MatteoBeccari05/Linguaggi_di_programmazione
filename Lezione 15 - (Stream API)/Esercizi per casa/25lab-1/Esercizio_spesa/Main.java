import java.util.*;
import java.util.stream.Collectors;

public class Main 
{
    public static void main(String[] args) {
        // Inizializzazione della lista di spese
        List<Spesa> spese = new ArrayList<>();
        spese.add(new Spesa(10.00, "vitto"));
        spese.add(new Spesa(15.50, "cinema"));
        spese.add(new Spesa(300.00, "alloggio"));
        spese.add(new Spesa(32.70, "vitto"));
        spese.add(new Spesa(52.10, "vitto"));

        // Utilizzo della Stream API per raggruppare le spese
        Map<String, List<Spesa>> mappa = spese.stream()
            .collect(Collectors.groupingBy(spesa -> spesa.getTipologia())); // Raggruppa gli oggetti Spesa creando una Mappa dove la chiave è la 'tipologia' e il valore è la Lista delle spese di quel tipo

        // Stampa dei risultati
        System.out.println("Categorie presenti: " + mappa.keySet());
        System.out.println("Spese per vitto: " + mappa.get("vitto"));
        System.out.println("Spese per cinema: " + mappa.get("cinema"));
        System.out.println("Spese per alloggio: " + mappa.get("alloggio"));
    }
}