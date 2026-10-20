import java.util.*;

class TestBoxing 
{
    public static void main(String args[]) 
    {
        List l = new ArrayList(); // Usa JCF classica
        l.add(33);
        l.add(12);
        int i = (Integer) l.get(0); // Ha bisogno del cast
        System.out.println(l);
        System.out.println(i);
    }
}