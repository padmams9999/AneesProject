package Package1;

public abstract class NHAAbstractClass {

	public void Greenlight() {
		System.out.println("GO");
	}
	
	public void Orangelight() {
		System.out.println("Slow down");
	}
	
	public void Redlight() {
		System.out.println("STOP");
	}
	
	public abstract void GreenlightWaittime();
	public abstract void RedlightWaittime();
	public abstract void OrangelightWaittime();
	
	//Abstract class will have both implemented and unimplemented methods
	//Unimplemented methods are also called as Abstract Method
	//Interface will have 100% Abstract Methods
	//When a Normal class becomes Abstract Class - When there is alteast one Abstract method 
	//then that class will become Abstract Class
	
	
	

}
