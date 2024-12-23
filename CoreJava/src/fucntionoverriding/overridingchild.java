package fucntionoverriding;

public class overridingchild extends overridingparent {

	
public void gearbox() {
	
		System.out.println("Gearbox from the child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		overridingchild oc= new overridingchild();
		oc.gearbox();
	}

}
