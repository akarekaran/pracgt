import java.util.Scanner;

 class SumNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number any number (enter 0 for exit)");
        int num=s.nextInt();
        int sum=0,count=0;
        while(num!=0)
        {
            sum=sum+num;
            //int num1;
            System.out.println("Enter number");
            num=s.nextInt(); 
           // num=num1; 
            count++;  
        }
        System.out.println("Digits = "+count);
        System.out.println("Sum="+sum);

    }
    
}
