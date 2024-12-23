package demoJava1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class windowactivies {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mparthasarathi\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		System.out.println(driver.findElement(By.xpath("//a[@id='opentab']/parent::fieldset")).getText());

	}

}
