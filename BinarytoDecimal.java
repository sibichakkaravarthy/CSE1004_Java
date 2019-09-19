import java.util.*;
class BinarytoDecimal
{
	public static void main(String[] args) 
	{
		int binary;
    	System.out.println("Enter the binary number");
    	Scanner sc = new Scanner(System.in);
    	binary = sc.nextInt();
    	int num = binary; 
        int decimal = 0; 
        int base = 1; 
        while (num > 0) 
        { 
            int last_digit = num % 10; 
            num = num / 10; 
            decimal += last_digit * base; 
            base = base * 2;
        } 
    	System.out.println("The Decimal number is" + decimal);  
	}
}