import java.util.ArrayList;

public class Paziente 
{
    private String cognome;
    private ArrayList<Patologia> patologie;

    public Paziente(String cognome) 
    {
        this.cognome = cognome;
        this.patologie = new ArrayList<>();
    }

    public String getCognome() 
    {
        return cognome;
    }

    public void aggiungiPatologia(Patologia p) 
    {
        if (!patologie.contains(p)) 
        {
            patologie.add(p);
        }
    }

    public boolean rimuoviPatologia(Patologia p) 
    {
        if (patologie.contains(p)) 
        {
            patologie.remove(p);
            return true;
        }
        return false;
    }

    @Override
    public String toString() 
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Paziente: ").append(cognome).append("\nPatologie:");
        if (patologie.isEmpty()) 
        {
            sb.append("\n  - Nessuna patologia presente.");
        } 
        else 
        {
            for (Patologia p : patologie) 
            {
                sb.append("\n  - ").append(p.toString());
            }
        }
        return sb.toString();
    }
}
