public class Main 
{
    public static void main(String[] args) 
    {
        String[] testValues = {"42", "999", "1000", "1500", "abc"};

        for (String val : testValues) 
        {
            try 
            {
                int result = Thousand.parseInt(val);
                System.out.println("Successo per \"" + val + "\": " + result);
            } 
            catch (NumberFormatException e) 
            {
                System.err.println("Eccezione per \"" + val + "\": " + e.getMessage());
            }
        }
    }
}
