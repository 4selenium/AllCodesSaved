package ClassRoomWork;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ReadExcel {

    @Test
    public void myTest1() throws Exception{
        Workbook workbook = new XSSFWorkbook(new FileInputStream("C:\\Selenium Jar\\SheetforTesting.xlsx"));
        Sheet sheet = workbook.getSheetAt(0);

        for(int i =0;i<sheet.getPhysicalNumberOfRows();i++){
            String myData2=sheet.getRow(i).getCell(0).getStringCellValue();
            System.out.println(myData2);
            String result= "pass";
            sheet.getRow(i).createCell(1).setCellValue(result);
        }
        workbook.write(new FileOutputStream("C:\\Selenium Jar\\SheetforTesting.xlsx"));
        workbook.close();





    }
}
