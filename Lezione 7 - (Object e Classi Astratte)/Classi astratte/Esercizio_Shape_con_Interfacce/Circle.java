public class Circle extends Shape 
{
    protected double r;

    public Circle(double r) 
    {
        this.r = r;
    }

    public double area() 
    {
        return Math.PI * r * r;
    }

    public double perimeter() 
    {
        return 2 * r * Math.PI;
    }

    public double getRadius() 
    { 
        return r;
    }
}