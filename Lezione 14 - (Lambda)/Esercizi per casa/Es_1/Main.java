import java.util.*;

public class Main 
{
    public static void main(String[] args)
    {
        List<Node> list = Arrays.asList(new Node("c"), new Node("b"), new Node("d"), new Node("a"));

        // Ordinamento con espressione Lambda
        Collections.sort(list, (a, b) -> a.name().compareTo(b.name()));
        System.out.println("Ordinamento tramite Lambda: " + list);

        // Ordinamento equivalente mediante Method Reference
        list.sort(Comparator.comparing(Node::name));
        System.out.println("Ordinamento tramite Method Reference: " + list);
    }
}