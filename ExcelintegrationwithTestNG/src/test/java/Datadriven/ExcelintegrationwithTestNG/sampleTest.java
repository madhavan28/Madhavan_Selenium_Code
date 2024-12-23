package Datadriven.ExcelintegrationwithTestNG;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class sampleTest {

@Test
public void getExcel() throws IOException {
	

	FileInputStream fis=new FileInputStream("C:\\Users\\mparthasarathi\\Desktop\\Book1.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet sheet=wb.getSheetAt(0);
	int rowcount=sheet.getPhysicalNumberOfRows();
	XSSFRow row=sheet.getRow(0);
	int columncount=row.getLastCellNum();
	Object data[][]=new Object[rowcount-1][columncount];
	for(int i=0;i<rowcount-1;i++) {
		
		row=sheet.getRow(i+1);
		for(int j=0;j<columncount;j++) {
			
			System.out.println(row.getCell(j));
			
		}
	}
}


}
