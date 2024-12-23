package Abstraction;

public class Emirates extends Boeing {

	
	public static void main (String[] args) {
		
		engine();
		safety();
		Emirates em=new Emirates();
		em.colour();
	}
		
	@Override
	public void colour() {
		System.out.println("Red colour on the body");
		
	}

}
