import java.util.Scanner;

class Hexadecimal {
    public static void main(String[] args) {
        int[] x=new int[50]; 
        Scanner s=new Scanner(System.in);
        System.out.println("Enter decimal number");
        int num=s.nextInt();
       int rem=0 ,i=0;
      int count=0;
        while(num!=0)
        {
           rem=num%16;
           x[i]=rem; 
           num=num/16;
           count++;
        }
        System.out.println("Hexadecimal");
        for(i=count-1; i>=0; i--)
        {
            
            if(x[i]==0)
            {
             System.out.println("0");
            } 
            if(x[i]==1)
            {
             System.out.println("1");
            } 
            if(x[i]==2)
            {
             System.out.println("2");
            } 
            if(x[i]==3)
            {
             System.out.println("3");
            } 
            if(x[i]==4)
            {
             System.out.println("4");
            } 
            if(x[i]==5)
            {
             System.out.println("5");
            } 
            if(x[i]==6)
            {
             System.out.println("6");
            } 
            if(x[i]==7)
            {
             System.out.println("7");
            } 
            if(x[i]==8)
            {
             System.out.println("8");
            }
           if(x[i]==9)
           {
            System.out.println("9");
           }
            
           if(x[i]==10)
           {
            System.out.println("A");
           }

           if(x[i]==11)
           {
            System.out.println("B");
           }
           if(x[i]==12)
           {
            System.out.println("C");
           }
           if(x[i]==13)
           {
            System.out.println("D");
           }
           if(x[i]==14)
           {
            System.out.println("E");
           }
           if(x[i]==15)
           {
            System.out.println("F");
           }

        }
    }
    
}
