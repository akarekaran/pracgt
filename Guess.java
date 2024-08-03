import java.util.Random;
import java.util.Scanner;

class Guess
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Guess any number between 0-99");
        System.out.println("Press -1 to exit");
        int  num=s.nextInt();
        Random r=new Random();
        while(num!=-1)
        {
            int ra=r.nextInt(100);
            System.out.println("Number generated "+ra);
            if(num==ra)
            {
                System.out.println("You won");
                break;
            }
            else{
                System.out.println("You Lost");
                System.out.println("Guess any number between 0-99");
                System.out.println("Press -1 to exit");
                num=s.nextInt();
            }
        }
    }
}