import java.util.*;

public class FindDupsModerno 
{
    public static void main(String[] args) 
    {
        // Se non vengono passati argomenti da riga di comando, usiamo quelli dell'esempio
        if (args.length == 0) 
        {
            args = new String[]{"Io", "sono", "Io", "esisto", "Io", "parlo"};
        }

        // Uso dei Generics <String> per garantire il controllo dei tipi in compilazione
        Set<String> s = new HashSet<String>();

        // Uso del nuovo costrutto for (for-each) applicato all'array args
        for (String parola : args) 
        {
            if (!s.add(parola)) 
            {
                System.out.println("Parola duplicata: " + parola);
            }
        }

        System.out.println(s.size() + " parole distinte: " + s);
    }
}