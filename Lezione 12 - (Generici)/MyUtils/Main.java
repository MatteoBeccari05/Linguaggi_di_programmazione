import java.util.*;

public class Main 
{
    public static void main(String[] args) 
    {
        List<Integer> l1 = new ArrayList<Integer>();
        List<Number> l2 = new ArrayList<Number>();
        List<Object> l3 = new ArrayList<Object>();

        l1.add(10);
        l1.add(20);
        l1.add(30);

        // Copia da List<Integer> a List<Number>
        MyUtils.copy(l1, l2);
        System.out.println("Contenuto di l2 (List<Number>): " + l2);

        // Copia da List<Integer> direttamente a List<Object>
        MyUtils.copy(l1, l3);
        System.out.println("Contenuto di l3 (List<Object>): " + l3);
    }
}

/*
Implementa la copia di tutti gli elementi da una collezione sorgente src a una collezione
destinazione dest con la massima flessibilità possibile. Usa <? extends T> sulla sorgente 
(perché da src dobbiamo solo leggere elementi che siano almeno di tipo T) e <? super T> sulla destinazione 
(perché in dest dobbiamo scrivere elementi, quindi va bene qualsiasi collezione che accetti T o suoi supertipi).   
*/