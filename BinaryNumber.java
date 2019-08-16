import java.util.*;

public class BinaryNumber
{
   
    public static void main(String[] args)
    {
        boolean isBinary = true;
 
        int copyOfNumber, number;

        Scanner in = new Scanner(System.in);

        number = in.nextInt();

        copyOfNumber = number;
 
        while (copyOfNumber != 0)
        {
            int temp = copyOfNumber%10;   //Gives last digit of the number
 
            if(temp > 1)
            {
                isBinary = false;
                break;
            }
            else
            {
                copyOfNumber = copyOfNumber/10;    //Removes last digit from the number
            }
        }
 
        if (isBinary)
        {
            System.out.println(number+" is a binary number");
        }
        else
        {
            System.out.println(number+" is not a binary number");
        }
 
    }
}