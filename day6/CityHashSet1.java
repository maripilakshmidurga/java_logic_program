import java.util.HashSet;
public class CityHashSet {
    public static void main(String[] args) {       
        HashSet<String> cities = new HashSet<>();       
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Delhi"); // Duplicate
        cities.add("Chennai");
        System.out.println("Cities in the HashSet (duplicates removed):");
        for (String city : cities) {
            System.out.println(city);
        }
        System.out.println("\nIs Delhi in the set? " + cities.contains("Delhi"));
        System.out.println("Is Kolkata in the set? " + cities.contains("Kolkata"));
    }
}
