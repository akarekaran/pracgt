import java.util.Scanner;
class SwitchATM
{
	public static void main(String [] args)
	{
	 System.out.println("Insert Your Card");
	 System.out.println("----------------------------");
	 System.out.println("Press:-\n w=Withdraw\n d=Deposite\n b=Check Balance\n p=Pin change\n e=Exit");
	 Scanner s=new Scanner(System.in);
	 char ch=s.next().charAt(0);
	 if(ch=='w' || ch=='d' || ch=='b' || ch=='p' || ch=='e' )
	 {
	System.out.println("Enter your pin\n------------------");
	int pin=s.nextInt();
	int bal=10000;
	int deb;
	if(pin==1234)
	{	
	 switch(ch)
	 {
		 case 'w':
		 System.out.println("You select withdraw\nEnter amount for withdraw");
		 int amt=s.nextInt();
		 if(bal>amt && bal-amt>=500)
		 {
			deb=bal-amt;
			System.out.println("Withdraw successfully\nCollect Your Cash");	
            System.out.println("Balance Amount Rs."+deb);			
		 }
		 else if(bal-amt<500)
		 {
			 System.out.println("Minimum Rs.500 Balance are Required");
		 } 
		 else 
		 {
			 System.out.println("Balance not available");	 	 
	     }
		 break;
		 
		 case 'd':
		 System.out.println("You select Deposit\nEnter amount for Deposit");
		 int dep=s.nextInt();
		 if(dep>=100)
		 {
			System.out.println("Insert Your Cash in Machine");
			System.out.println("You Deposit Rs."+dep);
			System.out.println("Your cash Deposit Successfully");
			bal=bal+dep;
			 System.out.println("Balance Amount Rs."+bal);
		 }
		 else{
			 System.out.println("Please Deposit 100 or more than 100 rupees");
		 }
         break;
          		 
		 case 'b':
		 System.out.println("You select Check Balance");
		 System.out.println("Your Balance is Rs."+bal);
		 break;
		 
		 case 'p':
		 System.out.println("You select Pin Change\nEnter Your Link Moblie Number");
		 long mob=s.nextInt();
		 if(mob==1234567890) //if(mob>=1000000000 && mob<=9999999999);
		 {
			 System.out.println("Enter OTP");
			 int otp=s.nextInt();
			if(otp==1212)
			 {
				 System.out.println("Enter New Pin");
				 int npin=s.nextInt();
				 if(npin!=pin )
				 {
					 if( npin>999 && npin<=9999)
					 {
				      System.out.println("Pin Changed Successfully");
					 }
					 else{
						 System.out.println("Enter Pin only 4 digit numbers");
					 }
				 }
				 else
			     {
				 System.out.println("New pin and Old pin Should be different\nPlease try again");
			     } 
			 }
			 else
			 {
				 System.out.println("Please Enter Valid OTP");
			 }
		 }
		 else
		 {
			 System.out.println("Invalid Moblie Number\nPlease Enter Register Moblie Number");
		 }
		 break;
		
		 case 'e':
		 System.out.println("You Select Exit\nExit Successfully");	
         break;
         
        default:
        	System.out.println("Invalid Option");		
	 }
	}
	else
	{
		System.out.println("Invalid Pin");
	} 
	 }
  else
     {
		 System.out.println("Invalid Option");
	 }
	}
}

		
	
