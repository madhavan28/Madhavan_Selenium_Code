package Datadriven.ExcelintegrationwithTestNG;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
	
	DataFormatter formatter=new DataFormatter();
	
	@Test(dataProvider="drivetest")
	public void testCaseData(String greeting, String communication , String id) {

		System.out.println(greeting+" "+communication+" "+id);
	}
	
	
	@DataProvider(name="drivetest")
	public Object[][] getData() throws IOException {
		

		
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
				
				XSSFCell cell=row.getCell(j);
				data[i][j]=formatter.formatCellValue(cell);
			}
		}
	
		return data;
	}
	

}
