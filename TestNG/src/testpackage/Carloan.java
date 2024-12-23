package testpackage;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Carloan {
	

	
	@Test(dataProvider="getdata")
	public void Web(String username,String password) {
		
		System.out.println("This is for the car web application");
		System.out.println(username);
		System.out.println(password);
	}

	@Parameters({"CarloanURL","Creds"})
	@Test
	public void mobileapp(String getURL , String usernames) {
	System.out.println("This is for the car mobile application");
	System.out.println(getURL);	
	System.out.println(usernames);

	}
	
	
	@Test
	public void CarAPI() {
		
		System.out.println("This is for the car API login application");
		Assert.assertTrue(false);
	}
	

	@DataProvider
	public Object[][] getdata() {
		
	Object[][] data=new Object[3][2];   //3 data combinations , 2 data per each combination
	//1st set
    data[0][0]="madhavan";
    data[0][1]="pwd1";
    
    //2nd set
    data[1][0]="parthasarathi";
    data[1][1]="pwd2";
    
    //3rd set
    data[2][0]="vasanthi";
    data[2][1]="pwd3";
    
    
	return data;
		
		
	}

	}



