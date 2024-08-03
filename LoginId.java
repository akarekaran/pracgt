import java.util.Scanner;

class LoginId
{
	public static void main(String [] args)
	{
		System.out.println("Enter your Id");
		Scanner s=new Scanner(System.in);
		String id=s.next();
		if(id.equals("karan"))
		{
			System.out.println("Enter your password");
		    String pass=s.next();
			if(pass.equals("admin123"))
			{
				System.out.println("Login Succussfully");
			}
			else{
				System.out.println("Invalid Password");
			}
		}
	    else{
			System.out.println("Invalid id");
		}
		
	}
}

	
		
			
				
				
			
		
		
			
		
		