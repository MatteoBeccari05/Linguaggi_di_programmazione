public class Main 
{
    public static void main(String[] args) 
    {
        // 1. Creare 2 patologie: Asma (gravità 10) e Allergia alle graminacee (gravità 2)
        Patologia asma = new Patologia("Asma", 10);
        Patologia allergia = new Patologia("Allergia alle graminacee", 2);

        // 2. Creare il paziente Rossi
        Paziente rossi = new Paziente("Rossi");

        // 3. Aggiungere le patologie e stampare la situazione
        rossi.aggiungiPatologia(asma);
        rossi.aggiungiPatologia(allergia);

        System.out.println("=== SITUAZIONE INIZIALE ===");
        System.out.println(rossi);
        System.out.println();

        // 4. Aggravare l'asma e gestire MoltoGraveException
        System.out.println("=== TENTATIVO DI AGGRAVARE L'ASMA ===");
        try 
        {
            asma.aggrava();
        } 
        catch (MoltoGraveException e) 
        {
            System.out.println("Eccezione catturata: " + e.getMessage());
        }
        System.out.println();

        // 5. Attenuare l'allergia fino alla guarigione e gestire GuaritaException
        System.out.println("=== ATTENUAZIONE ALLERGIA ===");
        while (true) 
        {
            try 
            {
                allergia.attenua();
                System.out.println("Allergia attenuata. Nuova gravita: " + allergia.getGravita());
            } 
            catch (GuaritaException e) 
            {
                System.out.println("Eccezione catturata: " + e.getMessage());
                rossi.rimuoviPatologia(allergia);
                System.out.println("Patologia rimossa con successo dal paziente.");
                break;
            }
        }
        System.out.println();

        // 6. Stampare la situazione aggiornata
        System.out.println("=== SITUAZIONE FINALE ===");
        System.out.println(rossi);
    }
}