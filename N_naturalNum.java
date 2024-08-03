import java.util.Scanner;

class N_naturalNum
{
	public static void main(String [] args)
	{
		System.out.println("Enter range");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println("First "+n+" natural number");
		for(int i=1 ; i<=n ; i++)
		{
			
			System.out.println(i);
		}
		System.out.println("First "+n+" natural number");
		for(int i=n ; 1<=i ; i--)
		{
			
			System.out.println(i);
		}
	}
}

		
			