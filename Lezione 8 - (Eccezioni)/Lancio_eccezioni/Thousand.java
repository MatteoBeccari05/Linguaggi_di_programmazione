public class Thousand 
{
    public static int parseInt(String s) throws NumberFormatException
    {
        int a = Integer.parseInt(s);
        if (a >= 1000)
        {
            NumberFormatException e = new NumberFormatException();
            throw e;
        }
        return a;
    }
}