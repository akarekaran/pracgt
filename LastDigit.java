
import java.util.Scanner;

class LastDigit 
{
    public static void main(String[] args) 
    {
        int rem,sum=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter n digit numbre");
        int num=s.nextInt();
        while(num!=0)
        {
            rem=num%10;
            System.out.println(rem);
            num=num/10;
            sum=sum+rem;
        }
        System.out.println("\nSum of given number of digits = "+sum);

    }

    
}
