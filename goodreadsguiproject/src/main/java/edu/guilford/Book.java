package edu.guilford;

public class Book {
    
    // attributes
    private String author;
    private String bookFormat;
    private String description;
    private String genre;
    private String title;
    private int pageNumber;
    private double bookRating;
    private int reviewAmount;
    private int totalRatings;
    
    // constructor(s)

    public Book() {
    }
    
    public Book(String author, String bookFormat, String description, String genre, 
            String title, int pageNumber, double bookRating, int reviewAmount, int totalRatings) {
        this.author = author;
        this.bookFormat = bookFormat;
        this.description = description;
        this.genre = genre;
        this.title = title;
        this.pageNumber = pageNumber;
        this.bookRating = bookRating;
        this.reviewAmount = reviewAmount;
        this.totalRatings = totalRatings;
    }
    
    // getters & setters & methods
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBookFormat() {
        return bookFormat;
    }

    public void setBookFormat(String bookFormat) {
        this.bookFormat = bookFormat;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public double getBookRating() {
        return bookRating;
    }

    public void setBookRating(double bookRating) {
        this.bookRating = bookRating;
    }

    public int getReviewAmount() {
        return reviewAmount;
    }

    public void setReviewAmount(int reviewAmount) {
        this.reviewAmount = reviewAmount;
    }

    public int getTotalRatings() {
        return totalRatings;
    }

    public void setTotalRatings(int totalRatings) {
        this.totalRatings = totalRatings;
    }

    @Override
    public String toString() {
        return "Book{" + "author=" + author + ", bookFormat=" + bookFormat + ", description=" + description + ", genre=" + genre + ", title=" + title + ", pageNumber=" + pageNumber + ", bookRating=" + bookRating + ", reviewAmount=" + reviewAmount + ", totalRatings=" + totalRatings + '}';
    }
    
}
