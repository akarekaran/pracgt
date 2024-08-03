
import java.util.Scanner;

 class ArrayInsertLast {
    public static void main(String[] args) {
       int[] x=new int[50];
       Scanner s=new Scanner(System.in);
       System.out.println("Enter number of elements");
       int n=s.nextInt();
       System.out.println("Enter any "+n+" elements");
       for(int i=0; i<n; i++)
       {
        x[i]=s.nextInt();
       }
       System.out.println("Enter element to insert");
        x[n]=s.nextInt();
        System.out.println("Element inserted");
        System.out.println("After insertion");
       for(int i=0; i<n+1; i++)
       {
          System.out.print(x[i]+"\t");
       }
    }
    
}
