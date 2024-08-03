
import java.util.Scanner;

 class Binary {
    public static void main(String[] args) {
        int[] x=new int[50];
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number");
        int num=s.nextInt();
        int count=0,rem=0;
        while(num!=0)
        {
            rem=num%2;
            x[count]=rem;
            count++;
            num=num/2;
        }
        System.out.println("Binary Form");
        for(int i=count-1; i>=0; i--)
        {
            System.out.print(x[i]+"\t");
        }
        
    }

    
}
