package testpackage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Basics1 {

	@BeforeTest	
	
	public void precheck() {
		
		System.out.println("this will be the first  step");
	}

	@Test
	public void demo(){
		
		System.out.println("Hello");
	}
	
	@Test(groups= {"Regressiontest"})
	public void demo2() {
		
		System.out.println("How are you");
	}
}
