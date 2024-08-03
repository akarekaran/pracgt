import java.util.Scanner;
class Seri
{
    public static void main(String [] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter length");
        int n=s.nextInt();
        for(int i=1; i<=n; i++)
        {
            System.out.printf("1/%d ",i);
			if (n==i)
			{
				break;
			}
			System.out.print("+ \t");
			

        }
    }
}