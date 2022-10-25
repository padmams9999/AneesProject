package Package1;

public class Constructor {

	//normal constructor
	public Constructor()
	{
		System.out.println("I am a normal constructor");
	}
	
	//parameterized constructor
	public Constructor(String a)
	{
		System.out.println("I am parameterized constructor");
	}
	
	public Constructor(int b, int c)
	{
		System.out.println("I am parameterized constructor");
	}
	
	public void getdata() {
		System.out.println("I am a Method");
	}
	
	public static void main(String[] args) {
		//Constructor obj = new Constructor();
		//Constructor obj1 = new Constructor("Anees");
		Constructor obj2 = new Constructor(4,5);
		

	}

}
