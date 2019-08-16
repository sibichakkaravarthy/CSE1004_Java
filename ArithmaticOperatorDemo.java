import java.util.*;

class ArithmaticOperatorDemo
{
	public static void main(String[] args) {
		
		int a,b,c,d,e,f; 
		//int a = 20, b = 10, c = 0, d = 20, e = 40, f = 30; 
		//String x ="Sibi",y = "S";

		boolean sibi = false;

		Scanner in = new Scanner(System.in);

		System.out.println("Enter the values for a,b,c,d,e,f");
		a= in.nextInt();
		b= in.nextInt();
		c= in.nextInt();
		d= in.nextInt();
		e= in.nextInt();
		f= in.nextInt();

        // + and - operator 
        System.out.println("a + b = " + (a + b)); 
        System.out.println("a - b = " + (a - b)); 
  
        // + operator if used with strings 
        // concatenates the given strings. 
        //System.out.println("x + y = " + x + y); 
  
        // * and / operator 
        System.out.println("a * b = " + (a * b)); 
        System.out.println("a / b = " + (a / b)); 
  
        // modulo operator gives remainder 
        // on dividing first operand with second 
        System.out.println("a % b = " + (a % b));


        /* Unary Operator */

        int x = a++;

        System.out.println("Value of x increment=" + x);

        System.out.println("Value of a after increment=" + a);

        int y = ++a;

        System.out.println("Value of y increment = " + y);
        System.out.println("Value of a after increment=" + a);

        System.out.println("Boolean value of logical not is =" + !sibi);

        //++a;

        //System.out.println("Actual Value of a before increment (++a) =" + a); 

        /* Assignment operator */

        a = a - 1; 
        b = b + 1;
		
		System.out.println("Value of y increment = " + a);
        System.out.println("Value of a after increment=" + b);
       
        a += 1; 
        b -= 1;

        System.out.println("Value of y increment = " + a);
        System.out.println("Value of a after increment=" + b);


        /* Relationship operator*/

        System.out.println("a == b :" + (a == b));
        System.out.println("a < b :" + (a < b)); 
        System.out.println("a <= b :" + (a <= b)); 
        System.out.println("a > b :" + (a > b)); 
        System.out.println("a >= b :" + (a >= b)); 
        System.out.println("a != b :" + (a != b));
        System.out.println("Boolean value of logical not is =" + (!sibi==false));

       	/* Logical operator (AND and OR) */

        if (((a==b) && (c==d)) || (e ==f))
        {
        	System.out.println("Value of x is = " + x);
        }
        else
        	{
        		System.out.println("Nothing equals so no increment"); 
        	}

        /* Ternary operator - shorthand version of if else*/

        int result = ((a > b) ? (a > c) ? a 
                    : c 
                      : (b > c) 
                        ? b 
                          : c); 

        System.out.println("The biggest value among a,b,c is :" + result);

        /* Bitwise operator (AND, OR, XOR, NOT) */

        int a1 = 5, b1 = 6; 

        System.out.println("a&b = " + (a1 & b1));
        System.out.println("a|b = " + (a1 | b1)); 
        System.out.println("a^b = " + (a1 ^ b1)); 
        System.out.println("~a + ~b = " + (~a1) + (~b1)); 


        /* Shift Operators */

        System.out.println("apply left shift operator"+ (a<<b));

        /* instanceof operator*/

        System.out.println(" Is the object in belongs to Scanner class"+ "\t" 
        	+(in instanceof Scanner));

        System.out.println(" Is the object in belongs to Scanner class"+ "\t" 
        	+(in instanceof Scanner));


}

}

/*
public class ArithmaticOperatorDemo { 
	public static void main(String[] args) 
	{ 
		int a = 20, b = 10, c = 0, d = 20, e = 40, f = 30; 
		System.out.println("a+b/d = " + (a + b / d)); 
		System.out.println("a+b*d-e/f =" + (a + b * d - e / f)); 
	} 
} 


public class ArithmaticOperatorDemo { 
	public static void main(String[] args) 
	{ 
		int a = 20, b = 10, c = 0; 
		a = b+++c; 
		System.out.println("Value of a" +a + " Value of  b" + b + "and c = " + c); 
	} 
} 

		// a=b+++c is compiled as 
		// b++ +c 
		// a=b+c then b=b+1 
		//a = b+++c; 
		//System.out.println("Value of a" +a + " Value of  b" + b + "and c = " + c); 

		// a=b+++++c is compiled as 
		// b++ ++ +c 
		// which gives error. 
		// a=b+++++c; 
		// System.out.println(b+++++c); 
	//} 
//} 

*/