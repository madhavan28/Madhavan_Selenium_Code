package Ecommerce.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Ecommerce.AbstractPageComponents.AbstractPageComponents;

public class productpage extends AbstractPageComponents {

	public WebDriver driver;
	public productpage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}	
	By elementwait=By.cssSelector(".my-4");
	
	//driver.findElement(By.cssSelector(".btn-primary")).click();
	@FindBy(css=".btn-primary")
	WebElement checkoutbutton;
	
	
		
public void getproduct(String[] goods) {
visibilityofelement(elementwait);
for(String prdt:goods) {
List<WebElement> cart=driver.findElements(By.cssSelector(".mb-3"));
WebElement prod=cart.stream().filter(product->product.findElement(By.cssSelector(".card-title a")).getText().equalsIgnoreCase(prdt)).findFirst().orElse(null);
prod.findElement(By.cssSelector(".card-footer button")).click();
}
checkoutbutton.click();
	
	}
	

	
	
}
