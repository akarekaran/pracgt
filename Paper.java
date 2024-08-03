import java.util.Scanner;

class Paper
{
	public static void main(String [] args)
	{
		System.out.println("Enter marks of paper1");
		Scanner s=new Scanner(System.in);
		int p1=s.nextInt();
		if(p1>=35)
		{
			System.out.println("Pass in Paper 1");
			System.out.println("Enter marks of paper2");
			int p2=s.nextInt();
			if(p2>=35)
			{
				System.out.println("Pass in Paper 2");
			    System.out.println("Enter marks of paper3");
			    int p3=s.nextInt();
				if(p3>=35)
				{
					System.out.println("Pass in Paper 3");
			        System.out.println("Congratulation you are all clear");
				}
				else{
					System.out.println("You are fail in paper 3");
				}
			}
			else{
				System.out.println("You are fail in paper 2");
			}
		}
		else{
			System.out.println("You are fail in paper 1");
		}
	}
}

				
					
				
			
			
		
		