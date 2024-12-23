package functionoverloading;

public class overloading {
	
public int getData(int a) {
	
	
	return a;
}

public String getData(String b) {
	
	return b;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		overloading ol=new overloading();
		System.out.println(ol.getData(2));
		System.out.println(ol.getData("Madhavan"));
		
		
	}

}
