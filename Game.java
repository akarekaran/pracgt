import java.util.Random;
import java.util.Scanner;
class Game 
{
    public static void main(String [] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Guess the number between (0-50)\nEnter -1 for Exit");
        int g=s.nextInt();
        Random r=new Random();
       
        
        
        while(g!=-1)
        {
          int ra=r.nextInt(10);
          System.out.println("Genrated Number = "+ra);  
        if(g==ra)
        {
            System.out.println("you win");
            break;
        }
        else
        {
            System.out.println("loss the game");
            System.out.println("Guess the number between (0-50)\nEnter -1 for Exit");
            g=s.nextInt();
        }
       }
      

        

    }
}
