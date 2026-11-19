public class Individuo 
{
    private int eta;
    private String residenza;

    public Individuo(int eta, String residenza) 
    {
        this.eta = eta;
        this.residenza = residenza;
    }

    public int getEta() 
    {
        return eta;
    }

    public String getResidenza() 
    {
        return residenza;
    }

    public void setEta(int eta) 
    {
        this.eta = eta;
    }

    public void setResidenza(String residenza) 
    {
        this.residenza = residenza;
    }

    @Override 
    public String toString() 
    {
        return "Individuo {" + "eta=" + eta + ", residenza='" + residenza + '\'' + '}';
    }
}