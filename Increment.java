class Increment
{
public static void main (String []args)
{
int a=10, b=10;
//int x=a++;
int y=++b;
a++;

//1] int x=a++ + 20; (are not allowed beacuse 20 is constant value)
//2] int x=++(++x); (nexting is not allowed)
//3] final int x=10; (error:-cannot assign a value to final variable)
//4] boolean b=true; (cannot applied to booleantype)

     
		  
System.out.println("x="+a);
System.out.println("y="+y);

}
}