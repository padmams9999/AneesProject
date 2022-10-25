package Package1;

import Package2.Parent3;

public class Parent1Class extends Parent3 {

	public void mobile() {
		System.out.println("Samsung");
	}
	
	public void Job() {
		System.out.println("Job");
	}
	
	public  void Bike() {
		//super.Bike();
		System.out.println("HERO");
	}
	
	public void Money() {
		System.out.println("Money");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Inheritance allows new classes to extend other classes.
		//Keyword for inheritance is extends
		//child class - it is  called as subclass
		//Parent class - it is called as SUper class
		//sub class can inherit variables and Methods of the super class
		//Sub class cannot extend to multiple super class
		//Sub class can override the super class if both classes have same Methodnames with same or different implimentation.
		
		
		Parent1Class parent = new Parent1Class();
		parent.mobile();
		parent.Job();
		parent.Money();
		parent.Bike();
		//parent.Bike();
		

	}

}
