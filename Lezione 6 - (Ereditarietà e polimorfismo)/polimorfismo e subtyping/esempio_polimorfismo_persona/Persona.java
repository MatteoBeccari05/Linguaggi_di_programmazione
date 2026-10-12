public class Persona 
{
    protected String nome;
    protected int anni;

    public Persona(String n, int a) 
    {
        nome = n;
        anni = a;
    }

    public void print() 
    {
        System.out.print("Mi chiamo " + nome);
        System.out.println(" e ho " + anni + " anni");
    }
}