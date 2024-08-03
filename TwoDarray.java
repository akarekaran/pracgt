
import java.util.Scanner;

class TwoDarray {
    public static void main(String[] args) {
        int[][] x=new int [3][3];
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any 9 elements");
        for(int i=0; i<x.length; i++)
        {
            for(int j=0; j<x[i].length;j++)
            {
              x[i][j]=s.nextInt();
            }
        }
        System.out.println("Matrix");
        for(int i=0; i<x.length; i++)
        {
            for(int j=0; j<x[i].length; j++)
            {
                System.out.print(x[i][j]+"\t");
            }
            System.out.println();
        }
        
    } 
}
