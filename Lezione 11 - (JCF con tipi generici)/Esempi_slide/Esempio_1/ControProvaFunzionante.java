import java.util.*;

public class ControProvaFunzionante 
{
    public static void main(String args[]) 
    {
        List<Number> list = new LinkedList<Number>();
        for (int i = 0; i < 12; i++)
            list.add(i * i);
        // OK: Integer extends Number
        list.add(3.1415); // OK: Double extends Number
        System.out.println(list);
    }
}