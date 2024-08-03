
import java.util.Scanner;

public class ArrayInsertFront {
    public static void main(String[] args) {
        int[] x=new int[50];
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number of element");
        int n=s.nextInt();
        System.out.println("Enter "+n+" number elements ");
        int i=0;
        for( i=0; i<n; i++)
        {
            x[i]=s.nextInt();
        }
        System.out.println("Enter the insert element");
        int ele=s.nextInt();
        System.out.println("After instertion");
        for(i=n-1 ; i>=0; i--)
        {
          x[i+1]=x[i];
        }
        x[0]=ele;
        for(i=0; i<n+1; i++)
        {
        System.out.print(x[i]+"\t");
        }
        
    
    }
    
}