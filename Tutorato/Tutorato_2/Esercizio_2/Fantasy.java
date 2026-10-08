public class Fantasy extends Film
{
    public Fantasy(String codice, String titolo)
    {
        super(codice, titolo, 2.0f);
    }

    public float CalcolaPenale(int ritardo)
    {
        if(ritardo == 1)
        {
            return 1.0f;
        }
        else if(ritardo > 1)
        {
            return penale_giornaliera * ritardo;
        }
        else
        {
            return 0.0f;
        }
    }
}