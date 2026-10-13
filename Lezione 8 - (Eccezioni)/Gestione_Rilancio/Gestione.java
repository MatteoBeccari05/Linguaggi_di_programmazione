public class Gestione 
{
    public static void main(String args[]) 
    {
        int a = 0;
        String s = args[0];
        
        try 
        {
            // Istruzione a rischio
            a = Integer.parseInt(s); 
            System.out.println("Valore di a: " + a);
        } 
        catch (Exception e) 
        {
            // Gestione dell'eccezione: azione correttiva
            a = 0; 
            System.out.println("Errore nella conversione della stringa in numero intero.");
        }
    }
}

/* 
il tentativo di convertire una stringa in un numero tramite Integer.parseInt(s) viene isolato e protetto nel blocco try. 
Se la conversione fallisce (ad esempio perché la stringa contiene delle lettere), l'errore non fa arrestare il programma, 
ma viene intercettato dal blocco catch che interviene in modo sicuro assegnando ad a il valore di default 0
*/