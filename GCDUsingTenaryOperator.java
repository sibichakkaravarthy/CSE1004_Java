import java.util.Scanner;
public class GCDUsingTenaryOperator 
{
    public static void main(String... args) 
    {
       
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number to find GCD");
        int n1 = scanner.nextInt();
        System.out.println("Please enter second number to find GCD");
        int n2 = scanner.nextInt();
        n1 = ( n1 > 0) ? n1 : -n1;
        n2 = ( n2 > 0) ? n2 : -n2;
        while(n1 != n2)
        {
            if(n1 > n2)
                n1 -= n2;
            else
                n2 -= n1;
        }
        System.out.println("G.C.D = " + n1);
    }
}