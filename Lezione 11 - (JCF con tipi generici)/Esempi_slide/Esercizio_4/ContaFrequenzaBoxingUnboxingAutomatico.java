import java.util.*;

public class ContaFrequenzaBoxingUnboxingAutomatico 
{
    public static void main(String args[]) 
    {
        Map<String,Integer> m = new HashMap<String,Integer>();
        for (int i=0; i<args.length; i++) 
        {
            Integer freq = m.get(args[i]);
            m.put(args[i], (freq==null ? 1 : freq+ 1));
        }
        System.out.println(m.size() + " parole distinte:");
        System.out.println(m);
    }
}


