package Task_4;

import java.util.ArrayList;

public class Book {
    private String title;
    private String author;
    private int publicationYear;
    private double rating; // rating of the book
    private ArrayList<String> reviews = new ArrayList<>();

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.rating = 0.0;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        if (rating >= 0 && rating <= 5) {
            this.rating = rating;
        } else {
            System.out.println("Invalid rating! Please provide a value between 0 and 5.");
        }
    }

    public void addReview(String review) {
        reviews.add(review);
    }

    public ArrayList<String> getReviews() {
        return reviews;
    }

    public String getDetails() {
        return "Title: \"" + title + "\", Author: \"" + author + "\", Year: " + publicationYear +
                ", Rating: " + rating + "⭐";
    }
}
