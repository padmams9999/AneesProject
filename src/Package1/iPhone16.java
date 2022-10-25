package Package1;

public class iPhone16 implements TROIInterface , iPhoneInterface{

	public static void main(String[] args) {
		iPhone16 IP16 = new iPhone16();
		IP16.AppStore();

	}

	@Override
	public void iWatch() {
		System.out.println("New Iwatch App");
		
	}

	@Override
	public void AppStore() {
		System.out.println("New AppStore App");
		
	}

	@Override
	public void iMusic() {
		System.out.println("New iMusci App");
		
	}

	@Override
	public void Calling() {
		System.out.println("Calling");
		
	}

	@Override
	public void CallEnd() {
		System.out.println("CallEnd");
		
	}

	@Override
	public void CallDivert() {
		System.out.println("CallDivert");
		
	}

	@Override
	public void Messages() {
		System.out.println("Messages");
		
	}

	@Override
	public void Maps() {
		System.out.println("Maps");
		
	}

}
