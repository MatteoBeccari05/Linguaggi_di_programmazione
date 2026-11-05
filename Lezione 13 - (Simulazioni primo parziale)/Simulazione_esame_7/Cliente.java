import java.util.LinkedList;
import java.util.List;

public class Cliente
{
    protected int codice;
    protected String tipo_contratto;
    protected String indirizzo;
    protected String tipo;
    List<Lettura> letture;

    public Cliente(int codice, String tipo_contratto, String indirizzo, String tipo)
    {
        this.codice = codice;
        this.tipo_contratto = tipo_contratto;
        this.indirizzo = indirizzo;
        this.tipo = tipo;
        letture = new LinkedList<>();
    }

    public double getTotale()
    {
        double tot = 0;
        for(Lettura l : letture)
        {
            if(tipo_contratto.equals("mercato libero"))
            {
                tot += l.getMQ() * 1.2;
            }
            else
            {
                tot += l.getMQ() * 1.15;
            }
        }
        return tot;
    }

    public String getTipo()
    {
        return tipo;
    }

    public void addLettura(Lettura l)
    {
        letture.add(l);
    }

    public String getNome()
    {
        return "-";
    }
}