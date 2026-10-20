public class Main {
    public static void main(String[] args) 
    {
        MyStack<Integer> src = new MyStack<Integer>();
        MyStack<Number> dest = new MyStack<Number>();

        // Inserimento con cascading
        src.push(10).push(29).push(34);

        System.out.println("Prima di moveFrom:");
        System.out.println("src (Integer): " + src);
        System.out.println("dest (Number): " + dest);

        // Sposta gli Integer dentro lo stack di Number (compila grazie a <E extends T>)
        dest.moveFrom(src);

        System.out.println("\nDopo moveFrom:");
        System.out.println("src (Integer): " + src);
        System.out.println("dest (Number): " + dest);

        // Estrazione LIFO dallo stack di destinazione
        System.out.println("\nEstrazione da dest (pop):");
        while (!dest.isEmpty()) {
            System.out.println(dest.pop());
        }
    }
}