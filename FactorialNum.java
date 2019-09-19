import java.util.*;
class FactorialNum
{
	public static void main(String[] args) {
		int i =1, n , fact = 1;

		Scanner in = new Scanner(System.in);

		n = in.nextInt();
		
		/*do
		{
			fact = fact * i;
			System.out.println(" The Factorial value of the given number is" + fact);
			i++;
		}while (i<=n);*/

		while  (i <= n)
		{
			fact = fact * i;
			System.out.println(" The Factorial value of the given number is" + fact);
			i++;
		}

		/*for (i = 1; i<=n; i++)
		{
			fact = fact * i;
			System.out.println(" The Factorial value of the given number is" + fact);
			//i++;
		}*/
	}
}