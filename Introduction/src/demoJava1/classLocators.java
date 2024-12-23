package demoJava1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class classLocators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\mparthasarathi\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("Madhavan@28");
		driver.findElement(By.className("signInBtn")).click();		
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Madhavan");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("madhavan@abc.com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("hello123@g.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("123456");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		driver.findElement(By.className("go-to-login-btn")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("madhavan");
		driver.findElement(By.cssSelector("input[type*='password']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("input[type='checkbox']")).click();
		driver.findElement(By.xpath("//input[@name='chkboxTwo']")).click();
		driver.findElement(By.className("signInBtn")).click();

	}

	

}
