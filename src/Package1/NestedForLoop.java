package Package1;

public class NestedForLoop {

	public static void main(String[] args) {
		//Nested Forloop
		
				//1 2 3 4 - 1 row ; 4 colums
				//5 6 7    - 2 row ; 3 colums
				//8 9     - 3 Row ; 2 colums
				//10     - 4 Row ; 1 colums
				
				
				// totally 3 Rows and 4 Columns with -1 for each iteration. 
				//So outer loop should 4 times and inner loop should run for 4 times but each time -1
				int k=1;
				for(int i=0;i<4;i++)
				{
					 for (int j=1;j<=4-i;j++)
					 {
						 System.out.print(k);
						 k++;
						 System.out.print("\t");
						 
					 }
					 System.out.println("");
				} 
				
			
			//Outer loop = Rows
			//inner loops = COlumns
			
					//1	 - 1 row ; 1 colums
					//2 3    - 2 row ; 2 colums
					//4 5 6     - 3 Row ; 3 colums
					//7 8 9 10    - 4 Row ; 4 colums
			
			/*int k=1;
			for (int rows=1; rows<5; rows++)
			{
				for (int column=1; column<=rows;column++)
				{
					System.out.print(k);
					k++;		
					System.out.print("\t");
				}
				System.out.println("");
			} */
				
			
				//1  - 1 row ; 1 columns
				//1 2  - 2 row ; 2 columns
				//1 2 3  - 3 row ; 3 columns
				//1 2 3 4  - 4 row ; 4 columns
				
				

	}

}
