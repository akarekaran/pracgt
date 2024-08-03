import java.util.Scanner;

class EvenoddLoop
{
	public static void main(String [] args )
	{
		System.out.println("Enter range");
		Scanner n=new Scanner(System.in);
		int r=n.nextInt();
		int ecount=0;
		int ocount=0;
		int esum=0,osum=0;
		System.out.println("Even Numbers between 1 to "+r);
		for(int i=1; i<=r; i++)
		{ 
		    if(i%2==0) //"0" is composite number
			{
				System.out.print(i+"\t");
				esum=esum+i;
				ecount++;
			}
			
		}
		System.out.println("\nTotal even numbers between 1 to "+r+" = "+ecount);
		System.out.println("Total sum of even numbers between 1 to "+r+" = "+esum);
		System.out.println("\nOdd Number between 1 to "+r);
		for(int i=1; i<=r; i++)
		{
			
			if(i%2!=0)
			{
				System.out.print(i+"\t");
				osum=osum+i;
				ocount++;
			}
			
		}
		System.out.println("\nTotal odd numbers between 1 to "+r+" = "+ocount);
		System.out.println("Total sum of odd numbers between 1 to "+r+" = "+osum);
	}
}

		