package Task_3;

import Task_3.model.Book;
import Task_3.model.LibraryMember;
import Task_3.system.Library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Create books
        Book b1 = new Book("1984", "George Orwell", "12345");
        Book b2 = new Book("The Hobbit", "J.R.R. Tolkien", "67890");

        // Add books
        library.addBook(b1);
        library.addBook(b2);

        // Create members
        LibraryMember m1 = new LibraryMember("Alice", 1);
        LibraryMember m2 = new LibraryMember("Bob", 2);

        library.addMember(m1);
        library.addMember(m2);

        // Reservation demo
        library.reserveBook(m1, b1);
        library.reserveBook(m2, b2);

        library.displayReservedBooks(m1);
        library.displayReservedBooks(m2);

        // Try borrowing reserved book
        library.borrowBook(m2, b1); // should block
        library.borrowBook(m1, b1); // should succeed

        library.cancelReservation(m2, b2);
        library.displayReservedBooks(m2);
    }
}
