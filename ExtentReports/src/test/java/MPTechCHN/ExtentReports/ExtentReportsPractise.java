package MPTechCHN.ExtentReports;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsPractise {
	ExtentReports report;
@BeforeTest
public void configuration() {
	
	//ExtentSparkreporter , ExtentReports
	
	File file=new File(System.getProperty("user.dir")+"//practisereports//practiseindex.html");
	ExtentSparkReporter SparkReporter=new ExtentSparkReporter(file);
	SparkReporter.config().setReportName("Web Automation Practise");
	SparkReporter.config().setDocumentTitle("Practise Test Report");
	
	report=new ExtentReports();
	report.attachReporter(SparkReporter);
	report.setSystemInfo("QA Member", "Madhavan");
	
	
}
	
@Test
public void ExtentReportsDemoPractise() {
	
report.createTest("PractiseDemo");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.formula1.com/");
System.out.println(driver.getTitle());
driver.close();
report.flush();
	
}

}
