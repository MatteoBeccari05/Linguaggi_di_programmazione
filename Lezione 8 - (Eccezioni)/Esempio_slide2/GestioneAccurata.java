public class GestioneAccurata 
{
    public static void main(String[] args) 
    {
        int a = 0;
        String s = null;
        
        // Simuliamo l'assenza di un parametro o un parametro errato
        if(args.length > 0) 
        {
            s = args[0];
        }

        try 
        {
            // Operazione critica: s potrebbe essere null o non essere un numero
            a = Integer.parseInt(s);
            System.out.println("Conversione riuscita!");
            
        } 
        catch (NumberFormatException e) 
        {
            // ERRORE PREVISTO 1: Formato errato (es. s = "xyz")
            System.out.println("Attenzione: la stringa non è un numero. Assegno valore di default (0).");
            a = 0;
            
        } 
        catch (NullPointerException e) 
        {
            // ERRORE PREVISTO 2: Nessuna stringa fornita (s = null)
            System.out.println("Attenzione: stringa mancante. Assegno valore di default (0).");
            a = 0;
            
        } 
        catch (Exception e) 
        {
            // ERRORE IMPREVISTO: Qualsiasi altra anomalia
            System.out.println("Errore generico inaspettato: " + e.getMessage());
            System.exit(1); 
            
        }
        System.out.println("Operazione terminata. Il valore finale di 'a' è: " + a);
    }
}

/*
In questo esempio espanso, abbiamo tre livelli: gestiamo in modo sicuro e silenzioso l'errore 
di conversione (come nel tuo codice), aggiungiamo un controllo specifico se la stringa è vuota 
(NullPointerException), e manteniamo la chiusura d'emergenza se succede qualcosa di totalmente imprevisto
*/