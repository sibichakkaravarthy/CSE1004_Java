



import java.util.*;
class SumNum
{
	public static void main(String[] args) {
		int i =1, n , sum = 0;

		System.out.println(" Enter the number ");
		Scanner in = new Scanner(System.in);

		n = in.nextInt();

		while  (i <= n)
		{
			sum = sum + i;
			
			i+=2;
		}
		System.out.println(" The Sum of the given number is" + sum);


	}
}