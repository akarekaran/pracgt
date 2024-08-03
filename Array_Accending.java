import java.util.Scanner;

public class Array_Accending {
    
    public static void main(String[] args) {
        int[] x=new int [5];
        Scanner s=new Scanner(System.in);
        int[] min=new int[5];
        System.out.println("Enter any 5 elements");
        for(int i=0; i<x.length; i++)
        {
            x[i]=s.nextInt();
        }

        for(int i=0; i<x.length; i++)
        {
            int j=0;
            if(x[i]<x[0])
            {
                x[0]=x[i];
                min[j]=x[i];
                j++;
            }
        }
        for(int i=0; i<x.length; i++)
        {
            System.out.println(min[i]);
        }
       
    
    }
}
