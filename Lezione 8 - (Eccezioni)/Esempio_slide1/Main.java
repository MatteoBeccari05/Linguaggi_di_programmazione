public class Main 
{
    public static void main(String args[]) 
    {
        int a = 0;
        String s = args[0];
        a = Integer.parseInt(s);
    }
}

// Se la stringa passata non contiene un numero ci troviamo di fronte ad una situazione critica.
// Il programma termina con un errore!