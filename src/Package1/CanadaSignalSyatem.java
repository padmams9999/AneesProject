package Package1;

public class CanadaSignalSyatem extends NHAAbstractClass{

	public static void main(String[] args) {
		
		CanadaSignalSyatem Canada = new CanadaSignalSyatem();
		Canada.Greenlight();
		Canada.GreenlightWaittime();
		Canada.Orangelight();
		Canada.OrangelightWaittime();
		Canada.Redlight();
		Canada.RedlightWaittime();
	}

	@Override
	public void GreenlightWaittime() {
		System.out.println("Greenlight wait for 90Sec");
		
	}

	@Override
	public void RedlightWaittime() {
		System.out.println("Redlight wait for 75Sec");
		
	}

	@Override
	public void OrangelightWaittime() {
		System.out.println("Orangelight wait for 10Sec");
		
	}

}
