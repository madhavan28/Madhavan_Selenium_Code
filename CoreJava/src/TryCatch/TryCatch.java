package TryCatch;

public class TryCatch {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=7;
		int b=0;	
		int d[]=new int[5];	
		try {
			int	c= a/b;
			System.out.println(c);
		System.out.println(d[2]);
		
		
		}
		
		
//		catch(IndexOutOfBoundsException e) {
//			
//			System.out.println("I was catched by index catch block");
//		}
//		catch(ArithmeticException et) {
//			
//			System.out.println("I was catched by arithematic catch block");
//		}
//		
//		catch(Exception e) {
//			
//			System.out.println("I got an error and hence printing this");
//		}
//	
		
		finally {
			
			System.out.println("I am getting printed in the finally block");
		}
	
	}
	
	

}
