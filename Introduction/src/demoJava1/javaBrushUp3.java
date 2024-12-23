package demoJava1;

public class javaBrushUp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Strint is a sequence of charcaters but in JAVA prespective it is an object that represents the sequence of characters
		
		//String Litreal
		
		
		//String S1="Madhavan academy for sciences";
		
		//Key word method
		String s2= new String("Welcome");
		String s3= new String("Welcome");
		
//		String s="Madhavan academy sciences";
//		String[] institutename=s.split("academy");
//		
//		for(int i=0;i<institutename.length;i++) {
//			
//			System.out.println(institutename[i].trim());
//			
//		}
//		
//		
//
//		
//		for(int i=s.length()-1;i>=0;i--) {
//			
//		System.out.println(s.charAt(i));
//		}
		
		
		String s5="Parthasarathi Govindhan Iyyengar";
		String[] s6=s5.split("Govindhan");
		
		for(int i=0;i<s6.length;i++) {
			
			System.out.println(s6[i].trim());
			
		}

	for(int i=s5.length()-1;i>=0;i--) {
		
	System.out.println(s5.charAt(i));
	
	}
		
		
		
	}

}
