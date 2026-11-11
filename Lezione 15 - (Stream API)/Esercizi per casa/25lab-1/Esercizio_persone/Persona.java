import java.util.List;

public class Persona 
{
    private String nome, cognome;
    private int eta;
    private List<String> passioni;

    public Persona(String nome, String cognome, int eta, List<String> passioni)
    {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.passioni = passioni;
    }

    public String getNome()
    {
        return nome;
    }
    
    public String getCognome()
    {
        return cognome;
    }
    
    public int getEta()
    {
        return eta;
    }
    
    public List<String> getPassioni()
    {
        return passioni;
    }
    
    public String toString()
    {
        return nome + " " + cognome;
    }
}