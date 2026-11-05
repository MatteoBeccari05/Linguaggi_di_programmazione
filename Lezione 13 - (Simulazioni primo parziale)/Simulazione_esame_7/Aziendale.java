public class Aziendale extends Cliente
{
    private String ragione_sociale;
    private double portata_max;

    public Aziendale(int codice, String tipo_contratto, String indirizzo, String tipo, String ragione_sociale, double portata_max)
    {
        super(codice, tipo_contratto, indirizzo, tipo);
        this.ragione_sociale = ragione_sociale;
        this.portata_max = portata_max;
    }

    public String getNome()
    {
        return ragione_sociale;
    }

    @Override 
    public String toString()
    {
        return String.format("%10d %10s %20s %20s %20s %20s %20.2f", codice, tipo, "-", ragione_sociale, indirizzo, tipo_contratto, portata_max);
    }
}