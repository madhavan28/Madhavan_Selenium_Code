package testpackage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EducationLoan {
	
//	@BeforeSuite
//	public void bfsuite() {
//		
//		System.out.println("I will get executed before the suite");
//	}
	
	@Test
	public void PLWeb() {
		
		System.out.println("Education loan Web");
	}
	
	
	@Test
	public void PLMobile() {
		
		System.out.println("Education loan Mobile");
	}
	
	
	@Test(dataProvider="getdata")
	public void PLAPI(String name , String password) {
		
		System.out.println("Education loan API");
		System.out.println(name);
		System.out.println(password);
	}
	
	
	@DataProvider
	public Object[][] getdata() {
		
		Object[][] data=new Object[2][2];
		
		data[0][0]="Madhavan";
		data[0][1]="Password";
		
		data[1][0]="Vasanthi";
		data[1][1]="CUB";
		
		return data;
	}
//	@AfterSuite
//	public void afsuite() {
//		
//		System.out.println("I will get executed after the suite");
//	}
//
//	
//	@BeforeMethod
//	public void bfmethod() {
//		System.out.println("This will be executed before the method");
//	}
//	
//	@AfterMethod
//	public void afmethod() {
//		System.out.println("This will be executed after the method");
//	}
	
}
