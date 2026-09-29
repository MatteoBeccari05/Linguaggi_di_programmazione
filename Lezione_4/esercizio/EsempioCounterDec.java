public class EsempioCounterDec 
{
    public static void main(String[] args) 
    {
        CounterDec cd = new CounterDec();
        cd.reset();
        cd.inc();
        cd.inc();
        System.out.println("Valore dopo il doppio incremento: " + cd.getValue());

        cd.dec();
        System.out.println("Valore dopo il decremento: " + cd.getValue());
    }
}
