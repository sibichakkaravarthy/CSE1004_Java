import java.util.*;
class SwapNumbers
{
	public static void main(String args[]) {
		int a,b,c;
		Scanner in = new Scanner(System.in);

		a = in.nextInt();
		b = in.nextInt();

		System.out.println("The number before swapping:" + a + "\t" + b);
		c = a;
		a = b;
		b = c; 

		System.out.println("The number swapped are:" + a + "\t" + b);

		System.out.println("Swapping without temporary variable");

		a = a+ b;
		b = a-b;
		a = a - b;

		System.out.println("The number swapped without temporary variable are:" + a + "\t" + b);
	}
}