public class Immutabilita 
{
    public static void main(String[] args) 
    {
        String s = "ciao a tutti";
        
        System.out.println("\n--- IMMUTABILITÀ E METODI DELLA CLASSE STRING ---");
        
        // replace() crea una nuova stringa, non modifica quella esistente
        String s_sostituita = s.replace('t', 'p');
        System.out.println("Risultato di replace('t', 'p'): " + s_sostituita);
        System.out.println("La stringa originale è rimasta immutata: " + s);

        // Altri metodi della classe String
        System.out.println("Lunghezza della stringa (length): " + s.length());
        
        // Ora la posizione 5 esiste ed è valida (corrisponde alla 'a' di "a tutti")
        System.out.println("Carattere in posizione 5 (charAt): " + s.charAt(5));
        
        System.out.println("Indice della prima 'a' (indexOf): " + s.indexOf('a'));
        
        // substring: va dall'indice di inizio (5) fino a (fine - 1), ovvero 11
        String sottostringa = s.substring(5, 12);
        System.out.println("Sottostringa da 5 a 11 (substring): '" + sottostringa + "'");

    }
}