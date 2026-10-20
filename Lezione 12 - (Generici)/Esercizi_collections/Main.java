import java.util.*;

public class Main 
{
    public static void main(String[] args) 
    {
        // 1. Test di Collections.fill(List<? super T> list, T elem)
        // Possiamo riempire una List<Number> passando un Integer
        List<Number> listaNumeri = new ArrayList<>(Arrays.asList(1, 2, 3));
        Collections.fill(listaNumeri, Integer.valueOf(99));
        System.out.println("Dopo Collections.fill: " + listaNumeri);

        // 2. Test di Collections.copy(List<? super T> dest, List<? extends T> src)
        // Copia una List<Integer> dentro una List<Number> (Della stessa dimensione)
        List<Integer> sorgente = Arrays.asList(10, 20, 30);
        Collections.copy(listaNumeri, sorgente);
        System.out.println("Dopo Collections.copy: " + listaNumeri);

        // 3. Test di Collections.sort(List<T> list, Comparator<? super T> comp)
        // Definiamo un Comparator<Number> generale (che ordina in modo decrescente)
        Comparator<Number> compDecrescente = new Comparator<Number>() 
        {
            @Override
            public int compare(Number n1, Number n2) 
            {
                return Double.compare(n2.doubleValue(), n1.doubleValue());
            }
        };

        // Grazie a Comparator<? super T>, usiamo Comparator<Number> per ordinare una List<Integer>!
        List<Integer> interiDaOrdinare = new ArrayList<>(Arrays.asList(15, 42, 8, 99, 23));
        Collections.sort(interiDaOrdinare, compDecrescente);
        System.out.println("Dopo Collections.sort (decrescente): " + interiDaOrdinare);
    }
}

/*
Mette in pratica i tre metodi della libreria standard di Java citati nella slide 62 
(Collections.fill, Collections.copy e Collections.sort), mostrando come i loro parametri controvarianti (<? super T>) 
permettano, ad esempio, di ordinare una List<Integer> usando un comparatore più generale scritto per Number (Comparator<Number>).   
*/