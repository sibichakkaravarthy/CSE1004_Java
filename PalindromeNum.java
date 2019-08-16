import java.util.*;
public class PalindromeNum {
    public static void main(String[] args) {
        int num, sumofdigit= 0, reversed = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the Number to Check for palindrome");
        num = in.nextInt();
        int num1 = num;

        while(num1 != 0) 
        {
            int digit = num1 % 10;
            reversed = reversed * 10 + digit;
            num1 /= 10;
        }

        if (reversed == num)
        {
            System.out.println("The given number is palindrome");
        }
        else
        {
            System.out.println("Not a palindrome");
        }
    }
}