package Ecommercedemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Ecommerce {

	@Test
	public static void main(String[] args) throws InterruptedException {
	String product="Sauce Labs Fleece Jacket";
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com/");
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("secret_sauce");
	driver.findElement(By.cssSelector("input[id='login-button']")).click();
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[text()='Swag Labs']"))));
	driver.findElement(By.xpath("//button[contains(@name,'fleece-jacket')]")).click();
	driver.findElement(By.cssSelector("a[data-test='shopping-cart-link']")).click();
	String checkout=driver.findElement(By.xpath("//div[@data-test='inventory-item-name']")).getText();
	Assert.assertEquals(checkout, product);
	driver.findElement(By.id("checkout")).click();
	driver.findElement(By.xpath("//div[@class='checkout_info']/div[1]/input")).sendKeys("Madhavan");
	driver.findElement(By.xpath("//div[@class='checkout_info']/div[2]/input")).sendKeys("Parthasarathi");
	driver.findElement(By.xpath("//div[@class='checkout_info']/div[3]/input")).sendKeys("600048");
	driver.findElement(By.name("continue")).click();
	driver.findElement(By.name("finish")).click();
	String message=driver.findElement(By.cssSelector("h2[class*='complete-header']")).getText();
	Assert.assertEquals("Thank you for your order!", message);
	driver.close();

}
	
	@Test
	public void errorvalidation() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("secret");
		
	}

}
