public class Serpente extends Alieno
{
    private int danno = 10;
    public Serpente(String nome, int salute) 
    {
        super(nome, salute);
    }

    public int getDanno() 
    {
        return danno;
    }
}
