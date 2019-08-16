import java.util.*;
class AgeCalculator
{
	public static void main(String[] args) {
		int d1,d2,d3,m1,m2,m3,y1,y2,y3;

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the current date");
		System.out.println("Enter the current day");
		d1 = in.nextInt();
		System.out.println("Enter the current month");
		m1 = in.nextInt();
		System.out.println("Enter the current year");
		y1 = in.nextInt();

		System.out.println("Enter the date of birth");
		System.out.println("Enter the day of birth");
		d2 = in.nextInt();
		System.out.println("Enter the month of birth");
		m2 = in.nextInt();
		System.out.println("Enter the year of birth");
		y2 = in.nextInt();

		if(d2>d1)
    	{
		    m1=m1-1;
		    d1=d1+30;
		}
    	if(m2>m1)
    	{
		    y1=y1-1;
		    m1=m1+12;
    	}
    	if(y2>y1)
    	{
    		System.exit(0);
    	}
	    d3=d1-d2;
	    m3=m1-m2;
	    y3=y1-y2;
	    System.out.println("Current age is \t"+y3 + "years and \t" +m3+ "months and \t" + d3+ "days");
	}
}