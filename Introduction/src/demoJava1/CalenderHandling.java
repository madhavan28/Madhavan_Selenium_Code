package demoJava1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CalenderHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String month="11";
		String day="28";
		String year="2027";
		String[] expected= {month,day,year};
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.cssSelector(".react-date-picker__inputGroup")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
		driver.findElement(By.xpath("//button[text()='"+year+"']")).click();
		driver.findElements(By.cssSelector(".react-calendar__year-view__months__month")).get(Integer.parseInt(month)-1).click();
		driver.findElement(By.xpath("//abbr[text()='"+day+"']")).click();
		List<WebElement> calender=driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
		
		for(int i=0;i<calender.size();i++) {
			
			//System.out.println(calender.get(i).getAttribute("value")); 
			Assert.assertEquals(calender.get(i).getAttribute("value"),expected[i]);
			System.out.println("Test is passed");
			
			
		}
	
		
	}

}
