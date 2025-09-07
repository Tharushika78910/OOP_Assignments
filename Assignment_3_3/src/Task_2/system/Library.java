package Task_2.system;

import Task_2.model.Book;
import Task_2.model.LibraryMember;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<LibraryMember> members;

    public Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Added book: " + book);
    }

    public void addMember(LibraryMember member) {
        members.add(member);
        System.out.println("Added member: " + member);
    }

    public void borrowBook(LibraryMember member, Book book) {
        if (!books.contains(book)) {
            System.out.println("Book not in library: " + book);
            return;
        }
        if (book.isBorrowed()) {
            System.out.println("Book already borrowed: " + book);
            return;
        }
        book.setBorrowed(true);
        member.borrowBook(book);
        System.out.println(member.getName() + " borrowed: " + book);
    }

    public void returnBook(LibraryMember member, Book book) {
        if (member.getBorrowedBooks().contains(book)) {
            book.setBorrowed(false);
            member.returnBook(book);
            System.out.println(member.getName() + " returned: " + book);
        } else {
            System.out.println(member.getName() + " has not borrowed this book: " + book);
        }
    }

    public void showBooks() {
        System.out.println("\n Library Books:");
        for (Book book : books) {
            System.out.println("- " + book + (book.isBorrowed() ? " [Borrowed]" : " [Available]"));
        }
    }
}
