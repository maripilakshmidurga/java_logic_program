import java.util.*;

public class LibraryManagementSystem {
    private Map<String, Book> books; // To hold books, where ISBN is the key

    public LibraryManagementSystem(String mapType) {
        
        switch (mapType) {
            case "HashMap":
                books = new HashMap<>();
                break;
            case "LinkedHashMap":
                books = new LinkedHashMap<>();
                break;
            case "TreeMap":
                books = new TreeMap<>();
                break;
            default:
                throw new IllegalArgumentException("Invalid map type");
        }
    }

    
    public void addBook(String isbn, Book book) {
        books.put(isbn, book);
    }

    
    public void removeBook(String isbn) {
        books.remove(isbn);
    }

   
    public Book searchBookByIsbn(String isbn) {
        return books.get(isbn);
    }

    
    public void listAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            books.forEach((isbn, book) -> System.out.println("ISBN: " + isbn + " - " + book));
        }
    }

    
    public boolean containsBook(String isbn) {
        return books.containsKey(isbn);
    }

    
    public void listBooksInOrder() {
        listAllBooks();
    }

    
    public void printLibrary() {
        if (books.isEmpty()) {
            System.out.println("The library is empty.");
        } else {
            System.out.println("Library contents:");
            books.forEach((isbn, book) -> System.out.println(isbn + " -> " + book));
        }
    }
}
