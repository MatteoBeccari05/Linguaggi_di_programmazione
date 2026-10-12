public class Main {

    public static void main(String[] args) 
    {
        Persona p = new Persona("Luca", 30);
        p.print();

        Studente s = new Studente("Mario", 20, 12345);
        s.print();

        p = s; // p diventa un riferimento a un oggetto Studente
        p.print(); // stampa nome ed età dello studente, ma non la matricola
    }
}
