package edu.guilford;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Scanner;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BookMain extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException, URISyntaxException {

        // instantiate a scanner object
        Scanner scan;

        // use fileinputstream to read the excel file from the resources folder in the
        // resources folder for this project using getResource method
        FileInputStream dataFile = new FileInputStream(
                new File(
                        "C:\\Users\\victw\\CTIS310\\goodreadsguiproject\\goodreadsguiproject\\src\\main\\resources\\edu\\guilford\\sample_of_goodreads_data_final_project.xlsx"));

        XSSFWorkbook wb = new XSSFWorkbook(dataFile);

        XSSFSheet sheet = wb.getSheetAt(0);

        FormulaEvaluator fmEval = wb.getCreationHelper().createFormulaEvaluator();

        // Be sure to instantiate the books ArrayList before you start reading data from
        // the spreadsheet
        ArrayList<Book> books = new ArrayList<Book>();
        for (Row row : sheet) {

            Cell authorCell = row.getCell(0);
            String theAuthor = authorCell.getStringCellValue();
            // System.out.println(theAuthor);

            //
            Cell titleCell = row.getCell(9);
            String theTitle = titleCell.getStringCellValue();
            // System.out.println(theTitle);

            Cell pageCell = row.getCell(6);
            int thePages = (int) pageCell.getNumericCellValue();
            // System.out.println(thePages);

            Cell formatCell = row.getCell(1);
            String theBookFormat = formatCell.getStringCellValue();
            // System.out.println(theBookFormat);

            Cell genreCell = row.getCell(3);
            String theGenre = genreCell.getStringCellValue();
            // System.out.println(theGenre);

            Cell descCell = row.getCell(2);
            String theDescription = descCell.getStringCellValue();
            // System.out.println(theDescription);

            Cell bookRatingCell = row.getCell(7);
            double theBookRating = (double) bookRatingCell.getNumericCellValue();
            // System.out.println(theBookRating);

            Cell reviewAmtCell = row.getCell(8);
            int theReviewAmount = (int) reviewAmtCell.getNumericCellValue();
            // System.out.println(theReviewAmount);

            Cell totalRatingCell = row.getCell(10);
            int theTotalRatings = (int) totalRatingCell.getNumericCellValue();
            // System.out.println(theTotalRatings);

            // for (Cell cell : row) {
            //
            // switch (fmEval.evaluateInCell(cell).getCellTypeEnum()) {
            //
            // case NUMERIC:
            //
            // System.out.print(cell.getNumericCellValue() + "\t\t");
            // break;
            //
            // case STRING:
            // System.out.print(cell.getStringCellValue() + "\t\t");
            //
            // break;
            //
            // }
            //
            // }
            // System.out.println();

            Book theBook = new Book(theAuthor, theBookFormat, "\n" + theDescription, "\n" + theGenre,
                    "\n" + theTitle, thePages, theBookRating, theReviewAmount, theTotalRatings);
            // theBook.setAuthor(theAuthor);
            // theBook.setPageNumber(thePages);
            // theBook.setTitle(theTitle);
            books.add(theBook);
            // System.out.println(theBook);

            // System.out.println(books.get(0));
            // System.out.println("\nThe size of the list is " + books.size());
        }
        // Instantiate a VBox root mode
        VBox root = new VBox();

        // Instantiate a BookPanel object and add it to the root node
        root.getChildren().add(new BookPanel(books));
        scene = new Scene(root, 1000, 800);
        stage.setScene(scene);
        stage.show();

        // // use Stage to create the GUI
        // Stage bookWindow = new Stage();
        // bookWindow.setTitle("GoodReads Data GUI");
        // bookWindow.show();

        // // instantiate the BookPanel
        // BookPanel bookDisplay = new BookPanel(books);
        // bookWindow.setScene(bookDisplay.getScene());
        // bookWindow.show();
    }

    public static void main(String[] args) throws FileNotFoundException, IOException {
        launch();
    }
}
