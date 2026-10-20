import java.util.Arrays;
import java.util.List;

public class Main 
{
    // Accetta una lista di qualunque tipo che estenda Number (Integer, Double, Float, ecc.)
    public static double sumOfList(List<? extends Number> list) 
    {
        double s = 0.0;
        for (Number n : list) 
        {
            s += n.doubleValue();
        }
        return s;
    }

    public static void main(String[] args) 
    {
        // Lista di Integer creata con Arrays.asList
        List<Integer> li = Arrays.asList(1, 2, 3);
        System.out.println("Lista di Integer: " + li + " -> sum = " + sumOfList(li));

        // Lista di Double
        List<Double> ld = Arrays.asList(1.5, 2.5, 3.8);
        System.out.println("Lista di Double:  " + ld + " -> sum = " + sumOfList(ld));
    }
}

/*
Usa il carattere jolly ? extends Number (covarianza) per creare un metodo che calcola la somma
di una lista di numeri. Grazie alla wildcard, lo stesso metodo sumOfList può accettare indifferentemente
una List<Integer>, una List<Double> o una List<Number>, create comodamente al volo con Arrays.asList(...).   
*/