public class Fantascienza extends Film 
{
    public Fantascienza(String codice, String titolo)
    {
        super(codice, titolo, 2.5f);
    }

    public float CalcolaPenale(int ritardo)
    {
        if(ritardo >= 1)
        {
            return penale_giornaliera * ritardo;
        }
        else
        {
            return 0.0f;
        }
    }
}
