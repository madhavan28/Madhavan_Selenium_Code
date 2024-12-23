package Ecommerce.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Ecommerce.AbstractPageComponents.AbstractPageComponents;

public class finalpage extends AbstractPageComponents {
	
	WebDriver driver;
	public finalpage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(css=".btn-success")
	WebElement checkout;
	public void actionsclass() {
		Actions act=new Actions(driver);
		act.click(driver.findElement(By.id("exampleInputEmail1"))).doubleClick().sendKeys("2").build().perform();
		checkout.click();
	}
	
	
	@FindBy(id="country")
	WebElement country;
	
	@FindBy(css=".suggestions li a")
	WebElement countryselect;
	
	By countrywait=By.cssSelector(".suggestions li a");
	
	By countryselectinvisble=By.cssSelector(".suggestions li a");
	
	@FindBy(xpath="//label[@for='checkbox2']")
	WebElement chckbox;
	
	
	@FindBy(css="input[value='Purchase']")
	WebElement purchase;
	
	public void confirmationpage() {
		actionsclass();
		country.sendKeys("India");
		visibilityofelement(countrywait);
		countryselect.click();
		invisibilityOfElement(countryselectinvisble);
		chckbox.click();
		purchase.click();
	}

}
