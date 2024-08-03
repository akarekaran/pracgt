import java.util.Scanner;

class Login
{
	public static void main(String [] args )
	{
		System.out.println("Enter Your id");
		Scanner s=new Scanner(System.in);
		int id=s.nextInt();
		if(id==1234)
		{
			System.out.println("Enter your password");
			int pass=s.nextInt();
				if(pass==1111)
				{
					System.out.println("Login Sucssecfully");
				}
				else
				{
					System.out.println("Invalid Password");
				}
		}
		else{
			System.out.println("Invalid id");
		}
	}
}

			
			
			
					
					
