
import java.util.Scanner;

class octal {
    public static void main(String[] args) {
        int[] x=new int[5];
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any number");
        int num=s.nextInt();
        int rem=0;
        int count=0;
        while(num!=0)
        {
            rem=num%8;
            x[count]=rem;
            num=num/8;
            count++;   
        }
        System.out.println("Octal form");
        for(int i=count-1; i>=0; i--)
        {
            System.out.print(x[i]);
        }

    }
    
}
