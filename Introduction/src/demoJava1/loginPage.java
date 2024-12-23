package demoJava1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class loginPage {

	public static void main(String[] args) throws InterruptedException {
		String name="Madhavan";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mparthasarathi\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
     	WebDriver driver = new ChromeDriver();
//		System.setProperty("webdriver.edge.driver", "C:\\Users\\mparthasarathi\\Documents\\edgedriver_win64 (1)\\msedgedriver.exe");
//		WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String finalpwd=getpassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(finalpwd);
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		Thread.sleep(2000);
		//System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.tagName("h2")).getText(), "Hello "+name+",");
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='overlay-panel overlay-right']/button")).click();
		Thread.sleep(5000);
		driver.quit();
		}


	public static String getpassword(WebDriver driver) throws InterruptedException {
		
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String passwordtext=driver.findElement(By.cssSelector("form p")).getText();
		//Please use temporary password 'rahulshettyacademy' to Login.
		String[] passwordtext1= passwordtext.split("'");
		//['Please use temporary password ' , 'rahulshettyacademy' to Login.'
		String passwordtext2=passwordtext1[1].split("'") [0];
		return passwordtext2;
		
	}
	



}




