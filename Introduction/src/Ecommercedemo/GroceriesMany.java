package Ecommercedemo;

import java.time.Duration;
import java.util.List;
import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GroceriesMany {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10)); 
		driver.manage().window().maximize();
		WebElement cart;
		String[] vegetable= {"Cucumber", "Banana" ,"Cauliflower"};
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		List<WebElement> veggies=driver.findElements(By.cssSelector(".product"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@class,'increment')]")));
		
		for(String list:vegetable) {
		
		cart =veggies.stream().filter(veg->veg.findElement(By.cssSelector(".product-name")).getText().contains(list)).findFirst().orElse(null);
		
	
		if(list.equalsIgnoreCase("Banana")) {
			int i=0;
			while(i<5) {
		cart.findElement(By.xpath("//a[contains(@class,'increment')]")).click();
			i++;
			}
		}
		
		cart.findElement(By.cssSelector(".product-action button")).click();	
		}
		
		driver.findElement(By.cssSelector(".cart-icon")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoCode")));
		driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button[class='promoBtn']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='promoInfo']")));
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();
		WebElement str=driver.findElement(By.cssSelector(".products div select"));
		Select st=new Select(str);
		st.selectByVisibleText("India");
		driver.findElement(By.xpath("//input[@class='chkAgree']")).click();
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		driver.close();
		
		
		
		
		
				
}
	
	
}
