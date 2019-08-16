import java.util.Scanner;

class Fibonacc
{
	public static void main(String[] args) 
	{
		int sum, i = 1, n, t1 = 0, t2 = 1;   

		Scanner input = new Scanner(System.in);

		System.out.println ("\n Enter the Fibonacci series number:");

		n = input.nextInt();

		while (i <= n)
        {
            System.out.print(t1 + " + ");
            sum = t1 + t2;
            t1 = t2;
            t2 = sum;
            i++;
        }

		
	}
		
}