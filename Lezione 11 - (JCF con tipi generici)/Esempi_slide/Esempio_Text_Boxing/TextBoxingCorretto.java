import java.util.*;

class TestBoxingCorretto 
{
    public static void main(String args[]) 
    {
        List<Integer> l = new ArrayList<Integer>();
        l.add(33);
        l.add(12);
        int i = l.get(0); // Cast non più necessario
        System.out.println(l);
        System.out.println(i);
    }
}