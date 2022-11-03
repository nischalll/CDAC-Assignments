package BankAccount;

public class CheckingAccount extends BankAccount{
	public int fee;

	CheckingAccount(int accountNumber, int totalBalance) {
		super(accountNumber, totalBalance);
	}

	public void deductFee(int fee){
		totalBalance-=fee;
	}
}
