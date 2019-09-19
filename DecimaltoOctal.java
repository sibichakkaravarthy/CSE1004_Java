import java.util.*;
class DecimaltoOctal
{
	public static void main(String[] args) 
	{
		int num, decimal;
		int octalNumber = 0, i = 1; 
		System.out.println("Enter the Decimal number");
    	Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		decimal = num;
        while (decimal != 0)
        {
            octalNumber += (decimal % 8) * i;
            decimal /= 8;
            i *= 10;
        }
        System.out.printf("%d in decimal = %d in octal", num, octalNumber);
	}
}