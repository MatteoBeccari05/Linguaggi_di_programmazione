public class Alieno 
{
    protected String nome;
    protected int salute;
    
    public Alieno(String nome, int salute) 
    {
        this.nome = nome;
        this.salute = salute;
    }

    public String getNome() 
    {
        return nome;
    }

    public int getSalute() 
    {
        return salute;
    }       

    public void setSalute(int salute) 
    {
        this.salute = salute;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public int getDanno()
    {
        return 0;
    }
}
