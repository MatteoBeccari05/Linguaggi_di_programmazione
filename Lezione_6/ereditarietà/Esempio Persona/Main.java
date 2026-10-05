public class Main 
{
    public static void main(String[] args) 
    {
        // Creo una Persona
        Persona p1 = new Persona("Marco", 40);

        System.out.println("PERSONA");
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Età: " + p1.getEta());
        p1.presentati();


        // Creo uno Studente
        Studente s1 = new Studente("Matteo", 20, "Informatica");

        System.out.println("\nSTUDENTE");
        System.out.println("Nome: " + s1.getNome());
        System.out.println("Età: " + s1.getEta());
        System.out.println("Corso: " + s1.getCorsoDiLaurea());
        s1.presentati();


        // Modifico alcuni dati
        s1.setEta(21);
        s1.setCorsoDiLaurea("Ingegneria Informatica");

        System.out.println("\nDATI MODIFICATI");
        System.out.println("Nome: " + s1.getNome());
        System.out.println("Età: " + s1.getEta());
        System.out.println("Corso: " + s1.getCorsoDiLaurea());
        s1.presentati();
    }
}