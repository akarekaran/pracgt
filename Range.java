
import java.util.Scanner;

class Range 
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter starting range");
        int sta=s.nextInt();
        System.out.println("Enter ending range");
        int end=s.nextInt();
        for(int i=sta; i<=end; i--)
        {
            System.out.println(i);
        }


    }
}
