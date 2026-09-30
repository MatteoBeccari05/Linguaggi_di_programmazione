public class EsempiArray 
{

    public static void main(String[] args)
    {
        int[] a;
        a = new int[50];

        a[5] = 18;
        System.out.println(a[5]);   //18
        
        int n = a[7];
        System.out.println(n);    //0

        // Utilizzo di length per ottenere la dimensione
        System.out.println(n = a.length); // n vale 50
    }
}