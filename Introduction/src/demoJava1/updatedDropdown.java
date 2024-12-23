package demoJava1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class updatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		for(int i=1;i<5;i++) {
		driver.findElement(By.id("hrefIncAdt")).click();
		}
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		int j=1;
		while(j<3) {
			
		driver.findElement(By.id("hrefIncChd")).click();
		j++;
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		WebElement staticdrp=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select drpdown=new Select(staticdrp);
		drpdown.selectByVisibleText("USD");
		System.out.println(drpdown.getFirstSelectedOption().getText());
	}

}
