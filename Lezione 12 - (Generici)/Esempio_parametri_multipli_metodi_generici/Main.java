public class Main 
{
    public static void main(String[] args) 
    {
        // Istanziazione esplicita:
        Pair<String, Integer> p1 = new OrderedPair<String, Integer>("Even", 8);
        Pair<String, String> p2 = new OrderedPair<String, String>("hello", "world");

        // Istanziazione con notazione a diamante:
        OrderedPair<String, Integer> p1Diamond = new OrderedPair<>("Even", 8);
        OrderedPair<String, String> p2Diamond = new OrderedPair<>("hello", "world");

        // Stampa a video tramite getKey() e getValue():
        System.out.println("p1 -> Key: " + p1.getKey() + ", Value: " + p1.getValue());
        System.out.println("p2 -> Key: " + p2.getKey() + ", Value: " + p2.getValue());

        System.out.println("p1Diamond -> Key: " + p1Diamond.getKey() + ", Value: " + p1Diamond.getValue());
        System.out.println("p2Diamond -> Key: " + p2Diamond.getKey() + ", Value: " + p2Diamond.getValue());
    }
}