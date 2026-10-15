public class Main 
{
    public static void main(String[] args) 
    {
        double sconto1;
        double sconto2;
        ScontoQuantita sq = new ScontoQuantita(10, 12);
        sconto1 = sq.CalcolaSconto(12, 23.3);
        System.out.println("Lo sconto della politica della percentuale è di: " + sconto1);
        CompraNArticoliPrendiUnoGratis cnapug = new CompraNArticoliPrendiUnoGratis(3);
        sconto2 = cnapug.CalcolaSconto(3, 10);
        System.out.println("Lo sconto della politica Compra N Articoli e Prendi Uno Gratis è di: " + sconto2);
    }
}