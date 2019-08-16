import java.util.*;
class FactorialNum
{
	public static void main(String[] args) {
		int i =1, n , fact = 1;

		Scanner in = new Scanner(System.in);

		n = in.nextInt();

		while  (i <= n)
		{
			fact = fact * i;
			System.out.println(" The Factorial value of the given number is" + fact);
			i++;
		}
	}
}