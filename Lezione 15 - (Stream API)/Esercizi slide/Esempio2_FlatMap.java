import java.util.List;

public class Esempio2_FlatMap 
{

    // Classi di supporto statiche per l'esecuzione nel main
    static class City 
    {
        private String name;
        private int population;

        public City(String name, int population) 
        {
            this.name = name;
            this.population = population;
        }
        public int getPopulation() { return population; }
    }

    static class State 
    {
        private String name;
        private List<City> cities;

        public State(String name, List<City> cities) 
        {
            this.name = name;
            this.cities = cities;
        }
        public List<City> getCities() { return cities; }
    }

    public static void main(String[] args) 
    {
        System.out.println("--- Uso di FlatMap per relazioni 1:N ---");
        System.out.println("Inizializzo i dati: 2 Stati con diverse Città.");
        
        State stato1 = new State("Stato A", List.of(new City("Città 1", 50000), new City("Città 2", 150000)));
        State stato2 = new State("Stato B", List.of(new City("Città 3", 80000), new City("Città 4", 120000)));
        List<State> states = List.of(stato1, stato2);

        System.out.println("Calcolo la popolazione totale usando flatMap per unire gli stream di città...");
        int totalPopulation = states.stream()
            .flatMap(state -> state.getCities().stream()) // Appiattisce lo Stream<Stream<City>> in Stream<City>
            .mapToInt(City::getPopulation)                // Trasforma lo Stream<City> in IntStream
            .sum();                                       // Esegue la somma

        System.out.println("Popolazione totale calcolata: " + totalPopulation);
    }
}