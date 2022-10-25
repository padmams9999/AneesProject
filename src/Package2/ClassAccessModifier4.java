package Package2;

import Package1.ClassAccessModifier1;

public class ClassAccessModifier4 extends ClassAccessModifier1 {

	public static void main(String[] args) {
		ClassAccessModifier1 obj4 = new ClassAccessModifier1();
		ClassAccessModifier4 obj5 = new ClassAccessModifier4();
		System.out.println(obj4.x);
		System.out.println(obj4.y);
		System.out.println(obj4.z);
		System.out.println(obj5.name);
		obj4.publicmethod();
		obj4.defaultmethod();
		obj4.privatemethod();
		obj5.protectedmethod();

	}

}
