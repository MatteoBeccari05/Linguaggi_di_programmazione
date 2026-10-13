public class Stack 
{
    private int count;
    private String[] items;

    // Costruttore: imposta il contatore a 0 e alloca l'array con capacità massima
    public Stack(int max) 
    {
        count = 0;
        items = new String[max];
    }

    // Restituisce true se lo stack è vuoto
    public boolean isEmpty() 
    {
        return (count == 0);
    }

    // Inserisce una stringa in cima alla pila
    public void push(String value) throws StackOverflowException 
    {
        try 
        {
            items[count] = value; // possibile ArrayIndexOutOfBoundsException se pieno
            count++;
        } 
        catch (ArrayIndexOutOfBoundsException ae) 
        {
            StackOverflowException oe = new StackOverflowException();
            throw oe;
        }
    }

    // Estrae e restituisce la stringa in cima alla pila
    public String pop() throws StackUnderflowException 
    {
        String value;
        try 
        {
            count--;              // se count == 0 diventa -1!
            value = items[count]; // possibile ArrayIndexOutOfBoundsException se indice < 0
            return value;
        } 
        catch (ArrayIndexOutOfBoundsException ae) 
        {
            count = 0; // azione correttiva per ripristinare lo stato dello stack
            StackUnderflowException ue = new StackUnderflowException();
            throw ue;
        }
    }
}