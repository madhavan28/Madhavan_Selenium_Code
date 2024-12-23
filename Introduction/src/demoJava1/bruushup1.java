package demoJava1;

public class bruushup1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int myNum=5;
		String myWebsite="Google.com";
//		System.out.println(myNum+" "+"this is the number stored in the variable and it is acceptable");	
//		System.out.println("this is my website"+" "+ myWebsite);	
		//Arrays
		
		int[] arr= new int [5];
		
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		
		int[] array2= {12,45,61,56,90};
		//System.out.println(array2[1]);
		
//		for(int i=0;i<arr.length;i++) {
//			
//			System.out.println("The number in the"+" " + i + " "+ "place is" +" "+arr[i]);
//			
//		}
		
		
		String[] className= {"Rahul","Madhu","GPS"};
		
//		for(int j=0;j<className.length;j++) {
//			
//		System.out.println("The following are the names"+" "+ className[j]);
//		
//		}
		
		for(String s :className) {
			
			System.out.println(s);
		}
		
	}

}
