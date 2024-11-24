import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class ProductStore {
    private static TreeMap<Integer, String> products = new TreeMap<>();
    public static void addProduct(int productId, String productName) {
        products.put(productId, productName);
        System.out.println("Product added: ID = " + productId + ", Name = " + productName);
    }
    public static void displayProductsGreaterThan(int value) {
        System.out.println("Products with ID greater than " + value + ":");
        for (Map.Entry<Integer, String> entry : products.tailMap(value + 1).entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        addProduct(101, "Laptop");
        addProduct(102, "Smartphone");
        addProduct(103, "Tablet");
        addProduct(104, "Smartwatch");
        System.out.print("Enter product ID to search products with IDs greater than: ");
        int searchValue = scanner.nextInt();
        displayProductsGreaterThan(searchValue);
        
        scanner.close();
    }
}