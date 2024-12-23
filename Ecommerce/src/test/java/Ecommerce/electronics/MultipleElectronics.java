package Ecommerce.electronics;

import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Ecommerce.pageobjects.finalpage;
import Ecommerce.pageobjects.landingpage;
import Ecommerce.pageobjects.productpage;

public class MultipleElectronics extends BaseTest {

	@Test(dataProvider="dataprovider")
	public static void ecommerce(HashMap<String , String> input) throws IOException {
		// TODO Auto-generated method stub
		
		String[] goods= {"Samsung Note 8","Nokia Edge"};
		WebDriver driver=Beforemethod();
		landingpage lp=new landingpage(driver);
		lp.landingaction(input.get("email"),input.get("password"));
		productpage pp=new productpage(driver);
		pp.getproduct(goods);
		finalpage fp=new finalpage(driver);
		fp.confirmationpage();
		

	
	}
	
	
	@DataProvider
	public static Object[][] dataprovider() {
		
		HashMap<Object,Object> ip=new HashMap<Object ,Object>();
		ip.put("email", "rahulshettyacademy");	
		ip.put("password", "learning");
		return new Object[][] {{ip}};
		
		
	}
	
}
