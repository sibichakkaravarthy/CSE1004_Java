import java.util.Scanner;
class SquareRootDemo { 

    public static void main(String[] args)  
    { 
	//int number;
	System.out.print("Enter any number:");
	Scanner scanner = new Scanner(System.in);
	int number = scanner.nextInt(); 
	double temp;

	double sr = number / 2;

	do {
		temp = sr;
		sr = (temp + (number / temp)) / 2;
	} while ((temp - sr) != 0);

	//return sr;

	System.out.println("Square root of "+ number+ " is: "+sr);
    } 
}