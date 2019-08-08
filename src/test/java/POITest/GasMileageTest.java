package POITest;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;
import utilities.Driver;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class GasMileageTest {

    XSSFWorkbook workbook;
    XSSFSheet sheet;
    FileInputStream fileInputStream;
    FileOutputStream fileOutputStream;


    @Test
    public void gasMileageCalculatorTest()throws Exception{

        Driver.getDriver().get("https://www.calculator.net/gas-mileage-calculator.html");
        String path="src/test/resources/testData/GasMileageTestData.xlsx";
        fileInputStream=new FileInputStream(path);
        //loading the workbook to class
        workbook=new XSSFWorkbook(fileInputStream);

    }
}
