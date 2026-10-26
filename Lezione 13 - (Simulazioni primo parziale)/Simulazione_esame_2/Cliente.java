import java.util.LinkedList;
import java.util.List;

public class Cliente 
{
    int codice;
    String nome;
    List<Servizio> servizi;

    public Cliente(int codice, String nome)
    {
        this.codice = codice;
        this.nome = nome;
        servizi = new LinkedList<Servizio>();
    }

    public double totale()
    {
        double tot = 0;
        for(Servizio s : servizi)
        {
            Dipendente d = s.getDipendente();
            tot+=s.getOre()*d.getCosto();
        }
        return tot;
    }

    public void addServizio(Servizio s)
    {
        servizi.add(s);
    }

    @Override 
    public String toString()
    {
        return String.format("%4d %20s %6.2f", codice, nome, totale());
    }
}
