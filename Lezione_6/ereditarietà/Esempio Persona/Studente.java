public class Studente extends Persona 
{
    private String corsoDiLaurea;

    // Costruttore senza parametri
    public Studente() 
    {
        super();
        corsoDiLaurea = "Nessun corso";
    }

    // Costruttore con tutti i parametri
    public Studente(String nome, int eta, String corsoDiLaurea) 
    {
        super(nome, eta);
        this.corsoDiLaurea = corsoDiLaurea;
    }

    // Getter
    public String getCorsoDiLaurea() 
    {
        return corsoDiLaurea;
    }

    // Setter
    public void setCorsoDiLaurea(String nuovoCorso) 
    {
        corsoDiLaurea = nuovoCorso;
    }


    //overriding del metodo presentati() della classe Persona
    @Override
    public void presentati() 
    {
        System.out.println("Ciao, sono " + getNome() + ", ho " + getEta() + " anni e studio " + corsoDiLaurea + ".");
    }
}

