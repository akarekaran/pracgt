 import java.util.Scanner;

 class DoWhile {
   public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    int even=0,ec=0;
    int odd=0,oc=0;
    int num;
    
    do { 
        System.out.println("Enter any number");
        num=s.nextInt();
       
        if(num!=0)
        {
          if(num%2==0)
          {
            even=even+num;
            ec++;
          }
          else{
            odd=odd+num;
            oc++;
          }
        }
        
        
    } while (num!=0);
    System.out.println("Total even num = "+ec);
    System.out.println("Even="+even);
    System.out.println("Total odd num = "+oc);
    System.out.println("Odd="+odd);


   }
    
}
