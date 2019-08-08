package POITest;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.SQLOutput;

public class ExcelWrite {
    public static void main(String[] args) throws Exception {

//        XSSFWorkbook workbook;
//        XSSFSheet sheet;
//        XSSFRow row;
//        XSSFCell cell;
//
//        String path="src/sampleData.xlsx";
//
//        //opening and loading the in the given path
//        FileInputStream fileInputStream = new FileInputStream(path);
//
//        //loading the workbook to class
//        workbook = new XSSFWorkbook(fileInputStream);
//        //providing the specific sheet that we want to work on from this workbook
//        sheet = workbook.getSheet("Employee");
//        //we are selecting and saving the row
//        row = sheet.getRow(1);
//        //selecting the cell from the selected row
//        cell = row.getCell(1);
//​
//        System.out.println("Albina's lastname: " + cell.toString());
//​
//        XSSFCell adamCell = sheet.getRow(2).getCell(0);
//        System.out.println("BEFORE: " + adamCell.toString());
//        adamCell.setCellValue("Trump");
//​
//​
//        //for when you are sending a value to a file
//        FileOutputStream fileOutputStream = new FileOutputStream(path);
//        //this is the line that is executing and writing to the file
//        workbook.write(fileOutputStream);
//​
//        System.out.println("AFTER: " + adamCell.toString());
//​
//​
//​
//        workbook.close();
//        fileInputStream.close();
//        fileOutputStream.close();



    }
}
