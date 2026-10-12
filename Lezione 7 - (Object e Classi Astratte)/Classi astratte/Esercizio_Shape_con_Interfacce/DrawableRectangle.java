public class DrawableRectangle extends Rectangle implements Drawable 
{
    protected int c;
    protected double x, y;

    public DrawableRectangle(double w, double h) 
    {
        super(w, h);
    }

    public void setColor(int c) 
    {
        this.c = c;
    }

    public void setPosition(double x, double y) 
    {
        this.x = x;
        this.y = y;
    }

    public void draw() 
    {
        System.out.println("Rettangolo, posizione: (" + x + " " + y + ") colore: " + c);
    }
}