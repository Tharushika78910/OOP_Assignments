package Task_3.system;

import Task_3.model.Book;
import Task_3.model.LibraryMember;

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
        if (book.isReserved() && !member.hasReservedBook(book)) {
            System.out.println("Book reserved by another member: " + book);
            return;
        }
        book.setBorrowed(true);
        book.setReserved(false); // reservation cleared once borrowed
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

    // --- Reservation Methods ---
    public void reserveBook(LibraryMember member, Book book) {
        if (!books.contains(book)) {
            System.out.println("Book not in library: " + book);
            return;
        }
        if (book.isReserved()) {
            System.out.println("Book already reserved: " + book);
            return;
        }
        book.setReserved(true);
        member.addReservedBook(book);
        System.out.println(member.getName() + " reserved: " + book);
    }

    public void cancelReservation(LibraryMember member, Book book) {
        if (book.isReserved() && member.hasReservedBook(book)) {
            book.setReserved(false);
            member.removeReservedBook(book);
            System.out.println(member.getName() + " canceled reservation: " + book);
        } else {
            System.out.println("Book was not reserved by " + member.getName());
        }
    }

    public void displayReservedBooks(LibraryMember member) {
        System.out.println("\nReserved books for " + member.getName() + ":");
        if (member.getReservedBooks().isEmpty()) {
            System.out.println("No reserved books.");
        } else {
            for (Book book : member.getReservedBooks()) {
                System.out.println("- " + book);
            }
        }
    }
}
