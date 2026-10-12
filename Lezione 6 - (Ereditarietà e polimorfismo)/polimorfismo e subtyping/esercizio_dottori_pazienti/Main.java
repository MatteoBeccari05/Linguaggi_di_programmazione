public class Main 
{
    public static void main(String[] args) 
    {
        // Creazione di un paziente
        Paziente paziente1 = new Paziente("Mario Rossi", "PZ001");

        // Creazione di un dottore
        Dottore dottore1 = new Dottore("Dr. Anna Bianchi", "Cardiologo", 150.0);

        // Creazione di una fattura
        Fattura fattura1 = new Fattura(dottore1, paziente1);

        // Stampa delle informazioni della fattura
        System.out.println("Dottore: " + fattura1.getDottore().getNome());
        System.out.println("Paziente: " + fattura1.getPaziente().getNome());
        System.out.println("Numero Identificativo: " + fattura1.getPaziente().getNumeroIdentificativo());
        System.out.println("Totale: " + fattura1.calcolaTotale());


        Paziente paziente2 = new Paziente("Luca Verdi", "PZ002");
        Dottore dottore2 = new Dottore("Dr. Marco Neri", "Dermatologo", 200.0);
        Fattura fattura2 = new Fattura(dottore2, paziente2);

        // Stampa delle informazioni della seconda fattura
        System.out.println("\nDottore: " + fattura2.getDottore().getNome());
        System.out.println("Paziente: " + fattura2.getPaziente().getNome());
        System.out.println("Numero Identificativo: " + fattura2.getPaziente().getNumeroIdentificativo());
        System.out.println("Totale: " + fattura2.calcolaTotale());

        System.out.println("\nLe fatture sono uguali: " + fattura1.equals(fattura2));

        //dottori uguali
        Dottore dottore3 = new Dottore("Dr. Anna Bianchi", "Cardiologo", 150.0);
        System.out.println("I dottori sono uguali: " + dottore1.equals(dottore3));

        //pazienti uguali
        Paziente paziente3 = new Paziente("Mario Rossi", "PZ001");
        System.out.println("I pazienti sono uguali: " + paziente1.equals(paziente3));
    }
}
