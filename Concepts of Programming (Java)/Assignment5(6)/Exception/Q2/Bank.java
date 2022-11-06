package ExceptionHandling2;

public class Bank {
	private int balance;
	
	public Bank(int balance) {
		this.balance=balance;
	}
	
	public void withdraw(int amount) throws InsufficientFundsException{
		if(amount>balance) {
			throw new InsufficientFundsException();
		}
		System.out.println("Transaction Successful!");
	}
}
