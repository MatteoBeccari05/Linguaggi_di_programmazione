public class Fattura 
{
    private Dottore dottore;
    private Paziente paziente;

    public Fattura() 
    {
        dottore = new Dottore();
        paziente = new Paziente();
    }

    public Fattura(Dottore dottoreIniziale, Paziente pazienteIniziale) 
    {
        dottore = dottoreIniziale;
        paziente = pazienteIniziale;
    }

    public Dottore getDottore() 
    {
        return dottore;
    }

    public Paziente getPaziente() 
    {
        return paziente;
    }

    public boolean equals(Fattura altraFattura) 
    {
        return dottore.equals(altraFattura.dottore) && paziente.equals(altraFattura.paziente);
    }

    public double calcolaTotale() 
    {
        return dottore.getParcella();
    }
}
