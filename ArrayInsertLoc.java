
import java.util.Scanner;

public class ArrayInsertLoc {
    public static void main(String[] args) {
        int[] x=new int[50];
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n=s.nextInt();
        System.out.println("Enter "+n+" number of elements");
        for(int i=0; i<n; i++)
        {
            x[i]=s.nextInt();
        }
        System.out.println("Enter element for insert");
        int ele=s.nextInt();
        System.out.println("Enter the Location");
        int loc=s.nextInt();
        for(int i=n-1; i>loc-2; i--)
        {
            x[i+1]=x[i];
        }
         x[loc-1]=ele;
        System.out.println("After Insertion\n");
        for(int i=0; i<n+1; i++)
        {
            System.out.print(x[i]+"\t");
        }

    }
    
}
