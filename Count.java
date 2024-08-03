import java.util.Scanner;

class Count {
    public static void main(String [] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter n digit number");
        int num=s.nextInt();
        int cou=0;
        int swap=num;
        while(num!=0)
        {
          int rem=num%10;
           num= num/10;
          cou++;
        }
        System.out.println(swap+" is "+cou+" digits");
        System.out.printf("%d is %d digits",swap,cou);
    }
    
}

