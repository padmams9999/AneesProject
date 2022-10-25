package Package1;

import Package2.Parent3;

public class Child1Class extends Parent1Class{

	public void Freetime() {
		System.out.println("Freetime");
	}
	
	public void Student() {
		System.out.println("Student");
	}
	
	public void Bike() {
		//super.Bike();
		System.out.println("BWM");
	}
	
	public void Mobile() {
		System.out.println("iPhone");
	}
	
	public static void main(String[] args) {
		
		Child1Class child1=new Child1Class();
		child1.Bike();
		child1.Freetime();
		child1.Mobile();
		child1.Student();
		child1.Money();
		//child1.SUperbike();
		//child.Travel();
		

	}

}
