import java.util.*;
public class SumSquareMatrix
{
	public static void main(String[] args) 
	{
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		int c[][]=new int[3][3];
		int i,j;
		Scanner sc=new Scanner(System.in);
		/// first matrix ///
		System.out.println("Enter the First matrix ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				
				a[i][j]=sc.nextInt();
			}
			System.out.println(" ");
		}
		/// Second Matrix /////
		System.out.println("Enter the Second matrix ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				
				b[i][j]=sc.nextInt();
			}
			System.out.println(" ");
		}
		/// sum of square matrix ///
		System.out.println("Adding two matrices ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{

				c[i][j]= a[i][j] + b[i][j];
				System.out.println(c[i][j]);
			}
			System.out.println(" ");
		}
				
	}
}