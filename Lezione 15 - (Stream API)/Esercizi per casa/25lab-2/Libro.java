public class Libro 
{
    private String titolo;
    private Autore autore;
    private int anno;

    public Libro(String titolo, Autore autore, int anno) 
    {
        super();
        this.titolo = titolo;
        this.autore = autore;
        this.anno = anno;
    }

    public String getTitolo() 
    {
        return titolo;
    }

    public Autore getAutore() 
    {
        return autore;
    }

    public int getAnno() 
    {
        return anno;
    }

    @Override
    public int hashCode() 
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + anno;
        result = prime * result + ((autore == null) ? 0 : autore.hashCode());
        result = prime * result + ((titolo == null) ? 0 : titolo.hashCode());
        return result;
    }

    public boolean equals(Object obj) 
    {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Libro other = (Libro) obj;
        if (anno != other.anno)
            return false;
        if (autore == null) {
            if (other.autore != null)
                return false;
        } else if (!autore.equals(other.autore))
            return false;
        if (titolo == null) {
            if (other.titolo != null)
                return false;
        } else if (!titolo.equals(other.titolo))
            return false;
        return true;
    }

    public String toString() 
    {
        return "Libro [titolo=" + titolo + ", autore=" + autore + ", anno=" + anno + "]";
    }
}