package edu.guilford;

/**
 * This class is the Book class. It contains the attributes of a book, the
 * constructor, and the getters and setters for the attributes.
 * 
 * @param author
 * @param bookFormat
 * @param description
 * @param genre
 * @param title
 * @param pageNumber
 * @param bookRating
 * @param reviewAmount
 * @param totalRatings
 * @author Tori Williams
 * @version 1.0
 * @since 11/2022
 * 
 */
public class Book {
    
    // attributes
    private String author;
    private String bookFormat;
    private String description;
    private String genre;
    private String title;
    private int pageNumber;
    private double bookRating;
    private double userRating;
    private int reviewAmount;
    private int totalRatings;
    
    // constructor(s)

    /**
     * This is an empty constructor for the Book class.
     * 
     */
    public Book() {
    }

    /**
     * This is a constructor for the Book class. 
     * This constructor takes in the attributes of a book as parameters.
     * and sets the attributes to the parameters, respectively.
     * 
     * @return author
     * @return bookFormat
     * @return description
     * @return genre
     * @return title
     * @return pageNumber
     * @return bookRating
     * @return reviewAmount
     * @return totalRatings 
     * 
     */
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

    /**
     * This is the getter for the author attribute.
     * 
     * @return author
     * 
     */
    public String getAuthor() {
        return author;
    }

    /**
     * This is the setter for the author attribute.
     * 
     * @param author 
     * 
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * This is the getter for the bookFormat attribute.
     * 
     * @return bookFormat
     * 
     */
    public String getBookFormat() {
        return bookFormat;
    }

    /**
     * This is the setter for the bookFormat attribute.
     * 
     * @param bookFormat 
     * 
     */
    public void setBookFormat(String bookFormat) {
        this.bookFormat = bookFormat;
    }

    /**
     * This is the getter for the description attribute.
     * 
     * @return description
     * 
     */
    public String getDescription() {
        return description;
    }

    /**
     * This is the setter for the description attribute.
     * 
     * @param description 
     * 
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * This is the getter for the genre attribute.
     * 
     * @return genre
     * 
     */
    public String getGenre() {
        return genre;
    }

    /**
     * This is the setter for the genre attribute.
     * 
     * @param genre 
     * 
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * This is the getter for the title attribute.
     * 
     * @return title
     * 
     */
    public String getTitle() {
        return title;
    }

    /**
     * This is the setter for the title attribute.
     * 
     * @param title 
     * 
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * This is the getter for the pageNumber attribute.
     * 
     * @return pageNumber
     * 
     */
    public int getPageNumber() {
        return pageNumber;
    }

    /**
     * This is the setter for the pageNumber attribute.
     * 
     * @param pageNumber 
     * 
     */
    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * This is the getter for the bookRating attribute.
     * 
     * @return bookRating
     * 
     */
    public double getBookRating() {
        return bookRating;
    }

    /**
     * This is the setter for the bookRating attribute.
     * 
     * @param bookRating
     * 
     */
    public void setBookRating(double bookRating) {
        this.bookRating = bookRating;
    }

    /**
     * This is the getter for the userRating attribute.
     * 
     * @return userRating
     * 
     */
    public double getUserRating() {
        return userRating;
    }

    /**
     * This is the setter for the userRating attribute.
     * 
     * @param userRating 
     * 
     */

    public void setUserRating(double userRating) {
        this.userRating = userRating;
    }

    /**
     * This is the getter for the reviewAmount attribute.
     * 
     * @return reviewAmount
     * 
     */
    public int getReviewAmount() {
        return reviewAmount;
    }

    /**
     * This is the setter for the reviewAmount attribute.
     * 
     * @param reviewAmount 
     * 
     */
    public void setReviewAmount(int reviewAmount) {
        this.reviewAmount = reviewAmount;
    }

    /**
     * This is the getter for the totalRatings attribute.
     * 
     * @return totalRatings
     * 
     */
    public int getTotalRatings() {
        return totalRatings;
    }

    /**
     * This is the setter for the totalRatings attribute.
     * 
     * @param totalRatings 
     * 
     */
    public void setTotalRatings(int totalRatings) {
        this.totalRatings = totalRatings;
    }

    /**
     * This is the toString method for the Book class.
     * 
     * @return String
     * 
     */
    @Override
    public String toString() {
        return "Book{" + "author=" + author + ", bookFormat=" + bookFormat + ", description=" + description + ", genre=" + genre + ", title=" + title + ", pageNumber=" + pageNumber + ", bookRating=" + bookRating + ", reviewAmount=" + reviewAmount + ", totalRatings=" + totalRatings + '}';
    }

    /**
     * This is the main method for the Book class.
     * 
     * @param args 
     * @return void
     * 
     */
    public static String getResourceAsStream(String string) {
        return null;
    }
    
}
