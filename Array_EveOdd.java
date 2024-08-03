import java.util.Scanner;
public class Array_EveOdd
{
    public static void main(String[] args) 
    {
        int[] x=new int[10];
        int[] even=new int[10];
        int[] odd=new int[10];
        Scanner s=new Scanner(System.in);
        System.out.println("Enter 10 integer number");
        for(int i=0; i<x.length; i++)
        {
            x[i]=s.nextInt();
        }
        int j=0,k=0;
        System.out.println("Even");
        for(int i=0; i<x.length; i++)
        {
            if(x[i]%2==0)
            {
                even[j]=x[i];
                j++;
            }
            else{
                odd[k]=x[i];
                k++;
            }
        }
        System.out.println("Even");
        for(int i=0; i<j; i++)
        {
            System.out.print(even[i]+"\t");
        }
        System.out.println("\nTotal even element = "+j);
        System.out.println("\nOdd");
        for(int i=0; i<k; i++)
        {
            System.out.print(odd[i]+"\t");
        }
        System.out.println("\nTotal odd element = "+k);
    } 
}
