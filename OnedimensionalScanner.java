import java.util.*;
class OnedimensionalScanner
{
   public static void main(String args[])
   {    
	int len;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Array length : ");
	len=sc.nextInt();
  System.out.println("The object sc belongs to the class: "+ sc.getClass());
	System.out.println();
  int a[]=new int[len];

	System.out.print("Enter " + len + " Element to Store in Array :\n");
        for(int i=0; i<len; i++)
        {
           a[i] = sc.nextInt();
        }   
        System.out.print("Elements in Array are :\n");
        for(int i=0; i<len; i++)
        {
           System.out.println("Elements in index"+ i + ":"+ a[i] + "  ");
        }  
   }
}