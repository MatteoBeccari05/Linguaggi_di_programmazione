public class Main 
{
    public static void main(String args[]) 
    {
        Drawable[] drawables = new Drawable[3];
        drawables[0] = new DrawableCircle(2.5);
        drawables[1] = new DrawableRectangle(1.2, 3.0);
        drawables[2] = new DrawableText("Ciao");
        for (int i = 0; i < drawables.length; i++) 
        {
            drawables[i].setColor(i + 1);
            drawables[i].setPosition(i * 10.0 + 2, i * 20.0 + 2);
            drawables[i].draw();
        }
    }
}