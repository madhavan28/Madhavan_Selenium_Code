package Constructor;

public class ConstructorDemo {

	
	public ConstructorDemo() {
		
		System.out.println("I am sitting in the constructor class");
	}
	
	public ConstructorDemo(int a, int b) {
		
		System.out.println(a+b);
		
	}
	
public ConstructorDemo(String abc) {
		
		System.out.println(abc);
		
	}
	
	public void getdata(int a) {
		System.out.println("I am in the method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ConstructorDemo cd=new ConstructorDemo();
		
		ConstructorDemo d= new ConstructorDemo(5,6);
		
	}

}
