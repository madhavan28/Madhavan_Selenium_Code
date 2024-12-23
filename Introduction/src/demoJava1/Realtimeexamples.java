package demoJava1;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Realtimeexamples {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//count to number of links on the given page-- all the tags in the HTML will always have "a" tag , anchor link
	
		int names=driver.findElements(By.tagName("a")).size();
		System.out.println(names);
		
		//get the number of links on the footer section of the given page using limiting webdriver scope
		WebElement footerdriver=driver.findElement(By.xpath("//div[@id='gf-BIG']"));//limited webdriver
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		WebElement footersubdriver=footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(footersubdriver.findElements(By.tagName("a")).size());
		int links=footersubdriver.findElements(By.tagName("a")).size();
		
		//click on the links in the column and check if those are opening the windows
		for(int i=1;i<links;i++) {
			
			String clickonlinks=Keys.chord(Keys.CONTROL,Keys.ENTER);
			footersubdriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinks);
			Thread.sleep(5000);
		}
			Set<String> window=driver.getWindowHandles();
			Iterator<String> it=window.iterator();
		
			while(it.hasNext()) {
				
			String name=it.next();
			driver.switchTo().window(name);
			System.out.println(driver.getTitle());
			
		
			
			}

			
		}
		

		
		
	}


