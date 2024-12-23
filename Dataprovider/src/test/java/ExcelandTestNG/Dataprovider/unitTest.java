package ExcelandTestNG.Dataprovider;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class unitTest {

	@Test
	public void sampletest() throws IOException {
		
		FileInputStream fis=new FileInputStream("C:\\Users\\mparthasarathi\\Desktop\\Book2.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheetAt(0);
		int rows=sheet.getPhysicalNumberOfRows();
		XSSFRow firstrow=sheet.getRow(0);
		int columns=firstrow.getLastCellNum();
		Object data[][]=new Object[rows-1][columns];

		for(int i=0;i<rows-1;i++) {
		
			firstrow=sheet.getRow(i+1);
			
			for(int j=0;j<columns;j++) {
			
				System.out.println(firstrow.getCell(j));
				
			}
			
		}
		
		
		
	}
}
