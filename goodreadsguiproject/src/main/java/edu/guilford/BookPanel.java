package edu.guilford;

import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;

public class BookPanel extends GridPane {

    // attributes
    private Book book;

    // label attributes
    private Label authorLabel;
    private Label bookFormatLabel;
    private Label titleLabel;
    private Label pageNumberLabel;
    private Label bookRatingLabel;
    private Label reviewAmountLabel;
    private Label totalRatingsLabel;

    // textarea attributes
    private TextArea descriptionTextArea;
    private TextArea genreTextArea;

    // constructor(s)
    public BookPanel() {
        // instantiate the book
        book = new Book();

        // instantiate the labels
        authorLabel = new Label("Author: ");
        bookFormatLabel = new Label("Book Format: ");
        titleLabel = new Label("Title: ");
        pageNumberLabel = new Label("Page Number: ");
        bookRatingLabel = new Label("Book Rating: ");
        reviewAmountLabel = new Label("Review Amount: ");
        totalRatingsLabel = new Label("Total Ratings: ");

        // instantiate the textareas
        descriptionTextArea = new TextArea();
        genreTextArea = new TextArea();

        // add the labels and textareas to the gridpane
        this.add(authorLabel, 0, 0);
        this.add(bookFormatLabel, 0, 1);
        this.add(titleLabel, 0, 2);
        this.add(pageNumberLabel, 0, 3);
        this.add(bookRatingLabel, 0, 4);
        this.add(reviewAmountLabel, 0, 5);
        this.add(totalRatingsLabel, 0, 6);
        this.add(descriptionTextArea, 2, 0);
        this.add(genreTextArea, 2, 1);

    }

}
