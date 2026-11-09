import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

public class Esercizio1 
{
    public static void pulisciLista(List<String> lista) 
    {
        // 1. Definiamo i predicati atomici
        Predicate<String> isNull = Objects::isNull;
        Predicate<String> isEmpty = String::isEmpty;
        Predicate<String> tooShort = s -> s.length() < 4;
        Predicate<String> containsSpace = s -> s.contains(" ");

        // 2. Componiamo il predicato per identificare cosa scartare
        // Nota: se la stringa è null, i controlli successivi non devono andare in NullPointerException
        Predicate<String> daRimuovere = isNull
                .or(isEmpty)
                .or(s -> tooShort.test(s) || containsSpace.test(s));

        // 3. Eseguiamo la rimozione in-place
        lista.removeIf(daRimuovere);
    }

    public static void main(String[] args) 
    {
        List<String> parole = new ArrayList<>(List.of(
            "Java", "", "C++", "Programmazione", "a b", "OOP"
        ));
        parole.add(null); // inseriamo anche un valore nullo

        pulisciLista(parole);

        // Risultato atteso: [Java, Programmazione]
        System.out.println("Lista pulita: " + parole);
    }
}