public class Ricerca extends Progetto 
{
    protected String codice_argomento;
    protected int numero_partner;

    public Ricerca(int codice, String titolo, String nome_cognome, String organizzatore, double importo, String codice_argomento, int numero_partner)
    {
        super(codice, titolo, nome_cognome, organizzatore, importo);
        this.codice_argomento = codice_argomento;
        this.numero_partner = numero_partner;
    }

    @Override 
    public String toString()
    {
        return "ricerca" + super.toString() + String.format("%-15s %-10d %-10s %-10.2f", codice_argomento, numero_partner, "-", getImporto());
    }
}
