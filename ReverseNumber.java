import java.util.*;
public class ReverseNumber {
    public static void main(String[] args) {
        int num, sumofdigit= 0, reversed = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the Number to reverse");
        num = in.nextInt();

        while(num != 0) 
        {
            int digit = num % 10;
            sumofdigit = sumofdigit + digit;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        System.out.println("Reversed Number: " + reversed);
        System.out.println("Sum of the digits in the given Number: " + sumofdigit);
    }
}