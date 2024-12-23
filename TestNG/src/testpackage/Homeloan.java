package testpackage;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Homeloan {

	
//	@BeforeClass
//	public void bfclass() {
//		
//		System.out.println("this needs to done before the class");
//	}
//	@AfterMethod
//	public void afmethod() {
//		
//		System.out.println("This method is for deleting the test data");
//	}
//	@AfterTest
//	public void posttest() {
//		System.out.println("This will be executed at the last");
//		
//	}

	@Parameters({"URL","Creds"})
	@Test
	public void homewebapp(String urlname, String credsdetails) {
		System.out.println("This is for the home web application");
		System.out.println(urlname);
		System.out.println(credsdetails);
		
		
	}
	
	@Test(groups= {"Regressiontest"})
	public void homemobileapp()
	{
		System.out.println("This is for the home mobile application");
		
	}
	

	@Test
	public void LoginAPI() {
		
		System.out.println("This is for the Home API login application");
	}
	
	
//@AfterClass
//
//public void afclass() {
//	System.out.println("this needs to done after the class");
//}
}

