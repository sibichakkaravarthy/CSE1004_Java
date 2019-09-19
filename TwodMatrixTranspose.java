import java.util.*;
class TwodMatrixTranspose
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		int i,j;
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				a[i][j]=sc.nextInt();
				
			}
		}
		//System.out.println("The actual matrix before Transpose is ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				//System.out.print(a[i][j]+" ");
				b[j][i]=a[i][j];
			}
		System.out.println(" ");	
		}
		System.out.println("Transpose Matrix");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(b[i][j]+" ");
			}
		System.out.println(" ");
		}
		
	}
}