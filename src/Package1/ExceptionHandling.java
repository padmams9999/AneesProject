package Package1;

public class ExceptionHandling {

	public static void main(String[] args) {
		/*int a = 7;
		int b = 0;
		//int c = a/b;
		
		try {
			int c = a/b;
			System.out.println(c);
		}
		//System.out.println("gsdghdfhj");
		//catch (Exception xyz) {
		catch (ArithmeticException xyz) {
			System.out.println(xyz);
		}*/
		
		
		
		/*int []x = new int[5];
		try {
		x[6]=50;
		}
		
		//catch (ArithmeticException xyz) {
		//catch (Exception xyz) {
		catch (ArrayIndexOutOfBoundsException a) {
			System.out.println(a);
		}
		
		System.out.println("testing");
		System.out.println("test123");
		System.out.println("test");*/


	
	//payment code
	//repayment code
		
		/*int []x = new int[5];
		try {
			System.out.println("payemnt code");
		x[6]=50;
		
		}
		
		//catch (ArithmeticException xyz) {
		
		catch (ArithmeticException xyz) {
			System.out.println(xyz);
			
		}
		
		catch (ArrayIndexOutOfBoundsException xyz) {
			System.out.println(xyz);
			System.out.println("Repayemnt code");
		}
		
		System.out.println("testing");
		System.out.println("test123");
		System.out.println("test");*/

		//one try can follow with multiple catch blocks
		//you should remember that catch block should be immediate after try block
		//whatever code written in between try and catch block it will not work.
		
		
		//finally block
		//this finally block will be executed irrespective of code is pass or fail.
		//when this finally block will not be executed ? - 
		//when we manually stop the execution(terminating teh execution) 
		
		int a = 7;  //8
		int b = 0;  //2
		//int c = a/b;
		
		try {
			int c = a/b;
			System.out.println(c);
		}
		//System.out.println("gsdghdfhj");
		//catch (Exception xyz) {
		catch (Exception xyz) {
			System.out.println(xyz);
		}
		finally {
			System.out.println("delete cookies");
		}
	}

}
