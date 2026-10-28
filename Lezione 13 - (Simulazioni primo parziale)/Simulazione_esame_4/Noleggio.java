public class Noleggio 
{
    protected int codice_veicolo;
    protected int num_giorni;

    public Noleggio(int codice_veicolo, int num_giorni)
    {
        this.codice_veicolo = codice_veicolo;
        this.num_giorni = num_giorni;
    }

    @Override 
    public String toString()
    {
        return "(" + codice_veicolo + ", " + num_giorni + ")"; 
    }

    public int getGiorni()
    {
        return num_giorni;
    }

}
