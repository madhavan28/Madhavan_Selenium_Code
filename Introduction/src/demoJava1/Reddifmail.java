package demoJava1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Reddifmail {

	@Test
	public void usercreation() {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.cssSelector("#login-button")).click();
		List<WebElement> products=driver.findElements(By.cssSelector(".inventory_item"));
		
	}
}
