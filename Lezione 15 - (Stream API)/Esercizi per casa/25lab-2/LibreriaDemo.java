import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LibreriaDemo 
{
    public static void main(String arg[]) 
    {
        Autore king = new Autore("King", "horror");
        Autore kinsella = new Autore("Kinsella", "romantico");
        Autore dicker = new Autore("Dicker", "thriller");
        
        List<Libro> libri = new ArrayList<Libro>();
        libri.add(new Libro("It", king, 1986));
        libri.add(new Libro("La scomparsa di Stephanie Mailer", dicker, 2018));
        libri.add(new Libro("Il caso Alaska Sanders", dicker, 2022));
        libri.add(new Libro("Sorprendimi!", kinsella, 2018));
        libri.add(new Libro("L'ultima missione di Gwendy", king, 2022));
        libri.add(new Libro("The Outsider", king, 2018));
        libri.add(new Libro("Holly", king, 2023));

        /*
        1. Trovare ed inserire in una lista tutti i libri usciti nell'anno 2023
        presenti nella lista libri
        */
        List<Libro> uno = libri.stream()
                .filter(libro -> libro.getAnno() == 2023)
                .collect(Collectors.toList());
        System.out.println(uno);

        /*
        2. Trovare ed inserire in una lista tutti i generi presenti nella
        lista libri (i valori unici)
        */
        List<String> due = libri.stream()
                .map(libro -> libro.getAutore().getGenere())
                .distinct()
                .collect(Collectors.toList());
        System.out.println(due);

        /*
        3. Trovare ed inserire in ordine alfabetico in una lista gli autori
        presenti nella lista libri (valori unici)
        */
        List<String> tre = libri.stream()
                .map(libro -> libro.getAutore().getNome())
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(tre);

        /*
        4. Verificare se la lista libri contiene l'autore Volo
        */
        boolean quattro = libri.stream()
                .anyMatch(libro -> libro.getAutore().getNome().equals("Volo"));
        System.out.println(quattro);

        /*
        5. Trovare e stampare a video tutti i libri di genere thriller
        presenti nella lista libri in ordine alfabeto
        */
        libri.stream()
                .filter(libro -> libro.getAutore().getGenere().equals("thriller"))
                .map(libro -> libro.getTitolo())
                .sorted()
                .forEach(genere -> System.out.println(genere));
    }
}