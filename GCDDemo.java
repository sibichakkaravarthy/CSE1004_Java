import java.util.Scanner;
public class GCDDemo 
{
    public static void main(String args[])
    {
        int gcd = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number to find GCD");
        int number1 = scanner.nextInt();
        System.out.println("Please enter second number to find GCD");
        int number2 = scanner.nextInt();
        for(int i = 1; i <= number1 && i <= number2; ++i)
        {
           if(number1 % i==0 && number2 % i==0)
           {
                gcd = i;
           }
        }
        System.out.printf("G.C.D of %d and %d is %d", number1, number2, gcd);
    }
}