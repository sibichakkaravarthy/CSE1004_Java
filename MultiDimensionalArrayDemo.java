import java.util.Scanner;
class MultiDimensionalArrayDemo
{
	public static void main(String[] args) 
	{
		//int [][] a = new int [3][4];

            int[][] a = {
            			{1, 2, 3, 4, 5}, 
            			{4, 5, 6, 9, 6}, 
            			{7, 4, 5, 6}, 
      			};


      	System.out.println("Length of row 1: " + a[0].length);
      	System.out.println("Length of row 2: " + a[1].length);
      	System.out.println("Length of row 3: " + a[2].length);
      	System.out.println("Length of row 1: " + a[0][1]+ a[0][2]);
      	System.out.println("Length of row 2: " + a[1][1]);
      	System.out.println("Length of row 3: " + a[2][0]);
	}
}