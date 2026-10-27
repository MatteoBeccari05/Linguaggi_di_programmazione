public class Innovazione extends Progetto 
{
    protected int numero_aziende;

    public Innovazione(int codice, String titolo, String nome_cognome, String organizzatore, double importo, int numero_aziende)
    {
        super(codice, titolo, nome_cognome, organizzatore, importo);
        this.numero_aziende = numero_aziende;
    }

    @Override 
    public String toString()
    {
        return "innovazione" + super.toString() + String.format("%-15s %-10s %-10d %-10.2f", "-", "-", numero_aziende, getImporto());
    }
    
}
