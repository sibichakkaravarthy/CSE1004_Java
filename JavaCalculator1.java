import java.util.Scanner;
public class JavaCalculator1 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        // nextDouble() reads the next double from the keyboard
        double first = in.nextDouble();
        double second = in.nextDouble();

        System.out.print("Enter an operator (+= 1, -= 2, *= 3, /= 4): ");
        //int operator = in.nextInt();

        int operator = in.nextInt();

        double result;

 
        switch(operator)
        {
            case 1:
            {
                result = first + second;
                break;
            }
            case 2:
            {
                result = first - second;
                break;
            }
            case 3:{
                result = first * second;
                break;}
            case 4:{
                result = first / second;
                break;}
            // operator doesn't match any case constant (+, -, *, /)
            default:{
                System.out.printf("Error! operator is not correct");
                return;}
        }


        System.out.printf("Number1 \t"+ first + "\t "+ operator  + "\tNumber 2 \t"+  second  + "=\t"+  result);
    }
}