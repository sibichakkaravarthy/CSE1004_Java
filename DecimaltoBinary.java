import java.util.*;
class DecimaltoBinary
{
	public static void main(String[] args) 
	{
		int binary[] = new int[40];
     	int num, index = 0;
     	Scanner sc = new Scanner(System.in);
     	System.out.println("Enter the input decimal number");
     	num = sc.nextInt();
     	if(num == 0)
     	{
     		System.out.println("Please enter the number greater than zero");
      	}
     	else
     	{
	    	while(num > 0)
	    	{
	       		binary[index++] = num%2;
	       		num = num/2;
	     	}
	     	for(int i = index-1;i >= 0;i--)
	     	{
	       		System.out.print(binary[i]);
	     	}
     	}
	}
}
