package testpackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Practisesection {
	

	@BeforeSuite
	public void bfsuit() {
		System.out.println("1");
	}
	
	@BeforeTest
	public void bftest() {
		System.out.println("2");
	}
	@BeforeClass
	public void bfclass() {
		
		System.out.println("3");
	}
	
	@BeforeMethod
	public void bfmethod() {
		
		System.out.println("4");
	}
	
	@AfterMethod
	public void afmethod() {
		System.out.println("5");
	}
	
	@AfterClass
	public void afclass() {
		System.out.println("6");
	}
	@AfterTest
	public void aftest() {
		System.out.println("7");
	}
	@AfterSuite
	public void afsuite() {
		System.out.println("8");
	}
	
	@Test
	public void value() {
		System.out.println("This the test");

	}
	
	@Test
	public void alpha() {
		System.out.println("This is alpha calling");
	}
}
