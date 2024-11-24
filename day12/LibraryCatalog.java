import java.util.HashMap;
public class LibraryCatalog {
    private HashMap<Integer, String> books;

    public LibraryCatalog() {
        books = new HashMap<>();
    }
    public void addBook(int bookId, String title) {
        books.put(bookId, title);
    }
    public String getBookById(int bookId) {
        return books.getOrDefault(bookId, "Book not found");
    }
    public boolean bookExists(int bookId) {
        return books.containsKey(bookId);
    }
    public void removeBook(int bookId) {
        if (books.containsKey(bookId)) {
            books.remove(bookId);
        } else {
            System.out.println("Book with ID " + bookId + " not found.");
        }
    }

    public static void main(String[] args) {
        LibraryCatalog library = new LibraryCatalog();
        library.addBook(101, "Java Programming");
        library.addBook(102, "Data Structures");
        System.out.println("Book with ID 101: " + library.getBookById(101));
        System.out.println("Does book with ID 103 exist? " + library.bookExists(103));
        library.removeBook(102);
        System.out.println("Book with ID 102: " + library.getBookById(102));
    }
}