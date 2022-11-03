public class Account {
	public int accno;
	public String accname;
	public int balance;
	
	Account(int accno, String accname, int balance){
		this.accno=accno;
		this.accname=accname;
		this.balance=balance;
	}
	
	public void withdraw(int amount) {
		System.out.println("orignal balance: "+balance);
		balance-=amount;
		System.out.println("balance after update: "+balance);
	}
	
	public void deposit(int amount) {
		System.out.println("orignal balance: "+balance);
		balance+=amount;
		System.out.println("balance after update: "+balance);
	}
	
	public void intrest() {
		System.out.println("orignal balance: "+balance);
		balance*=1.06;
		System.out.println("balance after update: "+balance);
	}
}
