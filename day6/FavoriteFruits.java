import java.util.LinkedHashSet;
public class FavoriteFruits {
    public static void main(String[] args) {
        LinkedHashSet<String> fruits = new LinkedHashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Apple"); // Duplicate fruit
        System.out.println("Favorite Fruits (duplicates removed):");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
