import java.util.Arrays;

//si scriva uno stream che stampa a video l’insieme delle stringhe diverse.

public class StampaStringhe 
{
    public static void main(String args[]) 
    {
        String array[] = {"Mela", "Pera", "Arancia", "Fragola", "Kiwi", "Arancia"};
        Arrays.stream(array).distinct().forEach(s->
        System.out.println(s));
    }
}