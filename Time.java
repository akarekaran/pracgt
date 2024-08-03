import java.util.Scanner;

class Time
{
 public static void main(String [] args)
 {
	 System.out.println("Enter time in hours");
	 Scanner s= new Scanner(System.in);
	 int h= s.nextInt();
	 int min=h*60;
	 int sec=h*3600;
	 int day=h/24;
	 int dayh=h%24;
	 System.out.println(h+" hours =" +min+" minutes");
	 System.out.println(h+" hours =" +sec+" seconds");
	 System.out.println(h+" hours =" +day+" day,"+dayh+" hours");
	 System.out.println("--------------------------------------------");
	 
	 System.out.println("Enter time in minutes");
	 //Scanner s=new Scanner(System.in);
	 int m = s.nextInt();
	 int hou=m/60;
	 int hou1=m%60;
	 int sec1=m*60;
	 int day1=m/1440;
	// int dayh1=m%1440;
	 
	 System.out.println(m+" minutes = "+hou+" hours "+hou1+" min");	
	 System.out.println(m+" minutes = "+sec1+" seconds");	 
	 System.out.println(m+" minutes =" +day1+" day "+hou+" hours "+hou1+" min");
     System.out.println("-----------------------------------------------");
     System.out.println("Enter time in seconds");
	
	 //Scanner s=new scanner(System.in);
	 int  sec2=s.nextInt();
	 int h1=sec2/3600;
	 int m1=sec2/60;
	 int day2=sec2/86400;
	 System.out.println(sec2+" seconds = "+h1+" hours");	
	 System.out.println(sec2+" seconds = "+m1+" minutes");
     System.out.println(sec2+" seconds=" +day2+" day");	 
    
}
}
