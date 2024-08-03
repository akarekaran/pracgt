import java.util.Scanner;

class SwitchGreating
{
	public static void main(String [] args)
	{
		System.out.println("Enter 1 or 2");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		switch(n)
		{
			case 1:
			System.out.println("Good Moring ");
			break;
			
			case 2:
			System.out.println("Good Night");
			break;
			
			default:
			System.out.println("Enter valid option");
			
		}
	}
}

		