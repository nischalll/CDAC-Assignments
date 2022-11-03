package BankAccount;

public class SavingAccount extends BankAccount {
	public int intrestRate;

	SavingAccount(int accountNumber, int totalBalance){
		super(accountNumber,totalBalance);
	}
	public void addInterest(int intrest) {
		totalBalance += intrest;
	}
}
