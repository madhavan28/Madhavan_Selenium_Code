package demoJava1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Uploaddownload {
	
	DataFormatter formatter=new DataFormatter();

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		String fruit="Apple";
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		driver.get("https://rahulshettyacademy.com/upload-download-test/index.html");
		
		//download
		
		driver.findElement(By.id("downloadButton")).click();
		
		int Columnnumber=getColumnnumber("Price","C:\\Users\\mparthasarathi\\Desktop\\download.xlsx");
		int Rownumber=getrownumber("C:\\Users\\mparthasarathi\\Desktop\\download.xlsx","Apple");
		Assert.assertTrue(updateCell("C:\\Users\\mparthasarathi\\Desktop\\download.xlsx",Columnnumber,Rownumber,"800"));
		
		//upload 
		
		WebElement upload=driver.findElement(By.cssSelector("input[type='file']"));
		upload.sendKeys("C:\\Users\\mparthasarathi\\Desktop\\download.xlsx");
		
		//wait for success message and wait for message to disappear
		By message=By.xpath("//div[@class='Toastify__toast-body']/div[2]");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(message));
		String messageappear=driver.findElement(message).getText();
		Assert.assertEquals(messageappear, "Updated Excel Data Successfully.");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(message));
		String column=driver.findElement(By.xpath("//div[text()='Price']")).getAttribute("data-column-id");
		String price=driver.findElement(By.xpath("//div[text()='"+fruit+"']/parent::div/parent::div/div[@id='cell-"+column+"-undefined']")).getText();
		Assert.assertEquals(price,"800");
		
		
	
		
		
}

	
	public 	static boolean updateCell(String Path,int Columnnumber,int Rownumber,String updatevalue) throws IOException {
		
		FileInputStream file=new FileInputStream(Path);
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet= workbook.getSheetAt(0);
		Row rowField=sheet.getRow(Rownumber);
		Cell cellField=rowField.getCell(Columnnumber);
		cellField.setCellValue(updatevalue);
		FileOutputStream fos=new FileOutputStream(Path);
		workbook.write(fos);
		workbook.close();
		file.close();
		return true;
		
		
		
		
	}
	
	public static int getColumnnumber(String testcase,String Path) throws IOException {
		
		FileInputStream file=new FileInputStream(Path);
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet= workbook.getSheetAt(0);
		Iterator<Row> rows=sheet.iterator();
		Row firstrow=rows.next();
		Iterator<Cell> cells=firstrow.cellIterator();
		int j=0;
		int k=0;
		while(cells.hasNext()) {
			
			Cell firstcell=cells.next();
			if(firstcell.getStringCellValue().equalsIgnoreCase(testcase)) {
				j=k;
			}
			k++;
		}
		
		System.out.println(j);
		return j;
	}
	
	
	public static int getrownumber(String Path , String fruit) throws IOException {
		
		FileInputStream file=new FileInputStream(Path);
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheetAt(0);
		Iterator<Row> row=sheet.iterator();
		
		int j=0;
		int k=0;
		while(row.hasNext()) {
		Row firstrow=row.next();	
		Iterator<Cell> cell=firstrow.cellIterator();
			while(cell.hasNext()) {
				Cell cells=cell.next();
				if(cells.getCellType()== CellType.STRING && cells.getStringCellValue().equalsIgnoreCase(fruit)) {
					
					j=k;
					
				}
				
			}
			
			k++;	
		}
		System.out.println(j);
		return j;
		

		}
		
	
	}	

	

