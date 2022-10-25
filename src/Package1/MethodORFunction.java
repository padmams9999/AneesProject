package Package1;

public class MethodORFunction {

	// How to create a Method / Function
	//Login Method
	public void Login(String Username, String Password)
	 {
		System.out.println("Login with username " + Username);
		System.out.println("Login with Password " + Password);
		System.out.println("Login as Sign in");
	}
	
	//Logout Method
	public void logout() {
		System.out.println("Logout");
	}
	

	public static void main(String[] args) {
		
		//Methods in the class can be access by creation object of that class
		//how to create object
		MethodORFunction x = new MethodORFunction();
		ForLoop y = new ForLoop();
		y.getData();
		
		x.Login("shakeer", "test@1234");
		x.logout();
		
		x.Login("Jaffar", "Password@123");
		x.logout();
		
		x.Login("Divya", "Pass@999");
		x.logout();
		
		x.Login("Padma", "Pass456@999");
		x.logout();
		
		x.Login("Moosa", "Testing");
		x.logout();


		
	


	}

}
