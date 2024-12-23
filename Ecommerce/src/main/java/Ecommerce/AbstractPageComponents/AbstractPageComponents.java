package Ecommerce.AbstractPageComponents;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractPageComponents {

	public WebDriver driver;
	public AbstractPageComponents(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	

		public void visibilityofelement(By findby) {
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));	
		wait.until(ExpectedConditions.visibilityOfElementLocated(findby));
		
	}	
	
		
		
		public void invisibilityOfElement(By findby) {
			
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.invisibilityOfElementLocated(findby));
		}
		

		public String getscreenshot() throws IOException {
			
			File Src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(Src,new File("C:\\Users\\mparthasarathi\\eclipse-workspace\\Ecommerce\\Ecommerce.png"));
			return "C:\\Users\\mparthasarathi\\eclipse-workspace\\Ecommerce\\Ecommerce.png";
			
		}
}
