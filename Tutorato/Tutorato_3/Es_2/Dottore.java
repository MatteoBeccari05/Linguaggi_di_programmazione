public class Dottore extends Persona 
{
    private String specializzazione;
    private double parcella;

    public Dottore() 
    {
        super();
        specializzazione = "Ancora nessuna specializzazione";
        parcella = 0.0;
    }

    public Dottore(String nomeIniziale, String specializzazioneIniziale, double parcellaIniziale) 
    {
        super(nomeIniziale);
        specializzazione = specializzazioneIniziale;
        parcella = parcellaIniziale;
    }
    
    public String getSpecializzazione() 
    {
        return specializzazione;
    }

    public double getParcella() 
    {
        return parcella;
    }

    public boolean equals(Dottore altroDottore) 
    {
        return getNome().equalsIgnoreCase(altroDottore.getNome()) && specializzazione.equalsIgnoreCase(altroDottore.specializzazione) && parcella == altroDottore.parcella;
    }
}
