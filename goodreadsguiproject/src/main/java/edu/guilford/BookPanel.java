package edu.guilford;

import java.util.ArrayList;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.control.Label;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BookPanel extends GridPane {

    private ArrayList<Book> books;

    private int bookList;
    private String format = "All";
    private Color fontColor = Color.WHITE;
    private FontWeight fontWeight = FontWeight.NORMAL;
    private String fontStyle = "Georgia";
    private int fontSize = 14;

    public BookPanel() {
        initComponents();
    }

    public BookPanel(ArrayList<Book> books) {
        initComponents();
        this.books = books;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boldButtonGroup = new ToggleGroup();
        formatButtonGroup = new ToggleGroup();
        listOfBooksScroll = new ScrollPane();
        listOfBooks = new TextArea();
        forwardButton = new Button();
        backwardButton = new Button();
        bookSlider = new Slider();
        bookRatingLabel = new Label();
        bookTitleLabel = new Label();
        authorLabel = new Label();
        ;
        pagesLabel = new Label();
        totalRatingsLabel = new Label();
        boldTitle = new RadioButton();
        boldAuthor = new RadioButton();
        boldStarRating = new RadioButton();
        boldPageNumber = new RadioButton();
        boldTotalRatings = new RadioButton();
        sliderLabel = new Label();
        formatLabel = new Label();
        boldFormat = new RadioButton();
        paperbackButton = new RadioButton();
        hardcoverButton = new RadioButton();
        ebookButton = new RadioButton();
        audiobookButton = new RadioButton();
        allButton = new RadioButton();

        // set background color of the panel for javafx
        this.setStyle("-fx-background-color: deeppink;");

        // column constraints
        this.getColumnConstraints().add(0, new ColumnConstraints(100));
        this.getColumnConstraints().add(1, new ColumnConstraints(100));
        this.getColumnConstraints().add(2, new ColumnConstraints(150));
        this.getColumnConstraints().add(3, new ColumnConstraints(150));
        this.getColumnConstraints().add(4, new ColumnConstraints(150));
        this.getColumnConstraints().add(5, new ColumnConstraints(150));

        listOfBooks.setEditable(false);
        listOfBooks.setPrefColumnCount(23);
        listOfBooks.setFont(new Font("Georgia", 12));
        listOfBooks.setStyle("-fx-text-fill: #666667;");
        listOfBooks.setPrefRowCount(6);
        listOfBooks.setText("Book Genre:\n\nBook Description:  ");
        // set list of books to wrap text
        listOfBooks.setWrapText(true);
        // set list of books to not be editable
        listOfBooks.setEditable(false);
        // add list of books to the gridpane
        listOfBooksScroll.setContent(listOfBooks);
        this.add(listOfBooksScroll, 3, 0, 2, 7);

        forwardButton.setFont(new Font("Georgia", 12));
        forwardButton.setText("->");
        forwardButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                forwardButtonActionPerformed(actionEvent);
            }

            // private void forwardButtonActionPerformed(ActionEvent actionEvent) {
            // }
        });
        // add forward button to the gridpane
        this.add(forwardButton, 1, 9);

        backwardButton.setFont(new Font("Georgia", 12));
        backwardButton.setText("<-");
        backwardButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                backwardButtonActionPerformed(actionEvent);
            }

            // private void backwardButtonActionPerformed(ActionEvent actionEvent) {
            // }
        });
        // add backward button to the gridpane
        this.add(backwardButton, 0, 9);

        bookSlider.setBlockIncrement(1.0);
        bookSlider.setMajorTickUnit(200.0);
        bookSlider.setMinorTickCount(50);
        bookSlider.setShowTickLabels(true);
        bookSlider.setShowTickMarks(true);
        bookSlider.setMax(1000);
        bookSlider.setTooltip(new Tooltip(""));
        bookSlider.setValue(14);
        bookSlider.valueProperty().addListener((observableValue, oldValue, newValue) -> {
            bookSliderStateChanged(observableValue);
        });
        // add book slider to the gridpane
        this.add(bookSlider, 3, 9, 2, 1);

        bookRatingLabel.setFont(new Font("Georgia", 14));
        bookRatingLabel.setStyle("-fx-text-fill: white;");
        bookRatingLabel.setText("Star Rating: ");
        // add book rating label to the gridpane
        this.add(bookRatingLabel, 0, 3, 2, 1);

        bookTitleLabel.setFont(new Font("Georgia", 14));
        bookTitleLabel.setStyle("-fx-text-fill: white;");
        bookTitleLabel.setText("Title: ");
        // add book title label to the gridpane
        this.add(bookTitleLabel, 0, 0, 3, 1);

        authorLabel.setFont(new Font("Georgia", 14));
        authorLabel.setStyle("-fx-text-fill: white;");
        authorLabel.setText("Author: ");
        // add author label to the gridpane
        this.add(authorLabel, 0, 1, 3, 1);

        pagesLabel.setFont(new Font("Georgia", 14));
        pagesLabel.setStyle("-fx-text-fill: white;");
        pagesLabel.setText("Page Count: ");
        // add page count label to the gridpane
        this.add(pagesLabel, 0, 2, 2, 1);

        totalRatingsLabel.setFont(new Font("Georgia", 14));
        totalRatingsLabel.setStyle("-fx-text-fill: white;");
        totalRatingsLabel.setText("Total Ratings: ");
        // add total ratings label to the gridpane
        this.add(totalRatingsLabel, 0, 4, 2, 1);

        boldTitle.setFont(new Font("Georgia", 12));
        boldTitle.setToggleGroup(boldButtonGroup);
        boldTitle.setSelected(true);
        boldTitle.setText("Bold Title");
        boldTitle.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                boldTitleActionPerformed(actionEvent);
            }

            // private void boldTitleActionPerformed(ActionEvent actionEvent) {
            // }
        });
        // add bold title button to the gridpane
        this.add(boldTitle, 0, 11, 2, 1);

        boldAuthor.setFont(new Font("Georgia", 12));
        boldAuthor.setToggleGroup(boldButtonGroup);
        boldAuthor.setText("Bold Author");
        boldAuthor.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                boldAuthorActionPerformed(actionEvent);
            }

            // private void boldAuthorActionPerformed(ActionEvent actionEvent) {
            // }
        });
        // add bold author button to the gridpane
        this.add(boldAuthor, 0, 12, 2, 1);

        boldStarRating.setFont(new Font("Georgia", 12));
        boldStarRating.setToggleGroup(boldButtonGroup);
        boldStarRating.setText("Bold Star Rating");
        boldStarRating.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                boldStarRatingActionPerformed(actionEvent);
            }

            // private void boldStarRatingActionPerformed(ActionEvent actionEvent) {
            // }
        });
        // add bold star rating button to the gridpane
        this.add(boldStarRating, 2, 11, 2, 1);

        boldPageNumber.setFont(new Font("Georgia", 12));
        boldPageNumber.setToggleGroup(boldButtonGroup);
        boldPageNumber.setText("Bold Page Count");
        boldPageNumber.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                boldPageNumberActionPerformed(actionEvent);
            }

            // private void boldPageNumberActionPerformed(ActionEvent actionEvent) {
            // }
        });
        // add bold page number button to the gridpane
        this.add(boldPageNumber, 0, 13, 2, 1);

        boldTotalRatings.setFont(new Font("Georgia", 12));
        boldTotalRatings.setToggleGroup(boldButtonGroup);
        boldTotalRatings.setText("Bold Total Ratings");
        boldTotalRatings.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                boldTotalRatingsActionPerformed(actionEvent);
            }

            // private void boldTotalRatingsActionPerformed(ActionEvent actionEvent) {
            // }
        });
        // add bold total ratings button to the gridpane
        this.add(boldTotalRatings, 2, 12, 2, 1);

        sliderLabel.setFont(new Font("Georgia", 16));
        sliderLabel.setStyle("-fx-text-fill: white;");
        sliderLabel.setText("Slide to choose a book out of 1000: ");
        // add slider label to the gridpane
        this.add(sliderLabel, 0, 8, 3, 1);

        formatLabel.setFont(new Font("Georgia", 14));
        formatLabel.setStyle("-fx-text-fill: white;");
        formatLabel.setText("Format: ");
        // add format label to the gridpane
        this.add(formatLabel, 0, 5, 2, 1);

        boldFormat.setFont(new Font("Georgia", 12));
        boldFormat.setToggleGroup(boldButtonGroup);
        boldFormat.setText("Bold Format");
        boldFormat.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                boldFormatActionPerformed(actionEvent);
            }

            // private void boldFormatActionPerformed(ActionEvent actionEvent) {
            // }
        });
        // add bold format button to the gridpane
        this.add(boldFormat, 2, 13, 2, 1);

        paperbackButton.setFont(new Font("Georgia", 12));
        paperbackButton.setToggleGroup(formatButtonGroup);
        paperbackButton.setText("Paperback");
        paperbackButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                paperbackButtonActionPerformed(actionEvent);
            }

            // private void paperbackButtonActionPerformed(ActionEvent actionEvent) {
            // }
        });
        // add paperback button to the gridpane
        this.add(paperbackButton, 3, 12);

        hardcoverButton.setFont(new Font("Georgia", 12));
        hardcoverButton.setToggleGroup(formatButtonGroup);
        hardcoverButton.setText("Hardcover");
        hardcoverButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                hardcoverButtonActionPerformed(actionEvent);
            }

            // private void hardcoverButtonActionPerformed(ActionEvent actionEvent) {
            // }
        });
        // add hardcover button to the gridpane
        this.add(hardcoverButton, 3, 13);

        ebookButton.setFont(new Font("Georgia", 12));
        ebookButton.setToggleGroup(formatButtonGroup);
        ebookButton.setText("Ebook");
            ebookButton.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent actionEvent) {
                    ebookButtonActionPerformed(actionEvent);
                }

                // private void ebookButtonActionPerformed(ActionEvent actionEvent) {
                // }
            });
        // add ebook button to the gridpane
        this.add(ebookButton, 4, 12);

        audiobookButton.setFont(new Font("Georgia", 12));
        audiobookButton.setToggleGroup(formatButtonGroup);
        audiobookButton.setText("Audiobook");
        audiobookButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                audiobookButtonActionPerformed(actionEvent);
            }

            // private void audiobookButtonActionPerformed(ActionEvent actionEvent) {
            // }
        });
        // add audiobook button to the gridpane
        this.add(audiobookButton, 4, 11);

        allButton.setFont(new Font("Georgia", 12));
        allButton.setToggleGroup(formatButtonGroup);
        allButton.setSelected(true);
        allButton.setText("All");
        allButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                allButtonActionPerformed(actionEvent);
            }

            // private void allButtonActionPerformed(ActionEvent actionEvent) {
            // }
        });
        // add all button to the gridpane
        this.add(allButton, 3, 11);
    }

    private void bookSliderStateChanged(ObservableValue<? extends Number> observableValue) {
        // get the value of the slider
        int sliderValue = (int) bookSlider.getValue();
        // set the value of the slider to the bookList
        bookList = sliderValue;
        // update the book list
        updateBookList();
    }

    private void forwardButtonActionPerformed(ActionEvent actionEvent) {// GEN-FIRST:event_forwardButtonActionPerformed
        // TODO add your handling code here:
        bookList = bookList + 1;
        if (!format.equals("All")) {
            while (!books.get(bookList).getBookFormat().equals(format)) {
                bookList = bookList + 1;
            }
        }
        updateBookList();
    }// GEN-LAST:event_forwardButtonActionPerformed

    private void backwardButtonActionPerformed(ActionEvent actionEvent) {// GEN-FIRST:event_backwardButtonActionPerformed
        // TODO add your handling code here:
        bookList = bookList - 1;
        if (!format.equals("All")) {
            while (!books.get(bookList).getBookFormat().equals(format)) {
                bookList = bookList - 1;
            }
        }
        updateBookList();
    }// GEN-LAST:event_backwardButtonActionPerformed

    private void boldTitleActionPerformed(ActionEvent actionEvent) {// GEN-FIRST:event_boldTitleActionPerformed
        // TODO add your handling code here:
        fontWeight = FontWeight.NORMAL;
        fontColor = Color.WHITE;
        if (boldTitle.isSelected()) {
            fontWeight = FontWeight.BOLD;
            bookTitleLabel.setFont(Font.font(fontStyle, fontWeight, fontSize));
            bookTitleLabel.setStyle("-fx-text-fill: black;");
        }

        fontWeight = FontWeight.BOLD;
        fontColor = Color.DARKGREY;
        if (boldAuthor.isSelected() == false) {
            fontWeight = FontWeight.NORMAL;
            authorLabel.setFont(Font.font(fontStyle, fontWeight, fontSize));
            authorLabel.setStyle("-fx-text-fill: white;");
        }

        fontWeight = FontWeight.BOLD;
        fontColor = Color.DARKGREY;
        if (boldStarRating.isSelected() == false) {
            fontWeight = FontWeight.NORMAL;
            bookRatingLabel.setFont(Font.font(fontStyle, fontWeight, fontSize));
            bookRatingLabel.setStyle("-fx-text-fill: white;");
        }

        fontWeight = FontWeight.BOLD;
        fontColor = Color.DARKGREY;
        if (boldPageNumber.isSelected() == false) {
            fontWeight = FontWeight.NORMAL;
            pagesLabel.setFont(Font.font(fontStyle, fontWeight, fontSize));
            pagesLabel.setStyle("-fx-text-fill: white;");
        }

        fontWeight = FontWeight.BOLD;
        fontColor = Color.DARKGREY;
        if (boldTotalRatings.isSelected() == false) {
            fontWeight = FontWeight.NORMAL;
            totalRatingsLabel.setFont(Font.font(fontStyle, fontWeight, fontSize));
            totalRatingsLabel.setStyle("-fx-text-fill: white;");
        }

        fontWeight = FontWeight.BOLD;
        fontColor = Color.DARKGREY;
        if (boldFormat.isSelected() == false) {
            fontWeight = FontWeight.NORMAL;
            formatLabel.setFont(Font.font(fontStyle, fontWeight, fontSize));
            formatLabel.setStyle("-fx-text-fill: white;");
        }
    }// GEN-LAST:event_boldTitleActionPerformed

    private void boldAuthorActionPerformed(ActionEvent actionEvent) {// GEN-FIRST:event_boldAuthorActionPerformed
        fontWeight = FontWeight.NORMAL;
        fontColor = Color.WHITE;
        if (boldAuthor.isSelected()) {
            fontWeight = FontWeight.BOLD;
            authorLabel.setFont(Font.font(fontStyle, fontWeight, fontSize));
            authorLabel.setStyle("-fx-text-fill: black;");
        }

        fontWeight = FontWeight.BOLD;
        fontColor = Color.DARKGREY;
        if (boldTitle.isSelected() == false) {
            fontWeight = FontWeight.NORMAL;
            bookTitleLabel.setFont(Font.font(fontStyle, fontWeight, fontSize));
            bookTitleLabel.setStyle("-fx-text-fill: white;");
        }

        fontWeight = FontWeight.BOLD;
        fontColor = Color.DARKGREY;
        if (boldStarRating.isSelected() == false) {
            fontWeight = FontWeight.NORMAL;
            bookRatingLabel.setFont(Font.font(fontStyle, fontWeight, fontSize));
            bookRatingLabel.setStyle("-fx-text-fill: white;");
        }

        fontWeight = FontWeight.BOLD;
        fontColor = Color.DARKGREY;
        if (boldPageNumber.isSelected() == false) {
            fontWeight = FontWeight.NORMAL;
            pagesLabel.setFont(Font.font(fontStyle, fontWeight, fontSize));
            pagesLabel.setStyle("-fx-text-fill: white;");
        }

        fontWeight = FontWeight.BOLD;
        fontColor = Color.DARKGREY;
        if (boldTotalRatings.isSelected() == false) {
            fontWeight = FontWeight.NORMAL;
            totalRatingsLabel.setFont(Font.font(fontStyle, fontWeight, fontSize));
            totalRatingsLabel.setStyle("-fx-text-fill: white;");
        }

        fontWeight = FontWeight.BOLD;
        fontColor = Color.DARKGREY;
        if (boldFormat.isSelected() == false) {
            fontWeight = FontWeight.NORMAL;
            formatLabel.setFont(Font.font(fontStyle, fontWeight, fontSize));
            formatLabel.setStyle("-fx-text-fill: white;");
        }
    }// GEN-LAST:event_boldAuthorActionPerformed

    private void boldStarRatingActionPerformed(ActionEvent actionEvent) {// GEN-FIRST:event_boldStarRatingActionPerformed
        fontWeight = FontWeight.NORMAL;
        fontColor = Color.WHITE;
        if (boldStarRating.isSelected()) {
            fontWeight = FontWeight.BOLD;
            bookRatingLabel.setFont(Font.font(fontStyle, fontWeight, fontSize));
            bookRatingLabel.setStyle("-fx-text-fill: black;");
        }

        fontWeight = FontWeight.BOLD;
        fontColor = Color.DARKGREY;
        if (boldAuthor.isSelected() == false) {
            fontWeight = FontWeight.NORMAL;
            authorLabel.setFont(Font.font(fontStyle, fontWeight, fontSize));
            authorLabel.setStyle("-fx-text-fill: white;");
        }

        fontWeight = FontWeight.BOLD;
        fontColor = Color.DARKGREY;
        if (boldTitle.isSelected() == false) {
            fontWeight = FontWeight.NORMAL;
            bookTitleLabel.setFont(Font.font(fontStyle, fontWeight, fontSize));
            bookTitleLabel.setStyle("-fx-text-fill: white;");
        }

        fontWeight = FontWeight.BOLD;
        fontColor = Color.DARKGREY;
        if (boldPageNumber.isSelected() == false) {
            fontWeight = FontWeight.NORMAL;
            pagesLabel.setFont(Font.font(fontStyle, fontWeight, fontSize));
            pagesLabel.setStyle("-fx-text-fill: white;");
        }

        fontWeight = FontWeight.BOLD;
        fontColor = Color.DARKGREY;
        if (boldTotalRatings.isSelected() == false) {
            fontWeight = FontWeight.NORMAL;
            totalRatingsLabel.setFont(Font.font(fontStyle, fontWeight, fontSize));
            totalRatingsLabel.setStyle("-fx-text-fill: white;");
        }

        fontWeight = FontWeight.BOLD;
        fontColor = Color.DARKGREY;
        if (boldFormat.isSelected() == false) {
            fontWeight = FontWeight.NORMAL;
            formatLabel.setFont(Font.font(fontStyle, fontWeight, fontSize));
            formatLabel.setStyle("-fx-text-fill: white;");
        }

    }// GEN-LAST:event_boldStarRatingActionPerformed

    private void boldPageNumberActionPerformed(ActionEvent actionEvent) {// GEN-FIRST:event_boldPageNumberActionPerformed
        fontWeight = FontWeight.NORMAL;
        fontColor = Color.WHITE;
        if (boldPageNumber.isSelected()) {
            fontWeight = FontWeight.BOLD;
            pagesLabel.setFont(Font.font(fontStyle, fontWeight, fontSize));
            pagesLabel.setStyle("-fx-text-fill: black;");
        }

        fontWeight = FontWeight.BOLD;
        fontColor = Color.DARKGREY;
        if (boldAuthor.isSelected() == false) {
            fontWeight = FontWeight.NORMAL;
            authorLabel.setFont(Font.font(fontStyle, fontWeight, fontSize));
            authorLabel.setStyle("-fx-text-fill: white;");
        }

        fontWeight = FontWeight.BOLD;
        fontColor = Color.DARKGREY;
        if (boldStarRating.isSelected() == false) {
            fontWeight = FontWeight.NORMAL;
            bookRatingLabel.setFont(Font.font(fontStyle, fontWeight, fontSize));
            bookRatingLabel.setStyle("-fx-text-fill: white;");
        }

        fontWeight = FontWeight.BOLD;
        fontColor = Color.DARKGREY;
        if (boldTitle.isSelected() == false) {
            fontWeight = FontWeight.NORMAL;
            bookTitleLabel.setFont(Font.font(fontStyle, fontWeight, fontSize));
            bookTitleLabel.setStyle("-fx-text-fill: white;");
        }

        fontWeight = FontWeight.BOLD;
        fontColor = Color.DARKGREY;
        if (boldTotalRatings.isSelected() == false) {
            fontWeight = FontWeight.NORMAL;
            totalRatingsLabel.setFont(Font.font(fontStyle, fontWeight, fontSize));
            totalRatingsLabel.setStyle("-fx-text-fill: white;");
        }

        fontWeight = FontWeight.BOLD;
        fontColor = Color.DARKGREY;
        if (boldFormat.isSelected() == false) {
            fontWeight = FontWeight.NORMAL;
            formatLabel.setFont(Font.font(fontStyle, fontWeight, fontSize));
            formatLabel.setStyle("-fx-text-fill: white;");
        }
    }// GEN-LAST:event_boldPageNumberActionPerformed

    private void boldTotalRatingsActionPerformed(ActionEvent actionEvent) {// GEN-FIRST:event_boldTotalRatingsActionPerformed
        fontWeight = FontWeight.NORMAL;
        fontColor = Color.WHITE;
        if (boldTotalRatings.isSelected()) {
            fontWeight = FontWeight.BOLD;
            totalRatingsLabel.setFont(Font.font(fontStyle, fontWeight, fontSize));
            totalRatingsLabel.setStyle("-fx-text-fill: black;");
        }

        fontWeight = FontWeight.BOLD;
        fontColor = Color.DARKGREY;
        if (boldAuthor.isSelected() == false) {
            fontWeight = FontWeight.NORMAL;
            authorLabel.setFont(Font.font(fontStyle, fontWeight, fontSize));
            authorLabel.setStyle("-fx-text-fill: white;");
        }

        fontWeight = FontWeight.BOLD;
        fontColor = Color.DARKGREY;
        if (boldStarRating.isSelected() == false) {
            fontWeight = FontWeight.NORMAL;
            bookRatingLabel.setFont(Font.font(fontStyle, fontWeight, fontSize));
            bookRatingLabel.setStyle("-fx-text-fill: white;");
        }

        fontWeight = FontWeight.BOLD;
        fontColor = Color.DARKGREY;
        if (boldTitle.isSelected() == false) {
            fontWeight = FontWeight.NORMAL;
            bookTitleLabel.setFont(Font.font(fontStyle, fontWeight, fontSize));
            bookTitleLabel.setStyle("-fx-text-fill: white;");
        }

        fontWeight = FontWeight.BOLD;
        fontColor = Color.DARKGREY;
        if (boldPageNumber.isSelected() == false) {
            fontWeight = FontWeight.NORMAL;
            pagesLabel.setFont(Font.font(fontStyle, fontWeight, fontSize));
            pagesLabel.setStyle("-fx-text-fill: white;");
        }

        fontWeight = FontWeight.BOLD;
        fontColor = Color.DARKGREY;
        if (boldFormat.isSelected() == false) {
            fontWeight = FontWeight.NORMAL;
            formatLabel.setFont(Font.font(fontStyle, fontWeight, fontSize));
            formatLabel.setStyle("-fx-text-fill: white;");
        }
    }// GEN-LAST:event_boldTotalRatingsActionPerformed

    private void boldFormatActionPerformed(ActionEvent actionEvent) {// GEN-FIRST:event_boldFormatActionPerformed
        fontWeight = FontWeight.NORMAL;
        fontColor = Color.WHITE;
        if (boldFormat.isSelected()) {
            fontWeight = FontWeight.BOLD;
            formatLabel.setFont(Font.font(fontStyle, fontWeight, fontSize));
            formatLabel.setStyle("-fx-text-fill: black;");
        }

        fontWeight = FontWeight.BOLD;
        fontColor = Color.DARKGREY;
        if (boldAuthor.isSelected() == false) {
            fontWeight = FontWeight.NORMAL;
            authorLabel.setFont(Font.font(fontStyle, fontWeight, fontSize));
            authorLabel.setStyle("-fx-text-fill: white;");
        }

        fontWeight = FontWeight.BOLD;
        fontColor = Color.DARKGREY;
        if (boldStarRating.isSelected() == false) {
            fontWeight = FontWeight.NORMAL;
            bookRatingLabel.setFont(Font.font(fontStyle, fontWeight, fontSize));
            bookRatingLabel.setStyle("-fx-text-fill: white;");
        }

        fontWeight = FontWeight.BOLD;
        fontColor = Color.DARKGREY;
        if (boldTitle.isSelected() == false) {
            fontWeight = FontWeight.NORMAL;
            bookTitleLabel.setFont(Font.font(fontStyle, fontWeight, fontSize));
            bookTitleLabel.setStyle("-fx-text-fill: white;");
        }

        fontWeight = FontWeight.BOLD;
        fontColor = Color.DARKGREY;
        if (boldPageNumber.isSelected() == false) {
            fontWeight = FontWeight.NORMAL;
            pagesLabel.setFont(Font.font(fontStyle, fontWeight, fontSize));
            pagesLabel.setStyle("-fx-text-fill: white;");
        }

        fontWeight = FontWeight.BOLD;
        fontColor = Color.DARKGREY;
        if (boldTotalRatings.isSelected() == false) {
            fontWeight = FontWeight.NORMAL;
            totalRatingsLabel.setFont(Font.font(fontStyle, fontWeight, fontSize));
            totalRatingsLabel.setStyle("-fx-text-fill: white;");
        }
    }// GEN-LAST:event_boldFormatActionPerformed

    private void paperbackButtonActionPerformed(ActionEvent actionEvent) {// GEN-FIRST:event_paperbackButtonActionPerformed
        // TODO add your handling code here:
        format = "Paperback";
        updateBookList();
    }// GEN-LAST:event_paperbackButtonActionPerformed

    private void hardcoverButtonActionPerformed(ActionEvent actionEvent) {// GEN-FIRST:event_hardcoverButtonActionPerformed
        // TODO add your handling code here:
        format = "Hardcover";
        updateBookList();
    }// GEN-LAST:event_hardcoverButtonActionPerformed

    private void ebookButtonActionPerformed(ActionEvent actionEvent) {// GEN-FIRST:event_ebookButtonActionPerformed
        // TODO add your handling code here:
        format = "Ebook";
        updateBookList();
    }// GEN-LAST:event_ebookButtonActionPerformed

    private void audiobookButtonActionPerformed(ActionEvent actionEvent) {// GEN-FIRST:event_audiobookButtonActionPerformed
        // TODO add your handling code here:
        format = "Audiobook";
        updateBookList();
    }// GEN-LAST:event_audiobookButtonActionPerformed

    private void allButtonActionPerformed(ActionEvent actionEvent) {// GEN-FIRST:event_allButtonActionPerformed
        // TODO add your handling code here:
        format = "All";
        updateBookList();
    }// GEN-LAST:event_allButtonActionPerformed

    private void updateBookList() {
        if (bookList < 0) {
            bookList = 0;
        } else if (bookList >= books.size()) {
            bookList = books.size() - 1;
        }
        listOfBooks.setText(("Genre: " + books.get(bookList).getGenre())
                + ("\nDescription: " + books.get(bookList).getDescription()));
        bookRatingLabel.setText("Star Rating: " + books.get(bookList).getBookRating());
        bookTitleLabel.setText("Title: " + books.get(bookList).getTitle());
        authorLabel.setText("Author: " + books.get(bookList).getAuthor());
        totalRatingsLabel.setText("Total Ratings: " + books.get(bookList).getTotalRatings());
        pagesLabel.setText("Page Number: " + books.get(bookList).getPageNumber());
        formatLabel.setText("Format: " + books.get(bookList).getBookFormat());
        listOfBooks.positionCaret(0);
    }

    // private void updateWeight() {
    // fontWeight = Font.PLAIN;
    // if (boldTitle.isSelected()) {
    // fontWeight = fontWeight | Font.BOLD;
    // }
    // if (boldAuthor.isSelected()) {
    // fontWeight = fontWeight| Font.BOLD;
    // }
    // updateFont();
    // }
    //
    // private void updateFont() {
    // Font newFont = new Font(fontStyle, fontWeight, fontSize);
    // bookTitleLabel.setFont(newFont);
    // authorLabel.setFont(newFont);
    // }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RadioButton allButton;
    private RadioButton audiobookButton;
    private Label authorLabel;
    private Button backwardButton;
    private RadioButton boldAuthor;
    private ToggleGroup boldButtonGroup;
    private RadioButton boldFormat;
    private RadioButton boldPageNumber;
    private RadioButton boldStarRating;
    private RadioButton boldTitle;
    private RadioButton boldTotalRatings;
    private Label bookRatingLabel;
    private Slider bookSlider;
    private Label bookTitleLabel;
    private RadioButton ebookButton;
    private ToggleGroup formatButtonGroup;
    private Label formatLabel;
    private Button forwardButton;
    private RadioButton hardcoverButton;
    private TextArea listOfBooks;
    private ScrollPane listOfBooksScroll;
    private Label pagesLabel;
    private RadioButton paperbackButton;
    private Label sliderLabel;
    private Label totalRatingsLabel;
    // End of variables declaration//GEN-END:variables
}
