public class FrequenzaCarattere 
{
    public static void main(String[] args) 
    {
        if (args.length == 0)
        {
            System.out.println("Nessun argomento inserito.");
        } 
        else if (args.length == 1 && args[0].length() == 10)
        {
            String numero_telefono = args[0];
            int[] conteggio = new int[10]; 

            for(int i = 0; i < 10; i++)
            {
                char carattere = numero_telefono.charAt(i);
                

                if (carattere >= '0' && carattere <= '9') 
                {
                    // Sottraendo il carattere '0' si ottiene l'intero corrispondente (es. '7' - '0' = 7)
                    int cifra = carattere - '0';
                    conteggio[cifra]++;
                }
            }  
            
            System.out.println("Frequenza delle cifre nel numero " + numero_telefono + ":");
            for (int i = 0; i < 10; i++) 
            {
                if (conteggio[i] > 0) 
                {
                    System.out.println("La cifra " + i + " appare " + conteggio[i] + " volte");
                }
            }
        }  
        else
        {
            System.out.println("Errore: Inserire esattamente un numero di telefono composto da 10 cifre.");
        }
    }
}