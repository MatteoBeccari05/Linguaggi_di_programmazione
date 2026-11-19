import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) 
    {
        List<Abbonato> abbonati = new ArrayList<>();

        abbonati.add(new Abbonato("Pippo", "pippo@topolinia.com"));
        abbonati.add(new Abbonato("Pluto", "pluto@topolinia.com"));

        Piattaforma piattaforma = new Piattaforma(abbonati);
        piattaforma.aggiungiAnno();
        piattaforma.aggiungiAnno();
        piattaforma.aggiungiAnno();

        piattaforma.comunicaPremio("2 biglietti del cinema");

        piattaforma.addAbbonato("Paperino", "paperino@paperopoli.com");

        // Comando aggiunto per mostrare il problema dovto a rimuoviAbbonato senza removeIf
        // piattaforma.rimuoviAbbonato(new Abbonato("Paperino", "paperino@paperopoli.com"));

        piattaforma.comunicaMessaggio( new Abbonato("Paperino", "paperino@paperopoli.com"),"Benvenuto Paperino!");

        piattaforma.aggiungiAnno();

        System.out.println(piattaforma.numeroMedioAnniAbbonato());
    }
}
