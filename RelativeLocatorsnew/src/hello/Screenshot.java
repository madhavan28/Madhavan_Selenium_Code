package hello;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		Set<String> st=driver.getWindowHandles();
		Iterator<String> it=st.iterator();
		String tab1=it.next();
		String tab2=it.next();
		driver.switchTo().window(tab2);
		driver.get("https://rahulshettyacademy.com/");
		String input=driver.findElement(By.xpath("(//div[@class='upper-box']/h2/a)[2]")).getText();
		driver.switchTo().window(tab1);
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys(input);
		
		WebElement src=driver.findElement(By.xpath("//input[@name='name']"));
		File pic=src.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(pic, new File("og.png"));
		
		
	}

}
