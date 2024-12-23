package demoJava1;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childwindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		//Actions a=new Actions(driver);
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set<String> windows=driver.getWindowHandles();//[parent window,child window]
		Iterator<String> rt=windows.iterator();
		String parent=rt.next();
		String child=rt.next();
		driver.switchTo().window(child);
	//	System.out.println(driver.findElement(By.xpath("//a[text()='mentor@rahulshettyacademy.com']")).getText());
		String email= driver.findElement(By.cssSelector(".im-para.red")).getText();
		String[] template=email.split("with");
		String[] temp1=template[0].split("at");
		String finaladdress=temp1[1].trim();
		driver.switchTo().window(parent);
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys(finaladdress);
	
		
		
		
		
		
	}

}
