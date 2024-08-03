
import java.util.Scanner;

class SumofTwoD {
    public static void main(String[] args) {
        int[][] x=new int[3][3];
        int[][] y=new int[3][3];
        int[][] sum=new int[3][3];
        Scanner s=new Scanner(System.in);
        System.out.println("Enter 9 elements for 1st array");
        for(int i=0; i<x.length; i++)
        {
            for(int j=0; j<x.length; j++)
            {
                x[i][j]=s.nextInt();
            }
        }
        System.out.println("1st Array");
        for(int i=0; i<x.length; i++)
        {
            for(int j=0; j<x.length; j++)
            {
               System.out.print(x[i][j]+"\t");  
            }
            System.out.println();
        }

        System.out.println("Enter 9 elements for 2nd array");
        for(int i=0; i<x.length; i++)
        {
            for(int j=0; j<x.length; j++)
            {
                y[i][j]=s.nextInt();
            }
        }
        System.out.println("2st Array");
        for(int i=0; i<x.length; i++)
        {
            for(int j=0; j<x.length; j++)
            {
               System.out.print(y[i][j]+"\t");  
            }
            System.out.println();
        }
        System.out.println("Sum");
        for(int i=0; i<x.length; i++)
        {
            for(int j=0; j<x.length; j++)
            {
               sum[i][j]=x[i][j]+y[i][j];
               System.out.print(sum[i][j]+"\t");  
            }
            System.out.println();
        }
    }
    
}
