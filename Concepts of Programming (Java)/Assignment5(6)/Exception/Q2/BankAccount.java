package ExceptionHandling2;

public class BankAccount {
	public static void main(String[] args) {
		Bank bank = new Bank(500);
		
		try {
			bank.withdraw(600);
		} catch (InsufficientFundsException e) {
			System.out.println(e.getMessage());
		}
	}
}
