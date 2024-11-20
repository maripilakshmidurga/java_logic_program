import java.util.TreeSet;
public class CityTreeSet {
    public static void main(String[] args) {      
        TreeSet<String> cities = new TreeSet<>();
        cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("Chennai");
        cities.add("Bangalore");
        cities.add("Hyderabad");
        System.out.println("Cities in sorted order:");
        for (String city : cities) {
            System.out.println(city);
        }
    }
}
