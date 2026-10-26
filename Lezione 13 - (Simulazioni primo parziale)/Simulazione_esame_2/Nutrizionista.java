public class Nutrizionista extends Dipendente 
{
    protected long telefono; 
    protected boolean medico;
    protected int appuntamenti_settimanali;

    public Nutrizionista(int codice, String nome, double costo_orario, long telefono, boolean medico, int appuntamenti_settimanali)
    {
        super(codice, nome, costo_orario);
        this.telefono = telefono;
        this.medico = medico;
        this.appuntamenti_settimanali = appuntamenti_settimanali;
    }

    @Override 
    public String toString()
    {
        return super.toString() + " " + String.format("%-15s %-6s %-20s %-12d %-8b %-6d %6.2f", "nutrizionista", "-", "-", telefono, medico, appuntamenti_settimanali, costo_orario);
    }
}