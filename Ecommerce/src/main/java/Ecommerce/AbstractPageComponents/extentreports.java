package Ecommerce.AbstractPageComponents;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class extentreports {

	public static ExtentReports getExtentReports() {
		
		File file=new File ("C:\\Users\\mparthasarathi\\eclipse-workspace\\Ecommerce\\reports.html");
		ExtentSparkReporter esr= new ExtentSparkReporter (file);
		esr.config().setDocumentTitle("Electronic Ecommerce");
		esr.config().setReportName("Testcase execution");
		
		ExtentReports extentreports=new ExtentReports();
		extentreports.attachReporter(esr);
		return extentreports;
		
		
	}
}
