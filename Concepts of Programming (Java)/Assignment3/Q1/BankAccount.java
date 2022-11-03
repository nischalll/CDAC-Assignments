package BankAccount;

public class BankAccount implements CreditCard {
	public int accountNumber;
	public int totalBalance;

	BankAccount(int accountNumber, int totalBalance){
		this.accountNumber=accountNumber;
		this.totalBalance=totalBalance;
	}

	public void deposit(int amount){
		totalBalance+=amount;
		System.out.println("amount deposited: "+amount);
	}

	public void withdraw(int amount){
		totalBalance-=amount;
		System.out.println("amount withdrawn: "+amount);
	}

	public int getTotalBalance(){
		return totalBalance;
	}
	public void printAccount(){
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Total Balance: "+totalBalance);
	}

	@Override
	public void rupees() {
		System.out.println("rupees credit card");
	}

	@Override
	public void dollars() {
		System.out.println("dollars credit card");
	}

	@Override
	public void pounds() {
		System.out.println("pounds credit card");
	}
}

