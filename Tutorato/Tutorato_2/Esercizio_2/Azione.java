public class Azione extends Film
{
    public Azione(String codice, String titolo)
    {
        super(codice, titolo, 3.0f);
    }

    public float CalcolaPenale(int ritardo)
    {
        if (ritardo <= 0)
        {
            return 0.0f;
        }
        else if (ritardo <= 3)
        {
            return penale_giornaliera * ritardo;
        }
        else
        {
            // Primi 3 giorni standard + 4 € per ciascun giorno dal 4° in poi
            int giorniExtra = ritardo - 3;
            return (penale_giornaliera * 3) + (4.0f * giorniExtra);
        }
    }

    public String getCodice()
    {
        return codice;
    }

    public String getTitolo()
    {
        return titolo;
    }
}
