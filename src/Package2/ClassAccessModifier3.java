package Package2;

import Package1.ClassAccessModifier1;

public class ClassAccessModifier3 {

	public static void main(String[] args) {
ClassAccessModifier1 obj2 = new ClassAccessModifier1();
ClassAccessModifier3 obj6 = new ClassAccessModifier3();
		System.out.println(obj2.x);
		System.out.println(obj2.y);
		System.out.println(obj2.z);
		System.out.println(obj6.name);
		obj2.publicmethod();
		obj2.defaultmethod();
		obj2.privatemethod();
		obj6.protectedmethod();

	}

}
