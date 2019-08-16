import java.util.*;

class FibonacciSeries
{
	public static void main(String[] args) {
		
		int n1=0,n2=1,n3,i =1,n; 

		Scanner input = new Scanner(System.in);

		System.out.println(" Enter the number ot generate Fibo series");

		n = input.nextInt();

		System.out.println(n1 +" " + n2);

		while (i<n)
		{
			n3=n1+n2;    
  			System.out.print(" "+n3);    
  			n1=n2;    
  			n2=n3;
  			i++; 
		}


	}
}