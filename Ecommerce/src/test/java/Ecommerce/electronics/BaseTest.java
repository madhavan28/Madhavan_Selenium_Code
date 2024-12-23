package Ecommerce.electronics;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class BaseTest {

	public static WebDriver driver;
	
	public static WebDriver initializedriver() throws IOException {
		
		Properties prop=new Properties();
		FileInputStream fp=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Ecommerce\\AbstractPageComponents\\GlobalData.properties");
		prop.load(fp);
		String browsername=prop.getProperty("Browser");
		
		if(browsername.contains("Chrome")) {
			
			driver=new ChromeDriver();
		}
		
		if(browsername.contains("Firefox")) {
			
			driver=new FirefoxDriver();
		}
		
	if(browsername.contains("Edge")) {
			
			driver=new EdgeDriver();
		}
		
	return driver;
	}



public static WebDriver Beforemethod() throws IOException {
	WebDriver driver=initializedriver();
	driver.get("https://rahulshettyacademy.com/loginpagePractise/");
	driver.manage().window().maximize();
	return driver;
	
}

@AfterMethod
public void aftermethod() {

driver.close();

}



}

