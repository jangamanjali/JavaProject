package atmproperties;

import java.util.Scanner;

public class AtmServices implements Atm {

	//private double balance=50000.0;
	//private int pinNumber;
	private double withdrawAmount;
	private double depositAmount;
	public AtmServices()
	{
		
	}
	
	public AtmServices(double withdrawAmount, double depositAmount) {
		super();
		this.withdrawAmount = withdrawAmount;
		this.depositAmount = depositAmount;
		//this.pinNumber= pinNumber;
	}
	/*
	public int getPinNumber() {
		return pinNumber;
	}
	
	public void setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
	}
	*/
	public double getWithdrawAmount() {
		return withdrawAmount;
	}

	public void setWithdrawAmount(double withdrawAmount) {
		this.withdrawAmount = withdrawAmount;
	}

	public double getDepositAmount() {
		return depositAmount;
	}

	public void setDepositAmount(double depositAmount) {
		this.depositAmount = depositAmount;
	}

	@Override
	public void verify(int pinNumber) {
		
		
	}
	
	
	@Override
	public void withdraw(double balance) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Amount to Withdraw");
		withdrawAmount= sc.nextInt();
		if(withdrawAmount<=balance)
		{
			System.out.println("Now you have "+(balance-withdrawAmount)+" Rs/- in your Account");
			System.out.println("Collect Your Money :)");
		}
		else
		{
			System.out.println("Unsufficient Balance");
		}	
		
	}

	@Override
	public void deposit(double balance) {
		System.out.println("Your Bank Balance : "+balance);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Amount to Deposit");
		depositAmount= sc.nextInt();
		System.out.println(balance=balance+depositAmount);
		System.out.println("Now you have "+balance+"Rs/- in your Account");
		
	}

	@Override
	public void showTranssactions(double balance) {
		System.out.println("Your Bank Balance : "+balance);
		System.out.println("Withdrawal recently:" +withdrawAmount);
		System.out.println("Deposited recently:" +depositAmount);
		
	}
}
