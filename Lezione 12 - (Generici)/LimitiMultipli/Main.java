public class Main 
{
    public static void main(String[] args) 
    {
        ElementoCompleto el = new ElementoCompleto();
        D<ElementoCompleto> contenitore = new D<>(el);
        
        contenitore.eseguiTutto();
    }
}