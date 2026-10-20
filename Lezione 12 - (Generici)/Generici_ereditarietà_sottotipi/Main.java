public class Main 
{
    // Questo metodo accetta SOLO Box<Number>
    public static void boxTest(Box<Number> n) 
    {
        System.out.println("Contenuto del Box<Number>: " + n.get() + 
                           " (Tipo effettivo: " + n.get().getClass().getSimpleName() + ")");
    }

    public static void main(String[] args) 
    {
        Box<Number> box = new Box<Number>();

        // 1. Compatibilità tra elementi: Integer e Double sono sottotipi di Number
        box.set(Integer.valueOf(10)); // OK
        boxTest(box);

        box.set(Double.valueOf(10.1)); // OK
        boxTest(box);

        // 2. Incompatibilità tra contenitori:
        Box<Integer> boxDiInteri = new Box<Integer>();
        boxDiInteri.set(99);
        
        // boxTest(boxDiInteri); // ERRORE DI COMPILAZIONE! Box<Integer> non è un Box<Number>
    }
}

/*
Chiama in causa la differenza tra compatibilità degli elementi e compatibilità dei contenitori. 
Dentro un Box<Number> possiamo inserire sia un Integer sia un Double (perché sono sottotipi di Number). 
Tuttavia, a un metodo che accetta Box<Number> non possiamo passare un Box<Integer>, perché Box<Integer> non è sottotipo di Box<Number>.   
*/