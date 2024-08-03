import java.util.Scanner;

class Atm2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        int a=3;
        do
        {
            System.out.println("Enter your pin");
            int pin= s.nextInt();
            if(pin==1234)
            {
                System.out.println("Welcome to sbi");
            }
            else{
                a--;
                System.out.println("pin is incorrect");
                System.out.println(a+" Attempt left");
            }
            if(a==0)
            {
                System.out.println("card is blocked for 24 hours");
            }
        }while(a>=1);
    }
    
}
