import java.util.*;
class DecimaltoHex
{
	public static void main(String[] args) 
	{
		int rem,decimal,num;  
     	String hex="";   
     	char hexchars[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};  
    	System.out.println("Enter the Decimal number");
    	Scanner sc = new Scanner(System.in);
    	num = sc.nextInt();
    	decimal = num;
    	while(decimal>0)  
     	{  
	       rem=decimal%16;   
	       hex=hexchars[rem]+hex;   
	       decimal=decimal/16;  
     	} 
     	System.out.println("The hexadecimal value is"+" "+hex);
	}
}