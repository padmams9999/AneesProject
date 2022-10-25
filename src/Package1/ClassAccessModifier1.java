package Package1;

public class ClassAccessModifier1 {

	public int x =10;
	int y =20;
	private int z = 30;
	protected String name = "testing";
	
	public void publicmethod() {
		System.out.println("I am publicmethod");
	}
	
	void defaultmethod() {
		System.out.println("I am defaultmethod");
	}
	
	
	private void privatemethod() {
		System.out.println("I am privatemethod");
	}
	
	
	protected void protectedmethod() {
		System.out.println("I am protectedmethod");
	}
	
	public static void main(String[] args) {
		// Access MOdifier - 4 types 
		//public, default, protected, private
		
		//public - Variable and Methods which are declared as public 
		//can accessed by any class from any package. It can be accessed outside the package
		
		//Default -  Variable and Methods which are declared as default 
		//can be accessed by any class in the same package. It can't be accessed outside the package
		
		//Private -  Variable and Methods which are declared as private 
		//can be accessed only with in the class. It can't be accessed outside the class even in the same package
		
		//Protected - Variable and Methods which are declared as Protected 
		//can be accessed by any class in the same package and child classes of other package.
		
		ClassAccessModifier1 obj = new ClassAccessModifier1();
		
		System.out.println(obj.x);
		System.out.println(obj.y);
		System.out.println(obj.z);
		System.out.println(obj.name);
		obj.publicmethod();
		obj.defaultmethod();
		obj.privatemethod();
		obj.protectedmethod();
		
		
		
		
		

	}

}
