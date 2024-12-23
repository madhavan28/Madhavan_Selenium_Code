package testpackage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Carloan {
	
	@BeforeTest
	
	public void precheck() {
		
		System.out.println("This will execute 1st then rest");
	}
	
	
	@Test
	public void Carweb() {
		
		System.out.println("This is for the car web application");
	}

	
	@Test
	public void mobileapp() {
		System.out.println("This is for the car mobile application");
		
	}
	
	
	@Test
	public void CarAPI() {
		
		System.out.println("This is for the car API login application");
	}
	
	}



