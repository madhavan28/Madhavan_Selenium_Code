package Ecommerce.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Ecommerce.AbstractPageComponents.AbstractPageComponents;

public class landingpage extends AbstractPageComponents{

	WebDriver driver;
	public landingpage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	
	//driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
	@FindBy(id="username")
	WebElement userid;
	
	//driver.findElement(By.name("password")).sendKeys("learning");
	@FindBy(name="password")
	WebElement passcode;
	
	//driver.findElement(By.id("terms")).click();
	@FindBy(id="terms")
	WebElement terms;
	
	//driver.findElement(By.id("signInBtn")).click();
	@FindBy(id="signInBtn")
	WebElement signinbutton;
	
	@FindBy(xpath="//select[@class='form-control']")
	WebElement stc;
	
	
	
	public void landingaction(String username, String password) {
		
		userid.sendKeys(username);
		passcode.sendKeys(password);	
		Select check=new Select(stc);
		check.selectByValue("teach");
		terms.click();
		signinbutton.click();
		
	}
	
}
