package InterfacePractise;

public class IndianHYWS implements Globalrules,TNRules {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Globalrules gr= new IndianHYWS();
		gr.rightlane();
		gr.centerlane();
		gr.leftlane();
	
		IndianHYWS IH= new IndianHYWS();
		IH.tollplaza();
		
		TNRules TR= new IndianHYWS();
		TR.NH48();
		
	}

	@Override
	public void rightlane() {
		// TODO Auto-generated method stub
		System.out.println("Fast moving");
	}

	@Override
	public void centerlane() {
		// TODO Auto-generated method stub
		System.out.println("Slow moving");
	}

	@Override
	public void leftlane() {
		// TODO Auto-generated method stub
		System.out.println("Medium moving");
	}

	public void tollplaza() {
		System.out.println("Slow down");
	}

	@Override
	public void NH48() {
		// TODO Auto-generated method stub
		System.out.println("MS-MDU");
	}
}
