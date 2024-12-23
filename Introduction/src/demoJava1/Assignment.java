package demoJava1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		// driver.findElement(By.cssSelector("input[id='ctl00_mainContent_rbtnl_Trip_1']")).click();
		driver.findElement(By.id("Div1")).getAttribute("Style");
		if (driver.findElement(By.id("Div1")).getAttribute("Style").contains("0.5")) {
			Assert.assertTrue(true);
		}

		else {

			Assert.assertTrue(false);
		}

		// Drop down with mutiple options with - and + buttons
		driver.findElement(By.id("divpaxinfo")).click();

		Thread.sleep(3000);
		for (int i = 1; i < 6; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();

		}
		Thread.sleep(3000);
		int j = 1;
		while (j < 4) {
			driver.findElement(By.id("hrefIncChd")).click();
			j++;

		}
		Thread.sleep(3000);
		driver.findElement(By.id("hrefIncInf")).click();

		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "6 Adult, 3 Child, 1 Infant");

		// Static Drop down

		WebElement staticdrp = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select drpdown = new Select(staticdrp);
		drpdown.selectByIndex(2);
		System.out.println(drpdown.getFirstSelectedOption().getText());

		// Dynamic Drop down

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.cssSelector("div[id='ctl00_mainContent_ddl_originStation1_CTNR'] a[value='BLR']"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("div[id='ctl00_mainContent_ddl_destinationStation1_CTNR'] a[value='MAA']"))
				.click();

		Thread.sleep(5000);
		driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight")).click();

		driver.findElement(By.cssSelector("input[id='autosuggest']")).sendKeys("Ind");
		Thread.sleep(9000);
		List<WebElement> options = driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));

		for (WebElement Option : options) {

			if (Option.getText().equalsIgnoreCase("India")) {
				Option.click();
				break;
			}
		}

		Assert.assertFalse(driver.findElement(By.cssSelector("input[name*='friendsandfamily']")).isSelected());
		driver.findElement(By.cssSelector("input[name*='friendsandfamily']")).click();
		Thread.sleep(3000);
		Assert.assertTrue(driver.findElement(By.cssSelector("input[name*='friendsandfamily']")).isSelected());
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());

		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

	}

}
