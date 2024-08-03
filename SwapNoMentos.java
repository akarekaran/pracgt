import java.util.Scanner;

class SwapNoMentos
{
public static void main(String [] args)
{
	System.out.println("Enter any two no.");
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	int b=s.nextInt();
	//int a=10,b=20;
	System.out.println("Before swapping");
	System.out.println("A="+a+"\nB="+b);
	//System.out.println("B="+b);
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("After swapping");
	System.out.println("A="+a+"\nB="+b);
	//System.out.println("B="+b);
	
	
}
}

	