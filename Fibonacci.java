import java.util.Scanner;
class Fibonacci
{
    public static void main(String [] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter range");
        int n=s.nextInt();
        System.out.println("--------------------");

        int a=0;
        int b=1;
        int c;
        System.out.println(a+"\n"+b);
        for(int i=1; i<=n-2; i++)
        {
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;


        }
    }
}