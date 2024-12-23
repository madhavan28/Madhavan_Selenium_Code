package demoJava1;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AutoSuggestionsfilters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.id("search-field")).sendKeys("Potato");
		List<WebElement> result=driver.findElements(By.xpath("//tbody/tr/td[1]"));
		List<WebElement> cart=result.stream().filter(veggie->veggie.getText().contains("Potato")).collect(Collectors.toList());
		Assert.assertEquals(result.size(), cart.size());
		

	}

}
