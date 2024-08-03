import java.util.Scanner;

class SwitchDay
{
	public static void main(String [] args)
	{
		System.out.println("Enter 1-7 for day");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		
		switch(num)
		{
			case 1:
			System.out.println("Sunday");
			break;
			
			case 2:
			System.out.println("Monday");
			break;
			
			case 3:
			System.out.println("Thusday");
			break;
			
			case 4:
			System.out.println("Wednesday");
			break;
			
			case 5:
			System.out.println("Thursday");
			break;
			
			case 6:
			System.out.println("Firday");
			break;
			
			case 7:
			System.out.println("Saturday");
			break;
			
			default:
			System.out.println("invalid option");
			
		}
	}
}
