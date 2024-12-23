package Ecommercedemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ElectronicsCart {

	public static void main(String[] args) throws InterruptedException {
		String goods="Samsung Note 8";
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.name("password")).sendKeys("learning");
		WebElement stc=driver.findElement(By.xpath("//select[@class='form-control']"));
		Select check=new Select(stc);
		check.selectByValue("teach");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".my-4")));
		List<WebElement> cart=driver.findElements(By.cssSelector(".mb-3"));
		WebElement prod=cart.stream().filter(product->product.findElement(By.cssSelector(".card-title a")).getText().equalsIgnoreCase(goods)).findFirst().orElse(null);
		prod.findElement(By.cssSelector(".card-footer button")).click();
		driver.findElement(By.cssSelector(".btn-primary")).click();
		String cartpage=driver.findElement(By.cssSelector(".media-body h4 a")).getText();
		Assert.assertEquals(cartpage, goods);
		Actions act=new Actions(driver);
		act.click(driver.findElement(By.id("exampleInputEmail1"))).doubleClick().sendKeys("2").build().perform();
		driver.findElement(By.cssSelector(".btn-success")).click();
		driver.findElement(By.id("country")).sendKeys("India");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".suggestions li a")));
		driver.findElement(By.cssSelector(".suggestions li a")).click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".suggestions li a")));
		driver.findElement(By.xpath("//label[@for='checkbox2']")).click();
		driver.findElement(By.cssSelector("input[value='Purchase']")).click();
		String successmessage=driver.findElement(By.cssSelector(".alert-success")).getText();
		System.out.println(successmessage);
		driver.close();
		
		
		
}
	
	public static void loginvalidation() {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.name("password")).sendKeys("learn");
		String validation=driver.findElement(By.cssSelector(".alert-danger strong")).getText();
		System.out.println(validation);
	}

	
}
