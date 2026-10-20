import java.util.*;

public class Esempio1
{
    public static void main(String args[]) 
    {
        List<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i < 12; i++)
            list.add(i * i); // boxing
        System.out.println(list);
    }
}