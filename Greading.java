import java.util.Scanner;

class Greading 
{
	public static void main(String [] args)
	{
		System.out.println("Enter your percentage");
		Scanner s=new Scanner(System.in);
		int per=s.nextInt();
		if(per<0 || per>100)
		{
			System.out.println("Enter valide percentage");
		}
		else{
			if(per>=90)
			{
				System.out.println("A greade");
			}
			else if(per>=75 && per<90)
			{
				System.out.println("B greade");
			}
			else if(per>=60 && per<75)
			{
				System.out.println("C greade");
			}
			else if(per>=35 && per<60)
			{
				System.out.println("D greade");
			}
			else if(per<35)
			{
				System.out.println("Fail");
			}
		}
	}
}

			
				
				