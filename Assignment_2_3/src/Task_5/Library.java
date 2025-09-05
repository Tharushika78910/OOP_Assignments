package Task_5;

import Task_4.Book;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        System.out.println("Library Catalog:");
        if (books.isEmpty()) {
            System.out.println("No books available in the library.");
            return;
        }
        for (int i = 0; i < books.size(); i++) {
            System.out.println((i + 1) + ". " + books.get(i).getDetails());
        }
    }

    public void findBooksByAuthor(String author) {
        System.out.println("\nBooks by Author \"" + author + "\":");
        boolean found = false;
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                System.out.println(book.getDetails());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books found by this author.");
        }
    }

    public Book borrowBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                books.remove(book);
                System.out.println("\nYou borrowed: " + book.getDetails());
                return book;
            }
        }
        System.out.println("\nBook titled \"" + title + "\" is not available.");
        return null;
    }

    public void returnBook(Book book) {
        if (book != null) {
            books.add(book);
            System.out.println("\nBook returned: " + book.getDetails());
        }
    }

    public boolean isBookAvailable(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return true;
            }
        }
        return false;
    }

    public double getAverageBookRating() {
        if (books.isEmpty()) return 0.0;

        double sum = 0;
        for (Book book : books) {
            sum += book.getRating();
        }
        return sum / books.size();
    }

    public Book getMostReviewedBook() {
        if (books.isEmpty()) return null;

        Book mostReviewed = books.get(0);
        for (Book book : books) {
            if (book.getReviews().size() > mostReviewed.getReviews().size()) {
                mostReviewed = book;
            }
        }
        return mostReviewed;
    }
}
