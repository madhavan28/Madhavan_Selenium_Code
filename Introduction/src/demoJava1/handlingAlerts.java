package demoJava1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class handlingAlerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Madhavan";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("name")).sendKeys(name);
		// driver.findElement(By.id("alertbtn")).click();
		// System.out.println(driver.switchTo().alert().getText());
		// Assert.assertEquals(driver.switchTo().alert().getText(), "Hello Madhavan,
		// share this practice page and share your knowledge");
		// driver.switchTo().alert().accept();
		driver.findElement(By.id("confirmbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		
		handlingAlerts d=new handlingAlerts();
		getScreenshot(driver);

	}
	
	public static void getScreenshot(WebDriver driver) {
		
		driver.get("https://www.google.com/");
	}

}
