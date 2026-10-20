import java.util.Arrays;

public class Main 
{
    // Accetta solo array di oggetti che implementano Comparable<T>
    public static <T extends Comparable<T>> int countGreaterThan(T[] anArray, T elem) 
    {
        int count = 0;
        for (T e : anArray) 
        {
            if (e.compareTo(elem) > 0) 
            {
                ++count;
            }
        }
        return count;
    }

    public static void main(String[] args) 
    {
        // Test con un array di Integer
        Integer[] numeri = {5, 12, 3, 20, 8, 15};
        int sogliaNum = 10;
        int quantiNumeri = countGreaterThan(numeri, sogliaNum);
        System.out.println("Array di interi: " + Arrays.toString(numeri));
        System.out.println("Elementi maggiori di " + sogliaNum + ": " + quantiNumeri);

        // Test con un array di String (ordine alfabetico)
        String[] parole = {"mela", "banana", "pera", "kiwi", "zuppa"};
        String sogliaParola = "mela";
        int quanteParole = countGreaterThan(parole, sogliaParola);
        System.out.println("\nArray di stringhe: " + Arrays.toString(parole));
        System.out.println("Parole alfabeticamente successive a '" + sogliaParola + "': " + quanteParole);
    }
}

/*
Conta quanti elementi di un array generico T[] sono strettamente maggiori di una soglia elem. 
Poiché l'operatore > in Java funziona solo sui tipi primitivi, il metodo vincola il tipo T a implementare
l'interfaccia Comparable<T> (<T Comparable<T extends>>), potendo così usare e.compareTo(elem) > 0 su qualsiasi
oggetto confrontabile (numeri, stringhe, ecc.).   
*/