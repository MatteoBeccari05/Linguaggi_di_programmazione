public class Studente extends Persona 
{
    protected int matr;
    public Studente(String nome, int età, int matricola) 
    {
        super(nome, età);
        matr=matricola;
    }
    
    public void print() 
    {
        super.print(); // stampa nome ed età
        System.out.println("Matr = " + matr);
    }
    
}
