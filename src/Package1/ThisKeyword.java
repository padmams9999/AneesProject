package Package1;

public class ThisKeyword {
	int x =10; // global variable
	
	public void num() {
		int x = 5;  //local variable
		System.out.println("this is a local value " + x);
		System.out.println("this is a Global value " + this.x);
	}
	
	public void num1() {
		System.out.println(x);
	}
	
	public void num2() {
		System.out.println(x);
	}

	public static void main(String[] args) {
		
		ThisKeyword obj = new ThisKeyword();
		obj.num();
		obj.num1();
		obj.num2();

	}

}
