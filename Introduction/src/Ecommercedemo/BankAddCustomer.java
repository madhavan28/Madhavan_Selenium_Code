package Ecommercedemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BankAddCustomer {

	
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/V4/");
	driver.findElement(By.name("uid")).sendKeys("mngr588079");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("UbEtUpu");
	driver.findElement(By.cssSelector("input[value='LOGIN']")).click();	
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//tr[@class='heading3']//td"))));
	driver.findElement(By.xpath("//a[contains(text(),'New Customer')]")).click();
	driver.findElement(By.xpath("//tbody/tr[4]/td[2]/input")).sendKeys("Madhavan");
	driver.findElement(By.id("dob")).sendKeys("11/28/1997");
	driver.findElement(By.name("addr")).sendKeys("CASAGRAND MIRO");
	driver.findElement(By.cssSelector("input[name='city']")).sendKeys("Chennai");
	driver.findElement(By.xpath("//input[contains(@name,'state')]")).sendKeys("TamilNadu");
	driver.findElement(By.name("pinno")).sendKeys("600048");
	driver.findElement(By.cssSelector("input[name='telephoneno']")).sendKeys("1234567891");
	driver.findElement(By.name("emailid")).sendKeys("madhavan.balaji@hotmail.com");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Madhavan@28");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	
	
	
}
	


}
