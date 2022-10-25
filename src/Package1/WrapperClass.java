package Package1;

public class WrapperClass {

	public static void main(String[] args) {
		String Mobile = "9999.99";
		String headset = "99.99";
		
		
		//wrapper for primitive dataTypes
		//boolean  -  Boolean
		//char	   -  Character
		//int	   -  Integer
		//double   -  Double
		
		
		/*int mobileprice = Integer.parseInt(Mobile);
		 int headsetprice = Integer.parseInt(headset);
		 
		 int total = mobileprice+headsetprice;
		 //String  total = Mobile+headset;
		System.out.println(total); */
		
		double mobileprice = Double.parseDouble(Mobile);
		double headsetprice = Double.parseDouble(headset);
		double total = mobileprice+headsetprice;
		System.out.println(total); 
		
		
	}

}
