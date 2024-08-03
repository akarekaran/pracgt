import java.util.Scanner;

class Posnegative
{
	public static void main(String [] args)
	{
		System.out.println("Enter any number");
		Scanner s= new Scanner(System.in);
		int num=s.nextInt();
		if(num>0)
		{
			System.out.println(num+" is positive");
		}
		else if(num<0)
		{
			System.out.println(num+" is negative");
		}
		else{
			System.out.println(num+" is null value");
		}
	}
}

			
