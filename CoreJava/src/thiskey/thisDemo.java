package thiskey;

import Accessmodifier.Demo1AM;

public class thisDemo extends Demo1AM  {

	int a=8;
	
	public void getdata() {
		
		int a=10;
		System.out.println(a);
		System.out.println(this.a+a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		thisDemo tD=new thisDemo();
		tD.getdata();
		tD.getnumber();
	
		
		
	}

}
