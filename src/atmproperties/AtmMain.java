package atmproperties;

import java.util.Scanner;

public class AtmMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Customer wants Atm Card");
		int cust =sc.nextInt();
		AtmApplication atmapplication[] = new AtmApplication[cust];
		for(int i=0;i<atmapplication.length;i++)
		{
			atmapplication[i] = new AtmApplication();
			atmapplication[i].cheakStatus();
			//atmapplication[i].atmApplication();
			System.out.println("===========================================================================================");
			
		}
		
	
		boolean condition=true;
		while(condition=true)
		{
			System.out.println("Enter Your Choice :");
			System.out.println("Choose 1 to view Application");
			System.out.println("Choose 2 for ATM transaction.");
			System.out.println("Choose 4 to exit!");
			
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				for(int i=0;i<atmapplication.length;i++)
				{
					atmapplication[i].viewApplication();
					System.out.println("===========================================================================================");
				}
				break;
			
			case 2:
			//AtmServices atmservices =new  AtmServices();
			System.out.println("Enter Atm pin");
			String atmpinCode = sc.next();
			AtmServices atmservices[] = new AtmServices[cust];
			for(int i=0;i<atmservices.length;i++)
			{
				atmservices[i] = new AtmServices();
				new AtmApplication().viewApplication();
				System.out.println("===========================================================================================");
				
			}
			
			if(atmpinCode.equals("2323"))
			{
				boolean condition1=true;
				while(condition1=true)
				{
					
					System.out.println("....ATM Services....");
					System.out.println("===========================================================================================");
					
					System.out.println("Enter Your Choice :");
					System.out.println("Choose 1 for Withdraw Amount");
					System.out.println("Choose 2 for Deposit Amount");
					System.out.println("Choose 3 for transaction history");
					System.out.println("Choose 4 to exit!");
					
					int choice1 = sc.nextInt();
					switch(choice1)
					{
			
						case 1:
							//new AtmServices().withdraw(50000.0);
							for(int i=0;i<atmservices.length;i++)
							{
								atmservices[i].withdraw(50000.0);
								System.out.println("===========================================================================================");
							}
							break;
						case 2:
							//new AtmServices().deposit(50000.0);
							for(int i=0;i<atmservices.length;i++)
							{
								atmservices[i].deposit(50000.0);
								System.out.println("===========================================================================================");
							}
							break;
							
						case 3:
							//new AtmServices().showTranssactions(50000.0);
							for(int i=0;i<atmservices.length;i++)
							{
								atmservices[i].showTranssactions(50000.0);
								System.out.println("===========================================================================================");
							}
							break;
						
						case 4:
							System.out.println("See You On Next Transaction :) ");
							System.exit(choice);
							break;
							
					}
				}//while condition1
			}//if
			else
			{
				System.out.println("Incorrect Pin!!!");
			}
			break;
			
			case 3:
				System.out.println("Thak you for visiting us..:)");
				System.out.println("We are happy to see you again here..");
				System.exit(0);
				break;
			}//switch(choice)
		}//while condition
	}//psvm
}//main
