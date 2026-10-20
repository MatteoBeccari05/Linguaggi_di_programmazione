import java.util.*;

public class Main {
    // Stampa qualsiasi Collection (di String, Integer, Double, ecc.)
    static void printCollection(Collection<?> c) 
    {
        for (Object e : c) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

    // Svuota e stampa qualsiasi MyStack
    public static void emptyAndPrintStack(MyStack<?> stack) 
    {
        while (!stack.isEmpty()) 
        {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) 
    {
        List<String> parole = Arrays.asList("Ciao", "Mondo", "Java");
        List<Integer> numeri = Arrays.asList(100, 200, 300);

        System.out.print("Stampa Collection<String>:  ");
        printCollection(parole);

        System.out.print("Stampa Collection<Integer>: ");
        printCollection(numeri);

        MyStack<String> stackStringhe = new MyStack<>();
        stackStringhe.push("Primo").push("Secondo").push("Terzo");

        System.out.print("Svuota MyStack<String>:     ");
        emptyAndPrintStack(stackStringhe);
    }
}


/*
Mostra come lavorare su collezioni o stack di tipo completamente sconosciuto usando <?> 
(che equivale a <? extends Object>). A differenza di Collection<Object> (che accetterebbe solo ed esclusivamente Collection<Object>),
 Collection<?> e MyStack<?> permettono di passare collezioni e stack di qualsiasi tipo, trattando gli elementi estratti semplicemente come Object.   
*/