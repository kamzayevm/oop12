package src.Library;

import java.io.Serializable;

public class Book implements Serializable {

    private String bookId;
    private String title;
    private String content;
    private int numberOfPages;
    private String author;
    private boolean isAvailable;

    public Book(String bookId, String title, String content, int numberOfPages, String author) {
        this.bookId = bookId;
        this.title = title;
        this.content = content;
        this.numberOfPages = numberOfPages;
        this.author = author;
        this.isAvailable = true; 
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void checkOutBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("The book with ID " + bookId + " has been checked out.");
        } else {
            System.out.println("Sorry, the book with ID " + bookId + " is currently not available.");
        }
    }

    public void returnBook() {
        isAvailable = true;
        System.out.println("The book with ID " + bookId + " has been returned.");
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId='" + bookId + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", author='" + author + '\'' +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
