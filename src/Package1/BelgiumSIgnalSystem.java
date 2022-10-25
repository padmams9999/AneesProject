package Package1;

public class BelgiumSIgnalSystem extends NHAAbstractClass{

	public static void main(String[] args) {
		
		BelgiumSIgnalSystem Belgium = new BelgiumSIgnalSystem();
		Belgium.Greenlight();
		Belgium.GreenlightWaittime();
		Belgium.Redlight();
		Belgium.RedlightWaittime();
		Belgium.Orangelight();
		Belgium.OrangelightWaittime();
	}

	@Override
	public void GreenlightWaittime() {
		System.out.println("Greenlight wait for 45 sec");
		
	}

	@Override
	public void RedlightWaittime() {
		System.out.println("Greenlight wait for 30 sec");
		
	}

	@Override
	public void OrangelightWaittime() {
		System.out.println("Greenlight wait for 5 sec");
		
	}

}
