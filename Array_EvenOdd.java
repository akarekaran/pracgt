import java.util.Scanner;

public class Array_EvenOdd {
    
    public static void main(String[] args) {
        int[] x=new int[10];
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any 10 integer elements");
        for(int i=0; i<x.length; i++)
        {
            x[i]=s.nextInt();
        }
        System.out.println("Even");
        for(int i=0; i<x.length; i++)
        {
            if(x[i]%2==0)
            {
                System.out.print(x[i]+"\t");
            }
           
        }
        System.out.println("\nodd");
        for(int i=0; i<x.length; i++)
        {
            if(x[i]%2!=0)
            {
              System.out.print(x[i]+"\t");
            }
        }
    }
}