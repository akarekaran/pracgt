import java.util.Scanner;
class NaturalNumSum
{
	public static void main(String [] args)
	{
		Scanner n=new Scanner(System.in);
		System.out.println("Enter range");
		int r=n.nextInt();
		int sum=0;
		System.out.println("Natural numbers between 1 to "+r);
		for(int i=1; i<=r; i++)
		{
			System.out.println(i);
			sum=sum+i;
		}
		System.out.println("Sum of 1 to "+r+" = " +sum);
	}
}
