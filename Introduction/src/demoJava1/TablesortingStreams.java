package demoJava1;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.Streams;

public class TablesortingStreams {

	//@Test
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		//Click on the column
		driver.findElement(By.className("sort-icon")).click();
		//Grab all the vegetables name 
		List<WebElement> veggies=	driver.findElements(By.xpath("//tbody/tr/td[1]"));
		//Get the Text for all the vegetables
		List<String> cart=veggies.stream().map(b->b.getText()).collect(Collectors.toList());
		//Sort the new list
		List<String> section=cart.stream().sorted().collect(Collectors.toList());
	
		Assert.assertEquals(cart, section);
		driver.quit();
	}

	@Test
	public static void prices() {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.className("sort-icon")).click();
		//List<WebElement> veggies=driver.findElements(By.xpath("//tbody/tr/td[1]"));
		List<String> price;
		
		do {
			
		List<WebElement> rows=driver.findElements(By.xpath("//tbody/tr/td[1]"));
		price=rows.stream().filter(s->s.getText().contains("Rice")).map(s->getprices(s)).collect(Collectors.toList());
		
		price.forEach(a->System.out.println(a));
		
		if(price.size()<1) {
			
			driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
		}
		}while(price.size()<1);
		
	}

	private static String getprices(WebElement s) {
		// TODO Auto-generated method stub
		
	String pricevalue=s.findElement(By.xpath("following-sibling::td[1]")).getText();
		
		
		return pricevalue;
	}
	
}
