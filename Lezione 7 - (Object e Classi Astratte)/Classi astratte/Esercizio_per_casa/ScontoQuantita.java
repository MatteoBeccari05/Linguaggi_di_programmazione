public class ScontoQuantita implements PoliticaSconto 
{
    private double minimo;
    private double percentuale;

    public ScontoQuantita(double minimo, double percentuale)
    {
        this.minimo = minimo;
        this.percentuale = percentuale;
    }

    public double CalcolaSconto(int numeroArticoli, double prezzoArticolo)
    {
        if (numeroArticoli > minimo) 
        {
            double totale = numeroArticoli * prezzoArticolo;
            return totale * (percentuale / 100.0); 
        }
        return 0.0;
    }
}
