package ExcelandTestNG.Dataprovider;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class excelTesNG {
DataFormatter dataformat=new DataFormatter();

@Test(dataProvider="sampledata")
public void getData(String greetings ,String Communication , String year) {
	
	System.out.println("this is the way we greet"+" "+greetings+"via"+Communication+"in the year"+year);
	
}
	

@DataProvider(name="sampledata")
public Object[][] providedata() throws IOException {
		
	FileInputStream fis=new FileInputStream("C:\\Users\\mparthasarathi\\Desktop\\Book2.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet sheet=wb.getSheetAt(0);
	int rows=sheet.getPhysicalNumberOfRows();
	XSSFRow firstrow=sheet.getRow(0);
	int columns=firstrow.getLastCellNum();
	Object data[][]=new Object[rows-1][columns];

	for(int i=0;i<rows-1;i++) {
	
		firstrow=sheet.getRow(i);
		
		for(int j=0;j<columns;j++) {
					
			XSSFCell cell=firstrow.getCell(j);
			data[i][j]=dataformat.formatCellValue(cell);
				
		}
		
		
	}
	return data;
 
}
	
}
