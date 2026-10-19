import java.util.*;

public class FindDups 
{
    public static void main(String args[]) 
    {
        // Scelta dell'implementazione: HashSet (insieme non ordinato, tempo costante)
        Set s = new HashSet(); 

        for (int i = 0; i < args.length; i++) 
        {
            // s.add() restituisce false se l'elemento è già presente nel Set
            if (!s.add(args[i])) 
            {
                System.out.println("Parola duplicata: " + args[i]);
            }
        }

        // Stampa il numero di elementi unici (size) e il contenuto dell'insieme (toString)
        System.out.println(s.size() + " parole distinte: " + s);
    }
}