package Interface;

public class AustralianTraffic implements DemoInterface,Continental{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DemoInterface a=new AustralianTraffic();
		a.redstop();
		a.greenGo();
		a.flashyellow();
		
		AustralianTraffic at= new AustralianTraffic();
		at.walkonsymbol();
		
		Continental ct=new AustralianTraffic();
		ct.tractorsymbol();
		ct.trainsymbol();
	}


	@Override
	public void redstop() {
		// TODO Auto-generated method stub
		System.out.println("redstop implementation");
	}

	@Override
	public void flashyellow() {
		// TODO Auto-generated method stub
		System.out.println("flashyellow implementation");
	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("greenGo implementation");
	}

	
	public void walkonsymbol() {
		System.out.println("walk on the hand singal");
	}


	@Override
	public void trainsymbol() {
		// TODO Auto-generated method stub
		System.out.println("STOP");
	}


	@Override
	public void tractorsymbol() {
		// TODO Auto-generated method stub
		System.out.println("SLOW");
	}
}
