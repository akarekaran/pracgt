import java.util.Scanner;

class FirstCode
{
public static void main(String [] arg)
{
Scanner s=new Scanner (System.in);
System.out.println("Enter value for x");
int x=s.nextInt();
System.out.println("Enter value for y");
int y=s.nextInt();
System.out.println("Value of X = "+x);
System.out.println("Value of Y = "+y);
int sum=x+y;
int diff=x-y;
int mul=x*y;
int div=x/y;
System.out.println("Sum of "+x+"+"+y+" = "+sum);
System.out.println("Diff of "+x+"-"+y+" ="+diff);
System.out.println("mul of "+x+"*"+y+" = "+mul);
System.out.println("div of "+x+"/"+y+" = "+div);
}
}