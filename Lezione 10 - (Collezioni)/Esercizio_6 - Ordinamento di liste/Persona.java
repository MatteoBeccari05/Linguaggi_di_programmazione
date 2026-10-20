// 1. La classe Persona implementa l'interfaccia Comparable per definire l'ordinamento naturale
class Persona implements Comparable 
{
    private String nome, cognome;

    public Persona(String nome, String cognome) 
    {
        this.nome = nome; 
        this.cognome = cognome;
    }

    public String nome() { return nome; }
    public String cognome() { return cognome; }

    // Rappresentazione testuale dell'oggetto
    public String toString() 
    {
        return nome + " " + cognome;
    }

    // Definizione del criterio di ordinamento (compareTo)
    public int compareTo(Object x) 
    {
        Persona p = (Persona) x;
        // Confronto lessicografico fra i cognomi
        int confrontoCognomi = this.cognome.compareTo(p.cognome);
        
        // Se i cognomi sono uguali (confrontoCognomi == 0), confronta anche i nomi
        return (confrontoCognomi != 0 ? confrontoCognomi : this.nome.compareTo(p.nome));
    }
}