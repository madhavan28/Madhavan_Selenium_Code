package demoJava1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SFDC {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://test.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("madhavan24dot2@part2.com");
		driver.findElement(By.id("password")).sendKeys("Stonecold@0");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//button[@title='App Launcher']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div/input[@type='search']")).sendKeys("Servicemax Setup");
//		driver.findElement(By.xpath("//a[text()='ServiceMax Setup']")).click();
//		driver.findElement(By.xpath("//div[text()='Scheduling & Optimization']")).click();
//		driver.findElement(By.cssSelector("div[onmouseover*='javascript:MTTSRules()']")).click();
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(1000));
//		driver.findElement(By.xpath("//td[@class='pbButton ']/input[1]")).click();
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tr[@class='dataRow odd last']/td[2]/input")));
//		driver.findElement(By.xpath("//tr[@class='dataRow odd last']/td[2]/input")).sendKeys("Selenium Rule");
//		WebElement drp=driver.findElement(By.xpath("(//td[@id='MTTSRule:RuleForm:RuleBlock:j_id98:j_id99:table1:0:j_id103'])[1]"));
//		Select st=new Select(drp);
//		st.selectByVisibleText("Billing Type");
		
		
		
		
		
		
		
		

	}

	private static WebElement findElement(By xpath) {
		// TODO Auto-generated method stub
		return null;
	}

}
