package demoJava1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Scrollingthewindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)");
		
		Thread.sleep(5000);
		js.executeScript("document.querySelector(\".tableFixHead\").scrollBy(0,100)");
		
		List<WebElement> table=driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		
		int j=0;
		
		for(int i=0;i<table.size();i++) {
			
	
		j=j+Integer.parseInt(table.get(i).getText());
		
		
			
		}
		
		System.out.println(j);
		
	int results=Integer.parseInt(driver.findElement(By.xpath("//div[@class='totalAmount']")).getText().split(":")[1].trim());
		
		Assert.assertEquals(j, results);
		System.out.println("this test is passed");
		}

}
