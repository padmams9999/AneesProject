package Package1;

public class iPhone14 implements TROIInterface{

	public static void main(String[] args) {
		iPhone14 IP14 = new iPhone14();
		IP14.AppStore();
		IP14.CallDivert();
		IP14.CallEnd();
		IP14.Calling();
		IP14.iFrontcam();
		IP14.iMusic();
		IP14.iWatch();
		IP14.Maps();
		IP14.Messages();
		IP14.RareCam();
		

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
		System.out.println("32MP");
	}
	
	public void RareCam() {
		System.out.println("64MP");
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
