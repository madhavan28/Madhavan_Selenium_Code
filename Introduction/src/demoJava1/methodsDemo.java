package demoJava1;

public class methodsDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		methodsDemo s1=new methodsDemo();
		System.out.println(s1.myName());
		
		System.out.println(mytravel());
		
		methodsDemo2 s2=new methodsDemo2();
		System.out.println(s2.usergetData());
		
		
		
	}

	
	public String  myName() {
		
		System.out.println("Hello world this is program");
		return "Kaveriexpress";
	}

	
	
	
	public static String mytravel() {
		
		System.out.println("MAS TO SBC");
		return "Tommorrow";
	}
}



