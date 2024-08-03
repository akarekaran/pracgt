import java.util.Scanner;

class Vote
{
	public static void main(String [] args )
	{
		System.out.println("Enter Your age");
		Scanner s=new Scanner(System.in);
		int age=s.nextInt();
		int dif=18-age;
		if(age<=0)
		{
			System.out.println("Please Enter age in positive number");
	    }
		else{
			if(age>=18)
		    {
			System.out.println("You eligible for Votting");
		    }
		    else{
			System.out.println("You are not eligible for Votting\nplease wait "+dif+" year for vote" );
		    }
		}
	}
}

			