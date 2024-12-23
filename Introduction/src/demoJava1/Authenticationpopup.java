package demoJava1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authenticationpopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("http://admin:admin@the-internet.herokuapp.com/");
	     driver.findElement(By.xpath("//ul/li[3]/a")).click();
	     
	     
	}

}
