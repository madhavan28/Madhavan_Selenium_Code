package Arrays;

public class ArraysInitialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]=new int[5]; //Initializing array with the required memory , traditional way where memory of the array is fixed
		a[0]=2; 
		a[1]=4;
		a[2]=6;
		a[3]=8;
		a[4]=10;
		
		int b[]= {1,3,5,7,9}; //Modern way of Initializing array where , memory is dynamic and not fixed
		
		for(int i=0;i<b.length;i++) {
			
			System.out.println(b[i]);
		}
		
		
		
		
		
	}

}
