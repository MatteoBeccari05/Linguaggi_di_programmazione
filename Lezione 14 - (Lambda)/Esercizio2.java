import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Esercizio2 
{
    public static void main(String[] args) 
    {
        List<String> matricole = Arrays.asList("  ab12  ", "cd34_x  ", "  ef56_y");

        // 1. Operatore per normalizzare (trim + toUpperCase)
        UnaryOperator<String> normalizza = s -> s.trim().toUpperCase();
        matricole.replaceAll(normalizza);

        // 2. Creazione dei consumatori
        Consumer<String> logger = s -> System.out.println("[INFO] Elaborazione codice: " + s);
        Consumer<String> stampaLunghezza = s -> System.out.println("       Lunghezza: " + s.length());

        // 3. Concatenamento dei consumatori
        Consumer<String> pipeline = logger.andThen(stampaLunghezza);

        // 4. Esecuzione su ogni elemento
        matricole.forEach(pipeline);
    }
}