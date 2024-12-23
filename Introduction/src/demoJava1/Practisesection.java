package demoJava1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Practisesection {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		 String path=System.getProperty("user.dir");
		 HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		 chromePrefs.put("profile.default_content_settings.popups", 0);
	     chromePrefs.put("download.default_directory",path);
	     ChromeOptions c=new ChromeOptions();
		 c.setExperimentalOption("prefs", chromePrefs);
		 WebDriver driver=new ChromeDriver(c);
	     driver.manage().window().maximize();
	     driver.get("https://www.ilovepdf.com/pdf_to_word");
	     driver.findElement(By.xpath("//div[@id='uploader']/a/span")).click();
	     Thread.sleep(5000);
	     Runtime.getRuntime().exec("C:\\Users\\mparthasarathi\\Desktop\\fileupload2.exe");
	     WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(60));
	    // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='processTask']/span[1]")));
	     wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#processTaskTextBtn")));
	     driver.findElement(By.cssSelector("#processTaskTextBtn")).click();
	     wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#pickfiles")));
	     driver.findElement(By.cssSelector("#pickfiles")).click();
	     File f=new File(path+"/SVMX 101 Admin.docx");
	     if(f.exists()) {
	    	 
	    	 System.out.println("File is found");
	    	 
	     }
	     
	     
		
}

}