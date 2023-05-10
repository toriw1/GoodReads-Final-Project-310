package edu.guilford;

/**
 * This class is the Book class. It contains the attributes of a book, the
 * constructor, and the getters and setters for the attributes.
 * 
 * This is where the window for BookPanel is created.
 * It also contains the FIleStreamInput method to read the excel file.
 * 
 * @author Tori Williams
 * @version 1.0
 * @since 11/2022
 * 
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import org.apache.poi.ss.usermodel.Cell;
// import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * This class is the BookMain class. It contains the start method for the GUI and reads the excel file.
 * It also contains the main method, which launches the start method.
 * 
 * @param scene
 * @param args
 * @throws IOException
 * @throws URISyntaxException
 * @throws FileNotFoundException
 * 
 */
public class BookMain extends Application {

    /*
     * This is the scene for the GUI.
     */
    private static Scene scene;

    /**
     * This is the start method for the GUI. It reads the excel file and creates the window for the GUI.
     * 
     * @param stage
     * @throws IOException
     * @throws URISyntaxException
     * 
     */
    @Override
    public void start(Stage stage) throws IOException, URISyntaxException {

        /*
         * This is the code to read the excel file.
         */
        // instantiate a class loader object for book main
        ClassLoader classLoader = BookMain.class.getClassLoader();

        // instantiate a string for the path to the excel file
        String excelFilePath = "good_reads_data_for_final_project.xlsx";

        // instantiate a file object for the excel file
        FileInputStream dataFile = new FileInputStream(new File(classLoader.getResource(excelFilePath).getFile()));

        XSSFWorkbook wb = new XSSFWorkbook(dataFile);

        XSSFSheet sheet = wb.getSheetAt(0);

        // FormulaEvaluator fmEval = wb.getCreationHelper().createFormulaEvaluator();

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

            // close the workbook
            wb.close();
        }
        /*
         * This is the code to create the window for the GUI.
         * It also adds the BookPanel to the window.
         * 
         * @param root
         * @param bookWindow
         * @param bookDisplay
         * 
         */
        // Instantiate a VBox root mode
        VBox root = new VBox();

        // Instantiate a BookPanel object and add it to the root node
        root.getChildren().add(new BookPanel(books));
        stage.setTitle("GoodReads Data GUI");
        scene = new Scene(root, 1000, 300);
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

    /**
     * This is the main method. It launches the start method.
     * 
     * @param args
     * @throws FileNotFoundException
     * @throws IOException
     * 
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        launch();
    }
}
