package Package1;

public class iPhone15 implements TROIInterface{

	public static void main(String[] args) {
		iPhone15 IP15 = new iPhone15();
		IP15.AppStore();
		IP15.CallDivert();
		IP15.CallEnd();
		IP15.Calling();
		IP15.iFrontcam();
		IP15.iMusic();
		IP15.iWatch();
		IP15.Maps();
		IP15.Messages();
		IP15.RareCam();

	}

	public void iWatch() {
		System.out.println("iWatch");
	}
	
	public void AppStore() {
		System.out.println("Appstore");
	}
	
	public void iMusic() {
		System.out.println("iMusic");
	}
	
	public void iFrontcam() {
		System.out.println("48MP");
	}
	
	public void RareCam() {
		System.out.println("72MP");
	}
	
	@Override
	public void Calling() {
		System.out.println("Scroll up");
		
	}

	@Override
	public void CallEnd() {
		System.out.println("Scroll down");
		
	}

	@Override
	public void CallDivert() {
		System.out.println("Diverting");
		
	}

	@Override
	public void Messages() {
		System.out.println("Message");
		
	}

	@Override
	public void Maps() {
		System.out.println("Maps");
		
	}

}
