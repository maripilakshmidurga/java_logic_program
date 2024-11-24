// Library Managment System

interface LibraryItem {
    void CheckAvailability();
    void DisplayInfo();
}

class Book implements LibraryItem {
    String Title;
    String Author;
    boolean AvailableOrNot;

    // Constructor
    public Book(String Title, String Author, boolean AvailableOrNot) {
        this.Title = Title;
        this.Author = Author;
        this.AvailableOrNot = AvailableOrNot;
    }

    @Override
    public void CheckAvailability() {
        if (AvailableOrNot) {
            System.out.println("The book is available.");
        } else {
            System.out.println("The book is not available.");
        }
    }

    @Override
    public void DisplayInfo() {
        System.out.println("Title: " + Title);
        System.out.println("Author: " + Author);
        System.out.println("Availability: " + (AvailableOrNot ? "Available" : "Not Available"));
    }
}

class Magazine implements LibraryItem {
    String Title;
    int IssueNumber;
    boolean AvailableOrNot;

    // Constructor
    public Magazine(String Title, int IssueNumber, boolean AvailableOrNot) {
        this.Title = Title;
        this.IssueNumber = IssueNumber;
        this.AvailableOrNot = AvailableOrNot;
    }

    @Override
    public void CheckAvailability() {
        if (AvailableOrNot) {
            System.out.println("The magazine is available.");
        } else {
            System.out.println("The magazine is not available.");
        }
    }

    @Override
    public void DisplayInfo() {
        System.out.println("Title: " + Title);
        System.out.println("Issue Number: " + IssueNumber);
        System.out.println("Availability: " + (AvailableOrNot ? "Available" : "Not Available"));
    }
}

public class LibraryInformationSystem {
    public static void main(String args[]) {

        LibraryItem book = new Book("Python Programming", "Guido van Rossum", true);
        book.DisplayInfo();
        book.CheckAvailability();

        LibraryItem magazine = new Magazine("Good Things", 123, false);
        magazine.DisplayInfo();
        magazine.CheckAvailability();
    }
}