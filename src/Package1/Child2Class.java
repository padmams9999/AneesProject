package Package1;

public class Child2Class extends Parent1Class {

	public void Freetime() {
		System.out.println("Freetime");
	}
	
	public void Student() {
		System.out.println("Student");
	}
	
	public void Bike() {
		System.out.println("DUKE");
	}
	
	public void Mobile() {
		System.out.println("Redmi");
	}
	
	public static void main(String[] args) {
		
		Child2Class child2=new Child2Class();
		child2.Bike();
		child2.Freetime();
		child2.Mobile();
		child2.Student();
		child2.Money();
		//child.Travel();
	}

}
