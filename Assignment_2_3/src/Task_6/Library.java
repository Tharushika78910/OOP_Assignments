package Task_6;

import Task_4.Book;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void addUser(User user) {
        users.add(user);
        System.out.println("User registered: " + user.getName());
    }

    public void displayBooks() {
        System.out.println("\nLibrary Catalog:");
        if (books.isEmpty()) {
            System.out.println("No books available in the library.");
            return;
        }
        for (int i = 0; i < books.size(); i++) {
            System.out.println((i + 1) + ". " + books.get(i).getDetails());
        }
    }

    public void borrowBook(User user, String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                books.remove(book);
                user.borrowBook(book);
                System.out.println(user.getName() + " borrowed: " + book.getDetails());
                return;
            }
        }
        System.out.println("Book titled \"" + title + "\" is not available.");
    }

    public void returnBook(User user, Book book) {
        if (user.getBorrowedBooks().contains(book)) {
            user.returnBook(book);
            books.add(book);
            System.out.println(user.getName() + " returned: " + book.getDetails());
        } else {
            System.out.println(user.getName() + " does not have this book.");
        }
    }
}
