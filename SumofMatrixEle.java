
import java.util.Scanner;

 class SumofMatrixEle {
public static void main(String[] args) {
    int[][] x=new int[3][3];
   // int[][] sum=new int[3][3];
    Scanner s=new Scanner(System.in);
    int sum=0;
    System.out.println("Enter 9 elements");
    for(int i=0;i<3;i++)
    {
        for(int j=0;j<3;i++)
        {
            x[i][j]=s.nextInt();
            sum=sum+x[i][j];
        }
    }
    System.out.println("Matrix");
    for(int i=0; i<3;i++)
    {
        for(int j=0; j<3; j++)
        {
            System.out.print(x[i][j]+"\t");
        }
    }
    System.out.println("Sum of array elements = "+sum);



}    
}
