class A 
{
    public void metodoA() { System.out.println("Eseguito metodo della classe A"); }
}

interface B 
{
    void metodoB();
}

interface C 
{
    void metodoC();
}

// Classe concreta che estende A e implementa sia B che C
class ElementoCompleto extends A implements B, C 
{
    public void metodoB() { System.out.println("Eseguito metodo dell'interfaccia B"); }
    public void metodoC() { System.out.println("Eseguito metodo dell'interfaccia C"); }
}

// T deve essere sottotipo di A, B e C (la classe A va messa per prima!)
class D<T extends A & B & C> 
{
    private T item;

    public D(T item) { this.item = item; }

    public void eseguiTutto() 
    {
        item.metodoA();
        item.metodoB();
        item.metodoC();
    }
}