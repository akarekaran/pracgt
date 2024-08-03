
import java.util.Scanner;

 class Time_htom {
public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter time in hours");
    int h=s.nextInt();
    System.out.println("Enter min");
    int m=s.nextInt();
    int hm=h*60;
    hm+=m;
    System.out.println(h+" hours = "+hm+" minutes");
}
    
}
