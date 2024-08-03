import java.util.Scanner;

class GreatestThree
{
	public static void main(String [] args)
	{
		System.out.println("Enter first number");
		Scanner s=new Scanner(System.in);
		int n1=s.nextInt();
		System.out.println("Enter second number");
		int n2=s.nextInt();
		System.out.println("Enter third number");
		int n3=s.nextInt();
		if(n1>n2)
		{
			System.out.println(n1+" is greater");
		}
		else if(n2>n3)
		{
			System.out.println(n2+" is greater");
		}
		else{
			System.out.println(n3+" is greater");
		}
		
	}
}

			
			
		