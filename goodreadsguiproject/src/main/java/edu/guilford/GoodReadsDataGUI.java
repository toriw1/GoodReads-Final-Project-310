package edu.guilford;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFrame;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GoodReadsDataGUI {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner scan;

        FileInputStream dataFile = new FileInputStream(new File("good reads data for final project.xlsx"));

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

//            for (Cell cell : row) {
//
//                switch (fmEval.evaluateInCell(cell).getCellTypeEnum()) {
//
//                    case NUMERIC:
//
//                        System.out.print(cell.getNumericCellValue() + "\t\t");
//                        break;
//
//                    case STRING:
//                        System.out.print(cell.getStringCellValue() + "\t\t");
//
//                        break;
//
//                }
//
//            }
            System.out.println();

            Book theBook = new Book(theAuthor, theBookFormat, "\n" + theDescription, "\n" + theGenre,
                    "\n" + theTitle, thePages, theBookRating, theReviewAmount, theTotalRatings);
//            theBook.setAuthor(theAuthor);
//            theBook.setPageNumber(thePages);
//            theBook.setTitle(theTitle);
            books.add(theBook);
            System.out.println(theBook);

            // System.out.println(books.get(0));
            System.out.println("\nThe size of the list is " + books.size());
        }

        JFrame bookWindow = new JFrame("Books");
        bookWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BookPanel bookDisplay = new BookPanel(books);
        bookWindow.getContentPane().add(bookDisplay);
        bookWindow.pack();
        bookWindow.setVisible(true);
    }
}
