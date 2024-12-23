package demoJava1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Ecommerceexample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2)); //implicit wait
		//explicit wait
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.manage().window().maximize();
		String[] veggies= {"Cucumber","Beetroot","Brocolli","Carrot"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);
		Ecommerceexample b=new Ecommerceexample();
		b.Cartvegetables(driver, veggies);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		//explicit wait
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Code applied ..!']")));
		System.out.println(driver.findElement(By.xpath("//span[text()='Code applied ..!']")).getText());
		Assert.assertEquals(driver.findElement(By.xpath("//span[text()='Code applied ..!']")).getText(), "Code applied ..!");
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();
		WebElement staticdrp=driver.findElement(By.xpath("//div/select"));
		Select drp=new Select(staticdrp);
		drp.selectByVisibleText("India");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input.chkAgree")).click();
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		
		
		
		}
		
	public  void Cartvegetables(WebDriver driver,String[] veggies) {
		
		List<WebElement> products= driver.findElements(By.cssSelector("h4.product-name"));
		
		
		for(int i=0;i<products.size();i++) {
			
			String[] name=products.get(i).getText().split("-");
			String formattedname=name[0].trim();
			List<String> items = Arrays.asList(veggies);
			
			int j=0;
			
			
			if(items.contains(formattedname)) {
				
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				
				
				if(j==veggies.length) {
					
					break;
				}
				
				
			}
		}
	}
	}


