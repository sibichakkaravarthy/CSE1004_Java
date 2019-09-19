import java.util.*;
class StarMatrixPattern
{
	public static void main(String[] args) 
	{
		int n,space;
		System.out.println("Enter the number for pattern generation");
		Scanner sc=new Scanner(System.in);
		n =  sc.nextInt();
		space = n - 1;
        // run loop (parent loop)  
        // till number of rows 
        for (int i = 0; i < n; i++) 
        { 
            // loop for initial space,  
            // before star printing 
            for (int j = 0; j < space; j++) 
                System.out.print(" "); 
      
            // Print i+1 stars 
            for (int j = 0; j <= i; j++) 
                System.out.print("* "); 
      
            System.out.print("\n"); 
            space--; 
        } 

        space = 0; 
      
        // run loop (parent loop)  
        // till number of rows 
        for (int i = n; i > 0; i--) 
        { 
            // loop for initially space,  
            // before star printing 
            for (int j = 0; j < space; j++) 
                System.out.print(" "); 
      
            // Print i stars 
            for (int j = 0; j < i; j++) 
                System.out.print("* "); 
      
            System.out.print("\n"); 
            space++; 
        } 
	}
}