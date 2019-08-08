package POITest;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;

public class ExcelRead {

    public static void main(String[] args) throws Exception {
        //creating a file
        //import from java.io
        File file = new File("src/sampleData.xlsx");
        //file.exist() method checks the given path and returns true if file is found
        System.out.println(file.exists());

        FileInputStream fileInputStream=new FileInputStream(file);

        XSSFWorkbook workbook=new XSSFWorkbook(fileInputStream);

        XSSFSheet sheet = workbook.getSheet("Employee");

        System.out.println(sheet.getRow(2).getCell(1));

        int usedRows = sheet.getPhysicalNumberOfRows();
        System.out.println("getPhysicalNumberOfRows: " + usedRows);

        int lastUsedRow = sheet.getLastRowNum();
        System.out.println("getLastRowNum: " + lastUsedRow);

//        //TODO: CREATE A LOGIC THAT PRINTS OUT "NEENA" NAME DYNAMICALLY
//​
//        for (int rowNum=0; rowNum<usedRows; rowNum++){
//            if(sheet.getRow(rowNum).getCell(0).toString().equals("Aijan")){
//                System.out.println(sheet.getRow(rowNum).getCell(0));
//            }
//        }
//
//        //TODO: CREATE A LOGIC THAT PRINTS OUT "ADAMS" JOB_ID DYNAMICALLY
//
//        for(int rowNum=0; rowNum<usedRows; rowNum++){
//            if (sheet.getRow(rowNum).getCell(0).toString().equals("Nurali")){
//                System.out.println("JOB_ID of Nurali: "+ sheet.getRow(rowNum).getCell(2));
//            }
//        }

    }
}
