import java.util.*;

public class Main 
{
    public static void main(String[] args) 
    {
        List<Individuo> individui = List.of(
            new Individuo(25, "Roma"),
            new Individuo(30, "Milano"),
            new Individuo(22, "Roma"),
            new Individuo(28, "Napoli"),
            new Individuo(35, "Milano"),
            new Individuo(40, "Roma"),
            new Individuo(27, "Napoli")
        );  

        Anagrafica anagrafe = new Anagrafica(individui);

        System.out.println("Totale residenti: " + anagrafe.totaleResidenti());
        System.out.println("-------------------------------");
        System.out.println("Totale residenti a Roma: " + anagrafe.totaleResidenti("Roma"));
        System.out.println("Totale residenti a Milano: " + anagrafe.totaleResidenti("Milano"));
        System.out.println("Totale residenti a Napoli: " + anagrafe.totaleResidenti("Napoli")); 
        System.out.println("-------------------------------");      
        System.out.println("Età media dei residenti a Roma: " + anagrafe.calcolaEtaMedia("Roma"));    
        System.out.println("Età media dei residenti a Milano: " + anagrafe.calcolaEtaMedia("Milano"));
        System.out.println("Età media dei residenti a Napoli: " + anagrafe.calcolaEtaMedia("Napoli"));
        System.out.println("-------------------------------");
        System.out.println("Residenti a Roma: " + anagrafe.getIndividuiResidenti("Roma"));
        System.out.println("Residenti a Milano: " + anagrafe.getIndividuiResidenti("Milano"));
        System.out.println("Residenti a Napoli: " + anagrafe.getIndividuiResidenti("Napoli"));
    }
}
