public class Main 
{
    public static void main(String[] args) 
    {
        // Invocazione con tipo esplicito:
        Pair<Integer, String> p1 = new OrderedPair<>(1, "apple");
        Pair<Integer, String> p2 = new OrderedPair<>(2, "pear");
        boolean same = Util.<Integer, String>compare(p1, p2);

        // Invocazione con inferenza di tipo (più comune):
        boolean sameInferred = Util.compare(p1, p2);

        // Stampa a video delle coppie e del risultato del confronto:
        System.out.println("p1 -> Key: " + p1.getKey() + ", Value: " + p1.getValue());
        System.out.println("p2 -> Key: " + p2.getKey() + ", Value: " + p2.getValue());
        System.out.println("Sono uguali (tipo esplicito)? " + same);
        System.out.println("Sono uguali (inferenza di tipo)? " + sameInferred);

        // Esempio aggiuntivo con due coppie uguali (restituisce true):
        Pair<Integer, String> p3 = new OrderedPair<>(1, "apple");
        System.out.println("p1 e p3 sono uguali? " + Util.compare(p1, p3));
    }
}