package Package1;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		
		//2 4 5 8
		//2 4 7 4
		//1 2 6 0
		
		//Rows - 3
		//Columns -4
		
		//[row][column]
		
		/*int [] z = new int[6];
		z[0]=3;
		System.out.println(z[0]);*/
		
		/*int [][] y = new int[3][4];
		y[0][0]=2;
		y[0][1]=4;
		y[0][2]=5;
		y[0][3]=8;
		y[1][0]=2;
		y[1][1]=4;
		y[1][2]=7;
		y[1][3]=4;
		y[2][0]=1;
		y[2][1]=2;
		y[2][2]=6;
		y[2][3]=0;
		
		System.out.println(y[2][2]);*/
		
		
		//int [] x = {4,5,6,8,2,4,5};
		int [][] a = {{2,4,5,8},{2,4,7,4},{1,2,6,0}};
		//System.out.println(a[0][2]);
		//System.out.println(a[2][2]);
		
		for (int row=0;row<=2;row++)
		{
			for(int column=0;column<=3;column++)
			{
				System.out.println(a[row][column]);
			}
		}
		
		
		
		
		
		
		
		

	}

}
