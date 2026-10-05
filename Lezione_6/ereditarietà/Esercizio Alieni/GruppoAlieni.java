public class GruppoAlieni 
{
    private Alieno[] alieni;
    
    public GruppoAlieni(int alieni) 
    {
        this.alieni = new Alieno[alieni];
    }

    public void AddAlieno(Alieno alieno, int indice) 
    {
        alieni[indice] = alieno;
    }

    public Alieno[] getAlieni() 
    {
        return alieni;
    }

    public int GetDannoTotale() 
    {
        int dannoTotale = 0;
        for(int i = 0; i < alieni.length; i++) 
        {
            if(alieni[i] != null) 
            {
                dannoTotale += alieni[i].getDanno();
            }
        }
        return dannoTotale;
    }
}
