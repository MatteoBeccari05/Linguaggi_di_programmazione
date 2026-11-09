import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Persona 
{
    private final String nome;
    private final String cognome;
    private final int eta;

    public Persona(String nome, String cognome, int eta) 
    {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
    }

    public String getNome() { return nome; }
    public String getCognome() { return cognome; }
    public int getEta() { return eta; }

    @Override
    public String toString() 
    {
        return cognome + " " + nome + " (" + eta + " anni)";
    }
}

public class Esercizio3 
{
    public static void main(String[] args) 
    {
        List<Persona> persone = Arrays.asList(
            new Persona("Marco", "Rossi", 25),
            null,
            new Persona("Luca", "Bianchi", 30),
            new Persona("Anna", "Rossi", 40),
            new Persona("Marco", "Rossi", 50),
            null
        );

        // Costruzione del comparatore per le istanze di Persona
        Comparator<Persona> comparatorePersona = Comparator
                .comparing(Persona::getCognome)                                         // 1. Cognome crescente
                .thenComparing(Persona::getNome)                                       // 2. Nome crescente
                .thenComparing(Comparator.comparingInt(Persona::getEta).reversed());  // 3. Età decrescente

        // Rendiamo il comparatore sicuro contro i puntatori nulli
        Comparator<Persona> nullSafeComparator = Comparator.nullsLast(comparatorePersona);

        // Ordinamento della lista
        persone.sort(nullSafeComparator);

        // Stampa del risultato
        persone.forEach(System.out::println);
    }
}