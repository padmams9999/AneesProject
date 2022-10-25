package Package1;

public class ClassAccessModifier2 {

	public static void main(String[] args) {
		ClassAccessModifier1 obj1=new ClassAccessModifier1();
		
		System.out.println(obj1.x);
		System.out.println(obj1.y);
		//System.out.println(obj1.z);
		System.out.println(obj1.name);
		obj1.publicmethod();
		obj1.defaultmethod();
		//obj1.privatemethod();
		obj1.protectedmethod();

	}

}
