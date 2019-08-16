import java.util.Scanner;
public class SimpleCalculatorWithoutSwitchCase {

	public static void main(String[] args) {
		
		Scanner in =new Scanner(System.in);//This calls in inputs from the computer
		
		int fnum,snum,ans;
		char sign;  //THIS ASSIGNS THE CHARACTER VARIABLE + - * /
		
		// My First Introduction word in the program
		System.out.println("Welcome User");
		
		System.out.print("Please Enter your first digit: "); 
		
		fnum=in.nextInt(); /*This receive input from user
		it receive the first number*/
		
		System.out.print("Enter the second digit: ");
		snum=in.nextInt();

		/*This receive input from user
		it receive the second number*/
		
		System.out.print("Enter the mathematical operator to be used: "); //Ask the user to input the mathematical operator to be used
		sign=in.next().charAt(0); //Receive input from user

		if (sign == '+' )/*making use of if statement to determine the addition sign*/{
			ans=fnum + snum;
			System.out.println(fnum +" "+sign +" "+snum +"= "+" "+ ans );
		}
		else if(sign == '-')/* else if statement for minus sign*/
		{
			ans=fnum-snum;
			System.out.println(fnum +" "+sign +" "+snum +"= "+" "+ ans );
		}
		else if(sign == '/'){
				ans=fnum/snum;
				System.out.println(fnum +" "+sign +" "+snum +"= "+" "+ ans );
	    }
		else if(sign == '*'){
					ans=fnum*snum;
					System.out.println(fnum +" "+sign +" "+snum +"= "+" "+ ans );
		}
		else
			
		System.out.println("Your Input is not correct,please check it for any error(s).");
		
		
			
	}

}