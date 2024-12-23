import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class selintroduction implements WebDriver{

	public static void main(String[] args) {
		
		//Invoking the browser
		//chrome-chromedriver
		
		
	//System.setProperty("webdriver.chrome.driver","C:\\Users\\mparthasarathi\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");			
	WebDriver driver= new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
         driver.quit();
		
		
  //Gecko driver is required to launch the Firefox driver unlike chrome driver those does not have jar file 
//   System.setProperty("webdriver.gecko.driver","C:\\Users\\mparthasarathi\\Documents\\geckodriver-v0.34.0-win64\\geckodriver.exe");
//	WebDriver driver= new FirefoxDriver();
//	driver.get("https://test.salesforce.com/");
//	System.out.println(driver.getTitle());
//	System.out.println(driver.getCurrentUrl());
//	driver.quit();
	
//   System.setProperty("webdriver.edge.driver","C:\\Users\\mparthasarathi\\Documents\\edgedriver_win64\\msedgedriver.exe");
//   
//   WebDriver driver=new EdgeDriver();
//   
//	driver.get("https://www.irctc.co.in/nget/train-search");
//	System.out.println(driver.getCurrentUrl());
//	System.out.println(driver.getTitle());
//	driver.close();
	
		
		
		



 
	
	
		
		
		
		
		
		
		
		
	
		

	}

	@Override
	public void get(String url) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getCurrentUrl() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<WebElement> findElements(By by) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WebElement findElement(By by) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPageSource() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void quit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set<String> getWindowHandles() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getWindowHandle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TargetLocator switchTo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Navigation navigate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Options manage() {
		// TODO Auto-generated method stub
		return null;
	}

}
