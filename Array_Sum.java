
import java.util.Scanner;

public class Array_Sum {
    public static void main(String[] args) {
        int[] x=new int[5];
        int[] y=new int[5];
        int[] sum=new int[5];
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any 5 integer elements for array 1");
        for(int i=0; i<x.length; i++)
        {
            x[i]=s.nextInt();

        }
        System.out.println("Enter any 5 integer elements for array 2");
        for(int i=0; i<x.length; i++)
        {
            y[i]=s.nextInt();
        }
        System.out.println("Sum of array 1 and array 2");
        for(int i=0; i<x.length; i++)
        {
            sum[i]=x[i]+y[i];
           System.out.print( sum[i]+"\t");
        }
    
}
}

