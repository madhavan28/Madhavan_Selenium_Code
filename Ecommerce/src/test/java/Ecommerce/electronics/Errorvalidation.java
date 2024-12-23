package Ecommerce.electronics;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Ecommerce.AbstractPageComponents.AbstractPageComponents;
import Ecommerce.pageobjects.landingpage;

public class Errorvalidation extends BaseTest {

	@Test
	public static void ecommerce() throws IOException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver=Beforemethod();
		landingpage lp=new landingpage(driver);
		lp.landingaction("rahulshettyacademy","learning123");
		AbstractPageComponents apc=new AbstractPageComponents(driver);
		apc.visibilityofelement(By.xpath("//form[@name='loginForm']/div[1]"));
		String errormessage=driver.findElement(By.xpath("//form[@name='loginForm']/div[1]")).getText();
		System.out.println(errormessage);
		
		
		

	
	}
	
	
}
