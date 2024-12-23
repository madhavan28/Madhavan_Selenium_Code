package hello;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class PractiseSection {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		//DYNAMIC LOCATORS
		WebElement source=driver.findElement(By.id("exampleInputPassword1"));
		System.out.println(driver.findElement(with(By.tagName("label")).above(source)).getText());
		
		WebElement src=driver.findElement(By.xpath("//label[text()='Password']"));
		driver.findElement(with(By.id("exampleInputPassword1")).below(src)).sendKeys("Stonecold@0");
		
		WebElement fall=driver.findElement(By.xpath("//label[text()='Employment Status: ']"));
		driver.findElement(with(By.tagName("input")).toRightOf(fall)).click();
		
		WebElement ui=driver.findElement(By.className("form-check-label"));
		driver.findElement(with(By.tagName("input")).toLeftOf(ui)).click();
		
		//OPENING NEW TAB OR  WINDOW
		driver.switchTo().newWindow(WindowType.TAB);
		Set<String> sj=driver.getWindowHandles();
		Iterator<String> it=sj.iterator();
		String link1=it.next();
		String link2=it.next();
		
		driver.switchTo().window(link2);
		driver.get("https://rahulshettyacademy.com/");
		String input=driver.findElement(By.xpath("//div/div/h2")).getText();
		String pwd=input.split("&")[1].trim().split("your")[1].trim();
		driver.switchTo().window(link1);
		WebElement name=driver.findElement(By.cssSelector("input[name='name']"));
		name.sendKeys(pwd);
		
		//TAKING SCREENSHOT
		File ss=name.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(ss, new File("ot.png"));
		
		//Getting height and width of WebElement
		System.out.println(name.getSize());
		
			
		
	}

}
