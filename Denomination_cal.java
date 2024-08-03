import java.util.Scanner;
class Denomination_cal {
public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    System.out.println("Enter Amount");
    int amt=s.nextInt();
    int amt500=0,amt200=0,amt100=0,amt50=0,amt20=0,amt10=0,amt5=0,amt2=0,amt1=0;
    while(amt!=0)
    {
       amt500=amt/500;
       amt=amt%500;
       amt200=amt/200;
       amt=amt%200;
       amt100=amt/100;
       amt=amt%100;
       amt50=amt/50;
       amt=amt%50;
       amt20=amt/20;
       amt=amt%20;
       amt10=amt/10;
       amt=amt%10;
       amt5=amt/5;
       amt=amt%5;
       amt2=amt/2;
       amt=amt%2;
       amt1=amt/1;
       amt=amt%1;

    }
    System.out.printf("500 * %d = %d\n",amt500,(500*amt500));
    System.out.printf("200 * %d = %d\n",amt200,(200*amt200));
    System.out.printf("50 * %d = %d\n",amt50,(50*amt50));
    System.out.printf("20 * %d = %d\n",amt20,(20*amt20));
    System.out.printf("10 * %d = %d\n",amt10,(10*amt10));
    System.out.printf("5 * %d = %d\n",amt5,(5*amt5));
    System.out.printf("2 * %d = %d\n",amt2,(2*amt2));
    System.out.printf("1 * %d = %d\n",amt1,(1*amt1));
}  
}
