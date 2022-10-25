package Package1;

public class ForLoop {

	public void getData() {
		System.out.println("wrtgaerg");
		System.out.println("fgseddghbsgf");
	}
	
	public void Login() {
		System.out.println("Login as Username");
		System.out.println("Login as pwd");
		System.out.println("Login as Sign in");
	}
	
	//Logout Method
	public void logout() {
		System.out.println("Logout");
	}
	
	public static void main(String[] args) {
		
		ForLoop y=new ForLoop();
		MethodORFunction x = new MethodORFunction();
		y.getData();
		
	
		 //For looping
		/*for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}*/
		
		//For Debug --> place a breakpoint and then when teh script stop at 
		//test line press F6
		//This is script to print single word by word from a string
		/*String text= "Automation testing session for Selenium";
		System.out.println(text);
		for (int i=0;i<text.length();i++)
		{
			//System.out.println(text.charAt(i));
			System.out.print(text.charAt(i));
		}*/
		
		//Enhanced Forloop
		/*String text= "Automation testing session for Selenium";
		String [] Splitvalue = text.split(" ");
		for(int i=0;i<Splitvalue.length;i++)
		{
			System.out.println(Splitvalue[i]);
		}
		
		for(String val : Splitvalue )
		{
			System.out.println(val);
		}*/
		
		
		//This is script to print single word by word from a string in Reverse
		/*String text= "Automation testing session for java";
		System.out.println(text.length());
		for ( int i=text.length()-1;i>=0;i--)
		{
			System.out.print(text.charAt(i));
		}*/
		

		/* int[] numbers = {1,2,3,4,5,6,7,8,9,0,1,3,3,34,54,754,56,78,5,8554,53,4,346,52,5};
		for ( int a:numbers) {
			System.out.println(a);
			if(a==54) {
				System.out.println("I did got 54");
				break;
			}
			else
			{
				System.out.println("I did not get 54");
			}
		} */
		
		//If elseif condition;
		
		/* String Names = "Prathiba";
		 * 
		 if (Names.equals("Shakeer")) {
			 System.out.println("Calling Shakeer");
		 }
		 
		 else if(Names.equals("Moosa") )
		 {
			 System.out.println("calling Moosa");
		 }
		 
		 else if(Names.equals("Jaffar"))
			 {
				 System.out.println("Calling Jaffar");
			 }
		
		 else if(Names.equals("Prathiba"))
			{
				 System.out.println("Calling Prathiba");
			 }
		 
		 else 
			{
				System.out.println("Calling no one");
			}
			 */
		
		//SWITCH
		/* String Names = "Anees";
		switch(Names) {
		case "Shakeer":
			System.out.println("Calling Shakeer");
			break;
			
		case "Moosa":
			System.out.println("Calling Moosa");
			break;
			
		case "Jaffar":
			System.out.println("Calling Jaffar");
			break;
			
		case "Prathiba":
			System.out.println("Calling Prathiba");
			break;
			
		default:
			System.out.println("Calling no one");
		}*/ 
		
	
		
	
	}
}

