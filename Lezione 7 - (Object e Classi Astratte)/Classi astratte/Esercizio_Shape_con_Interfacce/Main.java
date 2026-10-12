public class Main 
{
    public static void main(String args[]) 
    {
        Drawable[] drawables = new Drawable[3];
        drawables[0] = new DrawableCircle(2.5);
        drawables[1] = new DrawableRectangle(1.2, 3.0);
        drawables[2] = new DrawableRectangle(5.5, 3.8);
        for (int i = 0; i < drawables.length; i++) 
        {
            drawables[i].setColor(i);
            drawables[i].setPosition(i * 10.0, i * 20.0);
            drawables[i].draw();
        }
    }

}
