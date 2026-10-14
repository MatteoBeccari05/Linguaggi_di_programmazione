public class InventoryItem 
{
    private String name;
    private int units;
    private float price;

    public InventoryItem(String nm, int num, float pr) 
    {
        name = nm;
        units = num;
        price = pr;
    }

    @Override
    public String toString() 
    {
        return String.format("%-12s | Q.tà: %4d | Prezzo: %6.2f", name, units, price);
    }
}