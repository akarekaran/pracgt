import java.util.Scanner;
class Time_Converter
{
public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    System.out.println("Enter time in minutes");
    int min=s.nextInt();
    int mtoh;
    mtoh=min/60;
    int mtohm=min%60;
        
    
    System.out.println(min+" minutes = "+mtoh+" hours "+mtohm+" min");


}
}