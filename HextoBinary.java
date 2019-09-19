import java.util.Scanner;
public class HextoBinary
{
     public static void main(String args[])
    {
        String hexdec_num,s;
        int dec_num, i=1, j;
        int bin_num[] = new int[100];
        String digits = "0123456789ABCDEF";
   
    
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter Hexadecimal Number : ");
        hexdec_num = sc.nextLine();
        
        s = hexdec_num.toUpperCase();

        int val = 0;
             for (int k = 0; k < s.length(); k++)
             {
                 char c = s.charAt(k);
                 int d = digits.indexOf(c);
                 val = 16*val + d;
             }
        
        /* convert hexadecimal to decimal */        
        dec_num = val;
        
        /* convert decimal to binary */        
        while(dec_num != 0)
        {
            bin_num[i++] = dec_num%2;
            dec_num = dec_num/2;
        }
		
        System.out.print("Equivalent Binary Number is: ");
        for(j=i-1; j>0; j--)
        {
            System.out.print(bin_num[j]);
        }
        System.out.print("\n");
    }
}
