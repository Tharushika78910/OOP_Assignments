package Task_6;

import Task_4.Book;

import java.util.ArrayList;

public class User {
    private String name;
    private int age;
    private ArrayList<Book> borrowedBooks = new ArrayList<>();

    // Constructor
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Add book to borrowed list
    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    // Remove book from borrowed list
    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }

    // Get list of borrowed books
    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    // Display borrowed books
    public void displayBorrowedBooks() {
        System.out.println("\n" + name + "'s Borrowed Books:");
        if (borrowedBooks.isEmpty()) {
            System.out.println("No books borrowed.");
        } else {
            for (Book book : borrowedBooks) {
                System.out.println("- " + book.getDetails());
            }
        }
    }
}
