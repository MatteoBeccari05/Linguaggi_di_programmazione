import java.util.*;

public class ContaFrequenza 
{
    public static void main(String args[]) 
    {
        Map<String, Integer> m = new HashMap<String, Integer>();
        for (int i = 0; i < args.length; i++) 
        {
            Integer freq = m.get(args[i]);
            m.put(args[i], (freq == null ? new Integer(1) : new Integer(freq.intValue() + 1)));
        }
        System.out.println(m.size() + " parole distinte:");
        System.out.println(m);
    }
}