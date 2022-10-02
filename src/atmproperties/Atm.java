package atmproperties;

public interface Atm {
	
	public void verify(int pinNumber);
	public void withdraw(double balance);
	public void deposit(double balance);
	public void showTranssactions(double balance);
	

}
