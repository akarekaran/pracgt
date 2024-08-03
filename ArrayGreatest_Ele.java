import java.util.Scanner;

public class ArrayGreatest_Ele {
    public static void main(String[] args) {
        int[] x=new int [5]; 
        int g=x[0];
        Scanner s= new Scanner(System.in);
        System.out.println("Enter any 5 integer element");
        for(int i=0; i<x.length; i++)
        {
            x[i]=s.nextInt();
        }
        for(int i=0; i<x.length; i++)
        {
           
            if(x[i]>g)
            {
                g=x[i];
            }
        }
        System.out.println("Greatest Num = "+g);
        for(int i=0; i<x.length; i++)
        {
          if(x[i]<g)
          {
            g=x[i];
          }
        }
        System.out.println("Smallest Num = "+g);
    }
}