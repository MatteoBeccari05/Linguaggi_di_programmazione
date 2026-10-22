import java.util.Objects;

public class Patologia 
{
    private String nome;
    private int gravita;

    public Patologia(String nome, int gravita) 
    {
        this.nome = nome;
        this.gravita = gravita;
    }

    public String getNome() 
    {
        return nome;
    }

    public int getGravita() 
    {
        return gravita;
    }

    public void aggrava() throws MoltoGraveException 
    {
        if (this.gravita >= 10) 
        {
            throw new MoltoGraveException("Impossibile aggravare: la patologia '" + nome + "' ha gia gravita massima (10).");
        }
        this.gravita++;
    }

    public void attenua() throws GuaritaException 
    {
        if (this.gravita <= 1) 
        {
            throw new GuaritaException("La patologia '" + nome + "' e guarita (gravita 1).");
        }
        this.gravita--;
    }

    @Override
    public boolean equals(Object o) 
    {
        if (this == o) 
        {
            return true;
        }
        else if (o == null || getClass() != o.getClass())
        {
            return false;
        }
             
        Patologia patologia = (Patologia) o;
        return Objects.equals(nome, patologia.nome);
    }

    @Override
    public String toString() 
    {
        return "Patologia{nome='" + nome + "', gravita=" + gravita + "}";
    }
}
