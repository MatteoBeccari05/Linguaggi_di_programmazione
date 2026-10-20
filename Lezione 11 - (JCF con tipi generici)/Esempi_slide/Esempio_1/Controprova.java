import java.util.*;
public class Controprova 
{
    public static void main(String args[])
    {
        List<Integer> list = new LinkedList<Integer>();
        for (int i=0; i<12; i++) 
        {
            list.add(i*i); //boxing
        }

        list.add(3.1415); // non si compila!
        System.out.println(list);
    }
}