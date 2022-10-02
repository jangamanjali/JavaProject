package atmproperties;

import java.util.Scanner;

public class AtmApplication {
	
	private long accNumber;
	private String accType;
	private String atmType;
	private String name;
	private int contact;
	private boolean contactStatus;
	private long aadharNumber;
	private boolean aadharStatus; 
	
	AtmApplication()
	{
		
	}
	
	Scanner sc = new Scanner(System.in);
	
	
	public String atmApplication() {
		
		System.out.println();
		System.out.println("Enter Account Number");
		accNumber = sc.nextLong();
		System.out.println("Enter Account Type");
		accType = sc.next();
		System.out.println("Enter ATM Type");
		atmType = sc.next();
		System.out.println("Enter Account Holder Name");
		name = sc.next();
		System.out.println("Enter Contact Number");
		contact = sc.nextInt();
		System.out.println("Enter AddharCard Number");
		aadharNumber = sc.nextLong();
		System.out.println("Applied Successfully!!!");
		return "Proceed For Transactions :)";
		
		
	}
	
	public void viewApplication()
	{
		System.out.println("Account Number : "+accNumber);
		System.out.println("Account Type : "+accType);
		System.out.println("ATM Type : "+atmType);
		System.out.println("Account Holder Name : "+name);
		System.out.println("Contact Number : "+contact);
		System.out.println("AadharCard Number : "+aadharNumber);
	}
	
	public void cheakStatus()
	{
		
		System.out.println("Contact Number Status");
		contactStatus = sc.nextBoolean();
		
		System.out.println("Status AadharCard");
		aadharStatus = sc.nextBoolean();
		
		if(contactStatus==true  && aadharStatus==true)
		{
			System.out.println("Please Fill Given Form.");
			System.out.print(atmApplication());
		}
		else
		{
			System.out.println("Please Link Mobile Number Or Addhar Number to Your Account.");
		}
	}

}
