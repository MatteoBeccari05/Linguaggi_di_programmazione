public class Abbonato 
{
    private String nome;
    private String email;
    private int annoAbbonamento;

    public Abbonato(String nome, String email) 
    {
        this.nome = nome;
        this.email = email;
        this.annoAbbonamento = 0;
    }

    public String getNome() 
    {
        return nome;
    }

    public String getEmail() 
    {
        return email;
    }

    public int getAnnoAbbonamento() 
    {
        return annoAbbonamento;
    }

    public void aggiungiAnnoAbbonamento() 
    {
        annoAbbonamento++;
    }

    public void riceviEmail(String messaggio) 
    {
        System.out.println(messaggio);
    }

    public boolean equals(Abbonato a) 
    {
        return this.nome.equalsIgnoreCase(a.getNome()) && this.email.equalsIgnoreCase(a.getEmail());
    }

}