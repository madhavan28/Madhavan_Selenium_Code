package testpackage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Homeloan {

	
	@BeforeTest	
	
	public void precheck() {
		
		System.out.println("this is the 1st step");
	}

	
	@Test
	public void homemobileapp() {
		System.out.println("This is for the home mobile application");
		
	}
	
	
	@Test
	public void LoginAPI() {
		
		System.out.println("This is for the Home API login application");
	}
	
}

