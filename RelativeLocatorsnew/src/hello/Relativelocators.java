package hello;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relativelocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement source= driver.findElement(By.cssSelector("input[name='name']"));
		System.out.println(driver.findElement(with(By.tagName("label")).above(source)).getText());
		
		WebElement dob=driver.findElement(By.xpath("//label[text()='Date of Birth']"));
		driver.findElement(with(By.className("form-control")).below(dob)).sendKeys("11/28/1997");
		
		WebElement point=driver.findElement(By.className("form-check-label"));
		driver.findElement(with(By.tagName("input")).toLeftOf(point)).click();
		
		WebElement screw=driver.findElement(By.xpath("//label[@for='inlineRadio1']"));
		driver.findElement(with(By.tagName("input")).toRightOf(screw)).click();
		
		WebElement radio=driver.findElement(By.cssSelector("input[value='option1']"));
		System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(radio)).getText());
		
			
		
		
		
		
		

	}

}
