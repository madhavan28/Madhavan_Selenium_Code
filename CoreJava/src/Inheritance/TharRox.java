package Inheritance;

public class TharRox extends Thar{
	
		
	
	public void engine() {
		
		System.out.println("Petrol engine 1.6L");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TharRox tr=new TharRox();
		tr.engine();
		tr.Gearbox();
		tr.seats();
		tr.Suspension();
		
		
	}

}
