import java.util.Scanner;
class Prime
{
	
	public static void main (String [] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any number");
		int num=s.nextInt();
		int r=0;
		
		for(int i=2; i<num; i++)
		{
			if(num%i==0)
			{
	            r=0;
			}
			else
			{
				r=1;
			}
		}
	    if( r==0)
		{
			System.out.println("Not prime");
		}
		else
		{
			System.out.println("prime");
		}
		
	}
}

			

