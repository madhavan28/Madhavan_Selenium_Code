package testpackage;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PersonalLoan {
	
//	@BeforeTest
//	public void bftest() {
//		
//		System.out.println("i will be executing before the test");
//	}
//	
//	@AfterTest
//	public void aftest() {
//		System.out.println("I will be getting executed after the test");
//	}
	
	@Test
	public void PLWeb() {
		
		System.out.println("Personal loan Web");
	}
	
	@Parameters({"URL","Creds"})
	@Test
	public void PLMobile(String website , String usernames) {
		
		System.out.println("Personal loan Mobile");
		System.out.println(website);
		System.out.println(usernames);
	}
	
	@Test
	public void PLAPI() {
		
		System.out.println("Personal loan API");
		Assert.assertTrue(false);
	}
	
	
//	@BeforeClass
//	public void bfclass() {
//		System.out.println("This is executed before the class");
//	}
//	
//	@AfterClass
//	public void afclass() {
//		System.out.println("This will be executed after the class");
//	}

}
