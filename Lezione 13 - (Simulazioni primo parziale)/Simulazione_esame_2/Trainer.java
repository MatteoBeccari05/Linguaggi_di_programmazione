public class Trainer extends Dipendente 
{
    protected int ore_settimanali;
    protected String specialità;

    public Trainer(int codice, String nome, double costo_orario, int ore_settimanali, String specialita)
    {
        super(codice, nome, costo_orario);
        this.ore_settimanali = ore_settimanali;
        this.specialità = specialita;
    }

    @Override 
    public String toString()
    {
        return super.toString() + " " + String.format("%-15s %-6d %-20s %-12s %-8s %-6s %6.2f", "trainer", ore_settimanali, specialità, "-", "-", "-", costo_orario);
    }
}
