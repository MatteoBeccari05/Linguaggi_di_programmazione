public class Prenotazione 
{
    int codice_campo, ora_inizio;

    public Prenotazione(int codice, int ora)
    {
        codice_campo = codice;
        ora_inizio = ora;
    }

    public String toString()
    {
        return "(" + codice_campo + "," +  ora_inizio + ")";
    }
    
}
