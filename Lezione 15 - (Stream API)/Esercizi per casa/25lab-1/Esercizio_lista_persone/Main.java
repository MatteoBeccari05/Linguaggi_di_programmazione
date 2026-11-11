import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Main 
{
    public static void main(String[] args) 
    {
        // Creazione di una lista di oggetti Persona (almeno 10 persone con attributi vari)
        List<Persona> persone = Arrays.asList(
            new Persona("Alice", 28, Genere.FEMMINA, "Milano"),
            new Persona("Marco", 35, Genere.MASCHIO, "Roma"),
            new Persona("Giulia", 22, Genere.FEMMINA, "Napoli"),
            new Persona("Luca", 40, Genere.MASCHIO, "Milano"),
            new Persona("Sara", 19, Genere.FEMMINA, "Roma"),
            new Persona("Matteo", 31, Genere.MASCHIO, "Torino"),
            new Persona("Elena", 45, Genere.FEMMINA, "Milano"),
            new Persona("Paolo", 27, Genere.MASCHIO, "Napoli"),
            new Persona("Chiara", 33, Genere.FEMMINA, "Roma"),
            new Persona("Davide", 25, Genere.MASCHIO, "Torino")
        );

        // a) Filtrare le persone che hanno più di 30 anni
        List<Persona> maggiori30 = persone.stream()
            .filter(p -> p.getEta() > 30)  // Valuta la condizione dell'età e scarta chi ha 30 anni o meno
            .collect(Collectors.toList()); // Salva i risultati in una nuova lista
            
        System.out.println("a) Persone over 30:\n   " + maggiori30);


        // b) Estrarre i nomi delle persone che vivono in una città specifica (es. "Milano")
        List<String> nomiMilano = persone.stream()
            .filter(p -> p.getCitta().equals("Milano")) // Mantiene solo gli elementi la cui città è "Milano"
            .map(Persona::getNome)                      // Trasforma lo stream di oggetti Persona in uno stream di Stringhe (i nomi)
            .collect(Collectors.toList());              // Raccoglie i nomi in una lista
            
        System.out.println("\nb) Nomi di chi vive a Milano:\n   " + nomiMilano);


        // c) Calcolare l'età media delle persone di sesso femminile
        OptionalDouble etaMediaFemmine = persone.stream()
            .filter(p -> p.getGenere() == Genere.FEMMINA) // Trattiene solo le donne
            .mapToInt(Persona::getEta)                    // Converte lo Stream in IntStream per estrarre l'età numerica
            .average();                                   // Effettua il calcolo della media aritmetica
            
        System.out.println("\nc) Età media delle donne: " + (etaMediaFemmine.isPresent() ? etaMediaFemmine.getAsDouble() : "N/A"));


        // d) Trovare la persona più giovane nella lista
        Optional<Persona> piuGiovane = persone.stream()
            .min(Comparator.comparingInt(Persona::getEta)); // Scandisce lo stream e restituisce l'elemento con il valore di età minimo
            
        System.out.println("\nd) Persona più giovane:\n   " + piuGiovane.orElse(null));


        // e) Raggruppare le persone per città e stampare il risultato
        Map<String, List<Persona>> personePerCitta = persone.stream()
            .collect(Collectors.groupingBy(Persona::getCitta)); // Utilizza il campo 'citta' per smistare e raggruppare le persone all'interno della Mappa
            
        System.out.println("\ne) Persone raggruppate per città:");
        personePerCitta.forEach((citta, lista) -> 
            System.out.println("   " + citta + ": " + lista)
        );


        // f) Verificare se tutte le persone della lista sono maggiorenni
        // N.B: Sulle slide è mostrato un approccio con reduce (riduzione logica), ma l'uso di allMatch è lo standard ottimizzato
        boolean tutteMaggiorenni = persone.stream()
            .allMatch(p -> p.getEta() >= 18); // Restituisce true soltanto se il test (età >= 18) passa per TUTTI gli elementi dello stream
            
        System.out.println("\nf) Tutte le persone sono maggiorenni? " + tutteMaggiorenni);


        // g) Contare quante persone vivono in una città specifica (es. "Roma")
        long conteggioRoma = persone.stream()
            .filter(p -> p.getCitta().equals("Roma")) // Prima esegue il filtro mantenendo solo i residenti a Roma
            .count();                                 // Poi conta fisicamente gli elementi rimasti nello stream
            
        System.out.println("\ng) Numero di persone che vivono a Roma: " + conteggioRoma);
    }
}