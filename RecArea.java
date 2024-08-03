import java.util.Scanner;

class RecArea
{
	public static void main(String [] args)
	{
		System.out.println("Enter the breadth of Rectangle");
		Scanner s= new Scanner(System.in);
		int b=s.nextInt();
		
		System.out.println("Enter the length of Rectangle");
		//Scanner s=new Scanner(System.in);
		int l=s.nextInt();
		int area=l*b;
		System.out.println("Area of recatangle = "+area);
	}
}