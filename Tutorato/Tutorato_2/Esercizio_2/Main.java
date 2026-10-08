public class Main 
{
    public static void main(String[] args)
    {
        Film catalogo[] = new Film[5];  
        Noleggio noleggi[] = new Noleggio[3];

        catalogo[0] = new Fantascienza("F001", "Interstellar");
        catalogo[1] = new Fantasy("F002", "Il Signore degli Anelli");
        catalogo[2] = new Azione("F003", "Mad Max: Fury Road");
        catalogo[3] = new Fantascienza("F004", "Matrix");
        catalogo[4] = new Fantasy("F005", "Harry Potter e la Pietra Filosofale");

        noleggi[0] = new Noleggio(catalogo[0], 2, "Mario Rossi");    
        noleggi[1] = new Noleggio(catalogo[1], 5, "Luca Bianchi");  
        noleggi[2] = new Noleggio(catalogo[2], 0, "Giulia Verdi");   

        float penale_totale = 0.0f;

        String separatore = "---------------------------------------------------------------------------------------";

        // Intestazione tabella
        System.out.println(separatore);
        System.out.printf("%-18s | %-10s | %-30s | %-8s | %-10s%n", 
                          "Cliente", "Cod. Film", "Titolo Film", "Giorni", "Penale");
        System.out.println(separatore);

        for(int i = 0; i < noleggi.length; i++)
        {
            System.out.println(noleggi[i].ToString());
            penale_totale += noleggi[i].CalcolaPenale();
        }

        // Piè di pagina con totale
        System.out.println(separatore);
        System.out.printf("%-75s | %-9.2f%n", "TOTALE PENALI", penale_totale);
        System.out.println(separatore);
    }
}