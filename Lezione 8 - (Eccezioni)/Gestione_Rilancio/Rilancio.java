public class Rilancio 
{
    // Si dichiara esplicitamente che il metodo può lanciare l'eccezione
    public static void main(String args[]) throws NumberFormatException 
    {
        int a = 0;
        String s = args[0];
        
        // Istruzione a rischio senza try/catch
        a = Integer.parseInt(s); 
        System.out.println("Valore di a: " + a);
    }
}

/* 
il codice è privo di protezioni interne. Affinché il programma compili correttamente, 
viene aggiunta la dicitura throws NumberFormatException all'intestazione del main. 
In questo modo, il metodo segnala ufficialmente all'esterno che potrebbe verificarsi 
un'anomalia di conversione numerica, demandando a chi lo ha chiamato (creando una "catena di responsabilità") l'onere di gestirla.
*/