public class Main {
    public static void main(String[] args) {
        
        LibraryManagementSystem library = new LibraryManagementSystem("TreeMap"); // Using TreeMap for sorted books

        
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925);
        Book book2 = new Book("1984", "George Orwell", 1949);
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee", 1960);

        library.addBook("978-0743273565", book1);
        library.addBook("978-0451524935", book2);
        library.addBook("978-0061120084", book3);

        
        System.out.println("Listing books in order:");
        library.listBooksInOrder();

        
        System.out.println("\nSearching for book with ISBN 978-0451524935:");
        System.out.println(library.searchBookByIsbn("978-0451524935"));

        
        System.out.println("\nDoes book with ISBN 978-0743273565 exist? " + library.containsBook("978-0743273565"));

       
        library.removeBook("978-0451524935");
        System.out.println("\nListing books after removing one:");
        library.listBooksInOrder();

        
        library.printLibrary();
    }
}
