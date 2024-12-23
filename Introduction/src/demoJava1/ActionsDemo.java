package demoJava1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ActionsDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Actions a=new Actions(driver);
		
		WebElement move=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[id='twotabsearchtextbox']")));
		a.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("Hello").doubleClick().build().perform();
		//Move to specific element
		a.moveToElement(move).contextClick().build().perform();
		
		
	
		
	}

}
