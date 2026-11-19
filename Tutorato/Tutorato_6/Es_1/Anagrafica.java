import java.util.ArrayList;
import java.util.List;

public class Anagrafica 
{
    private List<Individuo> individui;
    
    public Anagrafica() 
    {
        individui = new ArrayList<>();
    }

    public Anagrafica(List<Individuo> individui) 
    {
        this.individui = individui;
    }

    public double calcolaEtaMedia(String residenza) 
    {
        return individui.stream().filter(i -> i.getResidenza().equalsIgnoreCase(residenza)).mapToInt(Individuo::getEta).average().orElse(0.0);
    }

    public List<Individuo> getIndividuiResidenti(String residenza) 
    {
        return individui.stream().filter(i -> i.getResidenza().equalsIgnoreCase(residenza)).toList();
    }

    public long totaleResidenti() 
    {
        return individui.stream().count();
    }

    public long totaleResidenti(String residenza) 
    {
        return individui.stream().filter(i -> i.getResidenza().equalsIgnoreCase(residenza)).count();
    }
}
