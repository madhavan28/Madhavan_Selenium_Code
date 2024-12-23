package demoJava1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
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

public class downloadnadupdatingdata {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/upload-download-test/index.html");
		
		//downloading 
		
		driver.findElement(By.cssSelector("#downloadButton")).click();
		
		String path="C:\\Users\\mparthasarathi\\Desktop\\download.xlsx";
		String testcase="Price";
		int columnnumber=getcolumnnumber(path,"Price");
		int rownumber=getrownumber(path,"Apple");
		String updatevalue="1000";
		updatecell(path,columnnumber,rownumber,updatevalue);
		
		//uploading
	
		WebElement uploadbtn=driver.findElement(By.cssSelector("input[type='file']"));
		
		uploadbtn.sendKeys("C:\\Users\\mparthasarathi\\Desktop\\download.xlsx");
		
		//validating the message displayed
		By message=By.xpath("//div[@class='Toastify__toast-body']/div[2]");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(message));
		String messagedisplay= driver.findElement(message).getText();
		Assert.assertEquals(messagedisplay, "Updated Excel Data Successfully.");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(message));
		String fruit="Apple";
		String pricecolumn=driver.findElement(By.xpath("//div[text()='Price']")).getAttribute("data-column-id");
		String price=driver.findElement(By.xpath("//div[text()='"+fruit+"']/parent::div/parent::div/div[@id='cell-"+pricecolumn+"-undefined']")).getText();
		System.out.println(price);
		Assert.assertEquals(price,"1000");

		
		
		
		
	}
	
	
	public static boolean updatecell(String path,int columnnumber,int rownumber,String updatedvalue) throws IOException {
		FileInputStream file=new FileInputStream(path);
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheetAt(0);
		XSSFRow row=sheet.getRow(rownumber);
		XSSFCell cell=row.getCell(columnnumber);
		cell.setCellValue(updatedvalue);
		FileOutputStream fo=new FileOutputStream(path);
		fo.close();
		file.close();
		return true;
		
		
	}
	
	public static int getcolumnnumber(String path,String testcase) throws IOException {
		FileInputStream file=new FileInputStream(path);
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheetAt(0);
		Iterator<Row> row=sheet.iterator();
		Row firstrow=row.next();
		Iterator<Cell> cell=firstrow.cellIterator();
		int j=0;
		int k=0;
		while(cell.hasNext()) {
			Cell firstcell=cell.next();
			if(firstcell.getStringCellValue().equalsIgnoreCase(testcase)) {
				
				j=k;
				
			}
			k++;
			
		}
		System.out.println(j);
		return j;
	}

	
	public static int getrownumber(String path,String fruit) throws IOException {
		
		FileInputStream file=new FileInputStream(path);
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheetAt(0);
		Iterator<Row> row=sheet.iterator();
		
		int j=0;
		int k=0;
		while(row.hasNext()) {
		Row firstrow=row.next();	
		Iterator<Cell> cells=firstrow.cellIterator();
		while(cells.hasNext()) {
			
			Cell firstcell=cells.next();
			if(firstcell.getCellType()== CellType.STRING && firstcell.getStringCellValue().equalsIgnoreCase(fruit)) {
				j=k;
				
			}
		
		}
	
		k++;
		}
		System.out.println(j);
		return j;
	}
	
	
}
