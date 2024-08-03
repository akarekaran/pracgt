import java.util.Scanner;

class PassFail
{
	public static void main(String [] args)
	{
		System.out.println("Enter your marks");
		Scanner s=new Scanner(System.in);
		int mark=s.nextInt();
	    if(mark>=35)
		{
			System.out.println("You are Pass");
		}
		else
		{
			System.out.println("You are Fail");
		}
	}
}

			
			