package Ecommercedemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElectronicsCartvalidation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.name("password")).sendKeys("learn");
		WebElement stc=driver.findElement(By.xpath("//select[@class='form-control']"));
		Select check=new Select(stc);
		check.selectByValue("teach");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".alert-danger")));
		String validation=driver.findElement(By.cssSelector(".alert-danger")).getText();
		System.out.println(validation);
		driver.close();
		
}
	
	
}
