package superkey;

public class superkeychild extends superkeyword {

String name="Daniel";

public superkeychild() {
	
	System.out.println("I am in the child class consrtcutor");
}

public void getStringname() {
	
	//System.out.println(super.name);
	System.out.println(name);
}

public void getdata() {
	//super.getdata();
	System.out.println("I am in the child class method");
}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		superkeychild skd= new superkeychild();
		//skd.getStringname();
		//skd.getdata();
		
		
		
	}

}
	