import java.util.*;
class SumMatrixColumn
{
	public static void main(String[] args) 
	{
		
		int i,j, sum = 0;
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the row ");
		int row = sc.nextInt();

		System.out.println("Enter the column ");
		int col= sc.nextInt();

		int a[][]=new int[row][col];

		System.out.println("Enter the matrix ");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				
				a[i][j]=sc.nextInt();
			}
			System.out.println(" ");
		}

		for(i=0;i<col;i++)
		{
			for(j=0;j<row;j++)
			{
				
				sum=sum + a[j][i];
			}
			System.out.println(" sum of the column values are " + sum);
		}

	}
}