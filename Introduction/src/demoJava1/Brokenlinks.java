package demoJava1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//broken URL
		List<WebElement> links= driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		
	//	SoftAssert a=new SoftAssert();
		
		for(WebElement URL:links) {
			
		String URLS=URL.getAttribute("href");
			//there are some java methods which will help to call the URL's	and get you the status
			HttpURLConnection conn= (HttpURLConnection) new URL(URLS).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
				//if status code is greater than 400 , than that link is broken
			int responsecode=conn.getResponseCode();
			System.out.println(responsecode);
			//a.assertTrue(responsecode<400, "The failed link is "+URL.getText()+"with response code"+responsecode);
			
			

			
		}
	
		
		//a.assertAll();
		
		
		
		
		
		
	
	
		
		
		
		
	}

}
