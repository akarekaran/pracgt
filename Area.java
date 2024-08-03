import java.util.Scanner;

class Area
{
	public static void main(String [] args)
	{
	    System.out.println ("Enter radius");
		Scanner s=new Scanner (System.in);
		int r=s.nextInt();
		
		
		
		double a=(3.14)*r*r;
		System.out.println("Area = "+a);
	}
}

