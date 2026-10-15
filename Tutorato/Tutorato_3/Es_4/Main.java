public class Main 
{
    public static void main(String[] args) 
    {
        try 
        {
            Converter c = new Converter(args);
        } 
        catch (IllegalArgumentException e)  //numero fuori dall'intervallo
        {
            System.out.println("IllegalArgumentException intercettata: " + e.getMessage());
        } 
        catch (ArrayIndexOutOfBoundsException e) //numero argomenti errato
        {
            System.out.println("ArrayIndexOutOfBoundsException intercettata: " + e.getMessage());
        } 
        catch (Exception e) //eccezione generica
        {
            System.out.println("Eccezione generica intercettata: " + e.getMessage());
        }
    }
}
