public class CompraNArticoliPrendiUnoGratis implements PoliticaSconto
{
    private int n;
    public CompraNArticoliPrendiUnoGratis(int n)
    {
        this.n = n;
    }

    public double CalcolaSconto(int numeroArticoli, double prezzoArticolo)
    {
        /* 
         * Usando la divisione intera (/) tra interi, otteniamo esattamente 
         * il numero di gruppi di 'n' articoli.
         * Ad esempio, se n = 3: 
         * 1 / 3 = 0 (0 articoli gratis)
         * 3 / 3 = 1 (1 articolo gratis)
         * 5 / 3 = 1 (1 articolo gratis)
         * 6 / 3 = 2 (2 articoli gratis)
         */
        int articoliGratuiti = numeroArticoli / n;
        
        // Lo sconto totale equivale al numero di articoli omaggio moltiplicato per il prezzo
        return articoliGratuiti * prezzoArticolo;
    }
}
