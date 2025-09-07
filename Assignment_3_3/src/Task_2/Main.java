package Task_2;

import Task_2.model.Book;
import Task_2.model.LibraryMember;
import Task_2.system.Library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book b1 = new Book("1984", "George Orwell", "12345");
        Book b2 = new Book("To Kill a Mockingbird", "Harper Lee", "67890");
        Book b3 = new Book("The Hobbit", "J.R.R. Tolkien", "11223");

        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);

        LibraryMember m1 = new LibraryMember("Alice", 1);
        LibraryMember m2 = new LibraryMember("Bob", 2);

        library.addMember(m1);
        library.addMember(m2);

        library.borrowBook(m1, b1);
        library.borrowBook(m2, b2);
        library.borrowBook(m1, b2);

        library.showBooks();

        library.returnBook(m1, b1);
        library.showBooks();
    }
}
