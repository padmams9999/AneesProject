package Package1;

public class OverloadingClass {

	public void getData(int a)
	{
		System.out.println("Anees");
	}
	
	public void getData(String b)
	{
		System.out.println("Anees1");
	}
	
	public void getData(int a,int b)
	{
		System.out.println("Anees2");
	}
	
	public void getData(int a,String b)
	{
		System.out.println("Anees3");
	}
	
	public void getData(String b,String c)
	{
		System.out.println("Anees4");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingClass object = new OverloadingClass();
		
		object.getData(5,"Selenium");
		object.getData("Selenium");
		object.getData("test","Selenium");
		object.getData(5);
	}

}
