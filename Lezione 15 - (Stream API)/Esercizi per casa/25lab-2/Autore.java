import java.util.Objects;

public class Autore 
{
    private String nome;
    private String genere;

    public Autore(String nome, String genere) 
    {
        this.nome = nome;
        this.genere = genere;
    }

    public String getNome() 
    {
        return nome;
    }

    public String getGenere() 
    {
        return genere;
    }

    public String toString() 
    {
        return "Autore [nome=" + nome + ", genere=" + genere + "]";
    }

    public int hashCode() 
    {
        return Objects.hash(genere, nome);
    }

    public boolean equals(Object autore) 
    {
        if (this == autore)
            return true;
        if (autore == null)
            return false;
        if (getClass() != autore.getClass())
            return false;
        Autore autoreA = (Autore) autore;
        return autoreA.nome.equals(nome) && autoreA.genere.equals(genere);
    }
}