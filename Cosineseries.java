import java.util.Scanner;
class Cosineseries
{
    public static void main(String[] args) {

        int i=1, n;
        double x,x1, t=1, sum=1 ;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter the value for x : ");
        x = in.nextDouble();

        System.out.println("Enter the value for x : ");
        n = in.nextInt();

        x1=x*3.14159/180;

        //for(i=1;i<=n;i++)
        while (i<n)
        {
            t=t*(-1)*x1*x1/(2*i*(2*i-1));
            sum=sum+t;
            i++;
        }
        
        System.out.println("The cosine value for:" + x + "\t"+"is" + "\t"+ sum);
    }
}