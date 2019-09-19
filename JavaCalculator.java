import java.util.Scanner;
public class JavaCalculator 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        // nextDouble() reads the next double from the keyboard
        double first = in.nextDouble();
        double second = in.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");

        //Char is a single alphabet where as String is a sequence of characters.
        //char is a primitive data type
        char operator = in.next().charAt(0); //This will return the first char of the string

        double result;

        switch(operator)
        {
            case '+':
                result = first + second;
                //break;
            case '-':
                result = first - second;
                break;
            case '*':
                result = first * second;
                break;
            case '/':
                result = first / second;
                break;
            // operator doesn't match any case constant (+, -, *, /)
            default:
                System.out.printf("Error! operator is not correct");
                //return;
        }
        System.out.printf("Number1 \t"+ first + "\t "+ operator  + "\tNumber 2 \t"+  second  + "=\t"+  result);
    }
}