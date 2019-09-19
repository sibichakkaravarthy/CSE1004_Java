public class Tpattern
{
    public static void main(String[] args)
    {
        int i=0,j=0,n=4,k=1;
        for(i=1; i<n+1; i++)
        {
            for(j=0; j<i; j++)
            {
                System.out.print(" "+k*k);
                k++;
            }
            System.out.println(" ");
        }
    }
}