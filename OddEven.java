import java.util.*;
class OddEven
{
	public static void main(String[] args) 
	{
		int i, num;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number to iterate");
		num = in.nextInt();

		for (i =0; i<=num; i++)
		{
			if(i%2==0)
			{
				continue;
			}
		System.out.print(i + " "); 
		}

	}
}