class Persona 
{
    private String nome, citta;
    private int eta;
    private Genere genere;

    public Persona(String nome, int eta, Genere genere, String citta) 
    {
        this.nome = nome;
        this.eta = eta;
        this.genere = genere;
        this.citta = citta;
    }

    public String getNome() 
    {
        return nome;
    }

    public int getEta() 
    {
        return eta;
    }

    public Genere getGenere() 
    {
        return genere;
    }

    public String getCitta() 
    {
        return citta;
    }

    public String toString() 
    {
        return nome + " (" + eta + " anni) " + genere + " - " + citta;
    }
}