package BankAccount;

public class BankAccount {
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
}

