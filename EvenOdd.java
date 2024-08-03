import java.util.Scanner;

class EvenOdd
{
	public static void main(String [] args)
	{
		System.out.println("Enter any number");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(n%2==0)
		{
			System.out.println(+n+" is Even");
		}
		else
		{
			System.out.println(+n+" is Odd");
		}
	}
}

			

