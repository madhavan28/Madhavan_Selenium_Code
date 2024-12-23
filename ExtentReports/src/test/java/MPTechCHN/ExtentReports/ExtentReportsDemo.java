package MPTechCHN.ExtentReports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsDemo {
	ExtentReports extent;
	@BeforeTest
	public void config() {
		
		//ExtentReport , ExtentSparkReporter
		String path=System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setReportName("Web Automation result");
		reporter.config().setDocumentTitle("Test Results");
		
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Madhavan");
	}
	
	@Test
	public void intialDemo() {
		
		ExtentTest test=extent.createTest("IntialDemo");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		driver.close();
		test.fail("Result did not match");
		extent.flush();
		
	
	}
	
}
