import java.util.List;
import java.util.stream.Collectors;

public class ContoDemo 
{
    public static List<Conto> selezionaContiSaldoMaggioreDi(List<Conto> conti, int saldo) 
    {
        return conti.stream().filter(c -> c.getSaldo() > saldo).collect(Collectors.toList());
    }
}