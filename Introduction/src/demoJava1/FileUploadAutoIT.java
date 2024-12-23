package demoJava1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUploadAutoIT {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		String downloadpath=System.getProperty("user.dir");
		System.out.println(downloadpath);
		 HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		 chromePrefs.put("profile.default_content_settings.popups", 0);
	     chromePrefs.put("download.default_directory", downloadpath);
	     ChromeOptions c=new ChromeOptions();
	     c.setExperimentalOption("prefs", chromePrefs);   
	     WebDriver driver=new ChromeDriver(c);
	     driver.manage().window().maximize();
	     driver.get("https://www.ilovepdf.com/pdf_to_word");
	     driver.findElement(By.xpath("//div[@id='uploader']/a/span")).click();
	     Thread.sleep(5000);
	     Runtime.getRuntime().exec("C:\\Users\\mparthasarathi\\Desktop\\fileupload1.exe");
	     WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(60));
	    // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='processTask']/span[1]")));
	     wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#processTaskTextBtn")));
	     driver.findElement(By.cssSelector("#processTaskTextBtn")).click();
	     wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#pickfiles")));
	     driver.findElement(By.cssSelector("#pickfiles")).click();
	     Thread.sleep(5000);
	     File f=new File(downloadpath+"/Cert3492351_Associate_20230624.docx");
	     
	     
	     if(f.exists()) {  
		   
		   System.out.println("File is found in the system");
		   
		   if(f.delete()) {
			   
			   System.out.println("File was deleted");
		   }
	   }
	    
		
		driver.close();
	}

}
