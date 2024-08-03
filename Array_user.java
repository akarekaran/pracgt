
import java.util.Scanner;

public class Array_user {
    public static void main(String[] args) {
        int[] x=new int[5];
        Scanner s= new Scanner(System.in);
        System.out.println("Enter any 5 integer elements");
        for(int i=0; i<x.length; i++)
        {
            x[i]=s.nextInt();
        }
        System.out.println("Elements of array");
        for(int i=0; i<x.length; i++)
        {
            System.out.print(x[i]+"\t"); 
        }
        System.out.println("\nReverse");
        {
            for(int i=x.length-1; 0<=i; i--)
            {
                System.out.print(x[i]+"\t");
            }
        }

    }
    
}
