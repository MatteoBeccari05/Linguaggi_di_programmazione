public class Paziente extends Persona 
{
    private String numeroIdentificativo;

    public Paziente() 
    {
        super();
        numeroIdentificativo = "Ancora nessun numero identificativo";
    }

    public Paziente(String nomeIniziale, String numeroIdentificativoIniziale) 
    {
        super(nomeIniziale);
        numeroIdentificativo = numeroIdentificativoIniziale;
    }

    public String getNumeroIdentificativo() 
    {
        return numeroIdentificativo;
    }

    public boolean equals(Paziente altroPaziente) 
    {
        return getNome().equalsIgnoreCase(altroPaziente.getNome()) && numeroIdentificativo.equalsIgnoreCase(altroPaziente.numeroIdentificativo);
    }
}
