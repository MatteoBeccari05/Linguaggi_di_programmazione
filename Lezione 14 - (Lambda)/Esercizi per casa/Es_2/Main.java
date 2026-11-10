public class Main 
{
    public static void main(String[] args) 
    {
        int numeri[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Implementazione Lambda per la somma
        Calcola somma = array -> {
            int totale = 0;
            for (int i = 0; i < array.length; i++) 
            {
                totale += array[i];
            }
            return totale;
        };

        // Implementazione Lambda per il massimo
        Calcola massimo = array -> {
            int max = array[0];
            for (int i = 1; i < array.length; i++) 
            {
                if (array[i] > max) 
                {
                    max = array[i];
                }
            }
            return max;
        };

        // Implementazione Lambda per il minimo
        Calcola minimo = array -> {
            int min = array[0];
            for (int i = 1; i < array.length; i++) 
            {
                if (array[i] < min) 
                {
                    min = array[i];
                }
            }
            return min;
        };

        // Esecuzione e stampa a video dei risultati
        int tot = somma.calcola(numeri);
        int max = massimo.calcola(numeri);
        int min = minimo.calcola(numeri);

        System.out.println("Somma: " + tot);
        System.out.println("Massimo: " + max);
        System.out.println("Minimo: " + min);
    }
}