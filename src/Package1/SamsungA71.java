package Package1;

public class SamsungA71 implements TROIInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	 public void Playstore() {
		 System.out.println("playstore");
	 }
	 
	 public void Samsungstore() {
		 System.out.println("Samsungstore");
	 }
	 
	 public void SamsungMackup() {
		 System.out.println("SamsungMackup");
	 }
	 
	@Override
	public void Calling() {
		System.out.println("Scroll left");
		
	}

	@Override
	public void CallEnd() {
		System.out.println("Scroll Right");
		
	}

	@Override
	public void CallDivert() {
		System.out.println("Divert");
		
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
