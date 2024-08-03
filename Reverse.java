
import java.util.Scanner;

 class Reverse {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter n digit number");
        int num=s.nextInt();
        int re=0,rem; 
        while(num!=0)        //num=173              | num=17               | num =1 
        {
           rem=num%10;      //  rem=173%10 ===> 3   | rem=17%10   ===> 7   | rem=1%10 ===> 1 
           re=re*10+rem;   //  re=0*10+3  ===>  3   | re= 3*10+7 ===> 37   | re= 37*10+1 ===>371
           num=num/10;    //   num=173/10 ===> 17   | num= 17/10 ===> 1    | num= 1/10 ==>0
        }
     System.out.println(re);
    }
}
