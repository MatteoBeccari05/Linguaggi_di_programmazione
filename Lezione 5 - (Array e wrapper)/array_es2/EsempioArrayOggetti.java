public class EsempioArrayOggetti 
{
    public static void main(String[] args) 
    {
        Counter[] a;
        a = new Counter[4];

        // Creazione manuale
        a[0] = new Counter(); 
        a[1] = new Counter();
        a[2] = new Counter(); 
        a[3] = new Counter();

        // Metodo consigliato tramite ciclo for
        for(int i=0; i<4; i++)
        {
            a[i] = new Counter();
            a[i].reset();
            a[i].inc();
        }

        for(int i = 0; i<a.length; i++)
        {
            System.out.println(a[i].getValue());
        }
    }
    
}
